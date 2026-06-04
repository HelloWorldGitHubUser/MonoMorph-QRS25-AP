package com.coveros.training.persistence;
import com.coveros.training.library.domainobjects.Book;
import com.coveros.training.library.domainobjects.Borrower;
import com.coveros.training.library.domainobjects.Loan;
import java.sql.Date;
import java.util.List;
import java.util.Optional;
public interface IPersistenceLayer {


public void deleteBorrower(long id)
;

public Optional<Book> searchBooksByTitle(String bookTitle)
;

public Optional<List<Loan>> searchForLoanByBorrower(Borrower borrower)
;

public void deleteBook(long id)
;

public long saveNewBorrower(String borrowerName)
;

public long createLoan(Book book,Borrower borrower,Date borrowDate)
;

public void runBackup(String backupFileName)
;

public Optional<Borrower> searchBorrowersById(long id)
;

public void runRestore(String backupFileName)
;

public Optional<Loan> searchForLoanByBook(Book book)
;

public void cleanAndMigrateDatabase()
;


public boolean isEmpty()
;

public Optional<List<Book>> listAllBooks()
;

public Optional<List<Borrower>> listAllBorrowers()
;

public Optional<Book> searchBooksById(long id)
;

public void updateBorrower(long id,String borrowerName)
;

public void migrateDatabase()
;

public long saveNewBook(String bookTitle)
;

public void cleanDatabase()
;

public Optional<List<Book>> listAvailableBooks()
;





public Optional<Borrower> searchBorrowerDataByName(String borrowerName)
;

public Optional<String> getBorrowerName(long id)
;

public Optional<Boolean> areCredentialsValid(String username,String password)
;

}
