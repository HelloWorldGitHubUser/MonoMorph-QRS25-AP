package com.coveros.training.library;
 import com.coveros.training.library.domainobjects.Book;
import com.coveros.training.library.domainobjects.Borrower;
import com.coveros.training.library.domainobjects.LibraryActionResults;
import com.coveros.training.library.domainobjects.Loan;
import com.coveros.training.persistence.IPersistenceLayer;
import com.coveros.training.persistence.PersistenceLayer;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.List;
public class BookCheckOutStepDefs {

 public  String ANOTHER_BOOK;

 private  Book myBook;

 private  String myBookTitle;

 private  String myBorrowerName;

 private  Borrower myBorrower;

 private  Date JAN_1ST;

 private  LibraryUtils libraryUtils;

 private  Date JAN_2ND;

 private  LibraryActionResults libraryActionResults;

 private  IPersistenceLayer pl;


@Then("^the system indicates that they are not registered$")
public void theSystemIndicatesThatHeIsNotRegistered(){
    Assert.assertEquals(LibraryActionResults.BORROWER_NOT_REGISTERED, libraryActionResults);
}


@Given("a borrower, {string}, has one book, {string}, already borrowed")
public void a_borrower_has_one_book_already_borrowed(String borrowerName,String bookTitle){
    initializeEmptyDatabaseAndUtility();
    myBookTitle = bookTitle;
    myBorrowerName = borrowerName;
    libraryUtils.registerBook(myBookTitle);
    libraryUtils.registerBorrower(borrowerName);
    libraryUtils.lendBook(bookTitle, borrowerName, JAN_1ST);
}


@Given("^and a book, \"([^\"]*)\" is already checked out to \"([^\"]*)\"$")
public void andABookIsAlreadyCheckedOutTo(String title,String borrower_b){
    libraryUtils.registerBorrower(borrower_b);
    libraryUtils.registerBook(title);
    final Book book = libraryUtils.searchForBookByTitle(title);
    final Borrower borrower = libraryUtils.searchForBorrowerByName(borrower_b);
    // a previous person already checked it out.
    libraryUtils.lendBook(book, borrower, JAN_1ST);
    // now we try to check it out.  It should indicate BOOK_CHECKED_OUT.
    libraryActionResults = libraryUtils.lendBook(book, myBorrower, JAN_2ND);
}


public void initializeEmptyDatabaseAndUtility(){
    pl.cleanAndMigrateDatabase();
    libraryUtils = new LibraryUtils();
}


@Given("^a borrower, \"([^\"]*)\", is registered$")
public void aBorrowerIsRegistered(String borrowerName){
    initializeEmptyDatabaseAndUtility();
    libraryUtils.registerBorrower(borrowerName);
    myBorrower = libraryUtils.searchForBorrowerByName(borrowerName);
}


@Then("^the system indicates that the book is not available$")
public void theSystemIndicatesThatTheBookIsNotAvailable(){
    Assert.assertEquals(LibraryActionResults.BOOK_CHECKED_OUT, libraryActionResults);
}


@When("another borrower, {string} tries to borrow that book")
public void another_borrower_tries_to_borrow_that_book(String string){
    libraryUtils.registerBorrower("someone else");
    libraryActionResults = libraryUtils.lendBook(myBookTitle, "someone else", JAN_1ST);
}


@Given("^an individual, \"([^\"]*)\", is not registered$")
public void anIndividualIsNotRegistered(String borrower){
    initializeEmptyDatabaseAndUtility();
}


@When("they borrow another book")
public void they_borrow_another_book(){
    libraryUtils.registerBook(ANOTHER_BOOK);
    libraryUtils.lendBook(ANOTHER_BOOK, myBorrowerName, JAN_1ST);
}


@Then("^the system indicates the book is loaned to them on that date$")
public void theSystemIndicatesTheBookIsLoanedToThemOnThatDate(){
    final Loan loan = libraryUtils.searchForLoanByBook(myBook);
    Assert.assertEquals(Date.valueOf("2018-01-31"), loan.checkoutDate);
}


@When("^they try to check out the book on \"([^\"]*)\"$")
public void theyTryToCheckOutTheBookOn(String date){
    Date borrowTime = Date.valueOf(LocalDate.parse(date, DateTimeFormatter.ofPattern("MMMM dd, yyyy")));
    libraryUtils.lendBook(myBook, myBorrower, borrowTime);
}


@When("^they try to check out a book, \"([^\"]*)\" that is available$")
public void theyTryToCheckOutABookThatIsAvailable(String title){
    libraryUtils.registerBook(title);
    myBook = libraryUtils.searchForBookByTitle(title);
    libraryActionResults = libraryUtils.lendBook(myBook, myBorrower, JAN_2ND);
}


@When("^they try to check out the book$")
public void theyCheckOutTheBook(){
    libraryUtils.lendBook(myBook, myBorrower, JAN_2ND);
}


@Then("^the system indicates the book is loaned to them on some date$")
public void theSystemIndicatesTheBookIsLoanedToThemOnSomeDate(){
    final Loan loan = libraryUtils.searchForLoanByBook(myBook);
    Assert.assertEquals(Date.valueOf("2018-01-31"), loan.checkoutDate);
}


@Then("they cannot borrow it because it is already checked out")
public void they_cannot_borrow_it_because_it_is_already_checked_out(){
    Assert.assertEquals(LibraryActionResults.BOOK_CHECKED_OUT, libraryActionResults);
}


@Then("they have two books currently borrowed")
public void they_have_two_books_currently_borrowed(){
    final Borrower borrower = libraryUtils.searchForBorrowerByName(myBorrowerName);
    final List<Loan> loans = libraryUtils.searchForLoanByBorrower(borrower);
    Assert.assertEquals(2, loans.size());
}


@And("^a book, \"([^\"]*)\" is available for borrowing$")
public void aBookIsAvailableForBorrowing(String title){
    libraryUtils.registerBook(title);
    myBook = libraryUtils.searchForBookByTitle(title);
}


}