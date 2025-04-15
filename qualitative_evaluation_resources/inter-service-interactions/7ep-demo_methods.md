# 7ep-demo
## authentication
### Potential inter-service method interactions
- com.coveros.training.cartesianproduct.CartesianProductStepDefs::weCalculateTheCombinations() -> com.coveros.training.cartesianproduct.CartesianProduct::calculate(java.util.Set)

- com.coveros.training.expenses.AlcoholStepDefs::iCalculateTheAlcoholRelatedPortion() -> com.coveros.training.expenses.AlcoholCalculator::calculate(com.coveros.training.expenses.DinnerPrices)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::aBookIsLoanedOut(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::aBookIsLoanedOut(java.lang.String) -> com.coveros.training.library.LibraryUtils::lendBook(java.lang.String,java.lang.String,java.sql.Date)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::aBookIsLoanedOut(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::aBookIsCurrentlyLoanedOut(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::aBookIsCurrentlyLoanedOut(java.lang.String) -> com.coveros.training.library.LibraryUtils::lendBook(java.lang.String,java.lang.String,java.sql.Date)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::aBookIsCurrentlyLoanedOut(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::aBookIsCurrentlyLoanedOutTo(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::aBookIsCurrentlyLoanedOutTo(java.lang.String) -> com.coveros.training.library.LibraryUtils::lendBook(java.lang.String,java.lang.String,java.sql.Date)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::aBookIsCurrentlyLoanedOutTo(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_registers_that_borrower() -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::the_system_does_not_have_the_borrower_registered() -> com.coveros.training.library.domainobjects.Borrower::isEmpty()

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::the_system_does_not_have_the_borrower_registered() -> com.coveros.training.library.LibraryUtils::searchForBorrowerByName(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_searches_by_its_id() -> com.coveros.training.library.LibraryUtils::searchForBookById(long)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_searches_for_a_borrower_by_id(java.lang.Integer) -> com.coveros.training.library.LibraryUtils::searchForBorrowerById(long)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::the_system_does_not_have_the_book_registered() -> com.coveros.training.library.domainobjects.Book::isEmpty()

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::the_system_does_not_have_the_book_registered() -> com.coveros.training.library.LibraryUtils::searchForBookByTitle(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_searches_for_a_borrower_by_name_of(java.lang.String) -> com.coveros.training.library.LibraryUtils::searchForBorrowerByName(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::the_system_reports_that_there_are_no_borrowers_found_with_that_name() -> com.coveros.training.library.domainobjects.Borrower::isEmpty()

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_library_with_the_following_books_registered() -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_searches_for_a_book_by_id(java.lang.Integer) -> com.coveros.training.library.LibraryUtils::searchForBookById(long)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_lists_all_the_registered_books() -> com.coveros.training.library.LibraryUtils::listAllBooks()

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_lists_the_available_books() -> com.coveros.training.library.LibraryUtils::listAvailableBooks()

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_searches_for_a_book_by_title_of(java.lang.String) -> com.coveros.training.library.LibraryUtils::searchForBookByTitle(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_lists_all_the_borrowers() -> com.coveros.training.library.LibraryUtils::listAllBorrowers()

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_searches_by_that_id() -> com.coveros.training.library.LibraryUtils::searchForBorrowerById(long)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_searches_by_that_id() -> com.coveros.training.library.LibraryUtils::searchForBorrowerByName(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_searches_by_that_name() -> com.coveros.training.library.LibraryUtils::searchForBorrowerByName(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_lists_all_the_registered_borrowers() -> com.coveros.training.library.LibraryUtils::listAllBorrowers()

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::some_books_are_checked_out() -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::some_books_are_checked_out() -> com.coveros.training.library.LibraryUtils::lendBook(java.lang.String,java.lang.String,java.sql.Date)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::some_books_are_checked_out() -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::the_system_returns_an_empty_result_for_the_book() -> com.coveros.training.library.domainobjects.Book::isEmpty()

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::the_system_reports_that_there_are_no_borrowers_with_that_id() -> com.coveros.training.library.domainobjects.Borrower::isEmpty()

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_deletes_that_borrower() -> com.coveros.training.library.LibraryUtils::deleteBorrower(com.coveros.training.library.domainobjects.Borrower)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_book_is_currently_registered_in_the_system(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_book_is_currently_registered_in_the_system(java.lang.String) -> com.coveros.training.library.LibraryUtils::searchForBookByTitle(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::aBookIsLoanedTo(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::aBookIsLoanedTo(java.lang.String) -> com.coveros.training.library.LibraryUtils::lendBook(java.lang.String,java.lang.String,java.sql.Date)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::aBookIsLoanedTo(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::aBookIsLoanedTo(java.lang.String) -> com.coveros.training.library.LibraryUtils::searchForBookByTitle(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::the_system_has_the_borrower_registered() -> com.coveros.training.library.LibraryUtils::searchForBorrowerByName(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_searches_by_that_title() -> com.coveros.training.library.LibraryUtils::searchForBookByTitle(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_registers_that_book() -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_registers_that_book() -> com.coveros.training.library.LibraryUtils::searchForBookByTitle(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_library_with_the_following_borrowers_registered() -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::the_system_returns_an_empty_result_for_the_borrower() -> com.coveros.training.library.domainobjects.Borrower::isEmpty()

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_borrower_is_currently_registered_in_the_system(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::theLoanIsDeletedAsWell() -> com.coveros.training.library.domainobjects.Loan::isEmpty()

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::theLoanIsDeletedAsWell() -> com.coveros.training.library.LibraryUtils::searchForLoanByBook(com.coveros.training.library.domainobjects.Book)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_deletes_that_book() -> com.coveros.training.library.LibraryUtils::deleteBook(com.coveros.training.library.domainobjects.Book)

- com.coveros.training.library.BookCheckOutStepDefs::another_borrower_tries_to_borrow_that_book(java.lang.String) -> com.coveros.training.library.LibraryUtils::lendBook(java.lang.String,java.lang.String,java.sql.Date)

- com.coveros.training.library.BookCheckOutStepDefs::another_borrower_tries_to_borrow_that_book(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::they_borrow_another_book() -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::they_borrow_another_book() -> com.coveros.training.library.LibraryUtils::lendBook(java.lang.String,java.lang.String,java.sql.Date)

- com.coveros.training.library.BookCheckOutStepDefs::theSystemIndicatesTheBookIsLoanedToThemOnThatDate() -> com.coveros.training.library.LibraryUtils::searchForLoanByBook(com.coveros.training.library.domainobjects.Book)

- com.coveros.training.library.BookCheckOutStepDefs::aBorrowerIsRegistered(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::aBorrowerIsRegistered(java.lang.String) -> com.coveros.training.library.LibraryUtils::searchForBorrowerByName(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::theyTryToCheckOutABookThatIsAvailable(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::theyTryToCheckOutABookThatIsAvailable(java.lang.String) -> com.coveros.training.library.LibraryUtils::lendBook(com.coveros.training.library.domainobjects.Book,com.coveros.training.library.domainobjects.Borrower,java.sql.Date)

- com.coveros.training.library.BookCheckOutStepDefs::theyTryToCheckOutABookThatIsAvailable(java.lang.String) -> com.coveros.training.library.LibraryUtils::searchForBookByTitle(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::aBookIsAvailableForBorrowing(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::aBookIsAvailableForBorrowing(java.lang.String) -> com.coveros.training.library.LibraryUtils::searchForBookByTitle(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::a_borrower_has_one_book_already_borrowed(java.lang.String,java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::a_borrower_has_one_book_already_borrowed(java.lang.String,java.lang.String) -> com.coveros.training.library.LibraryUtils::lendBook(java.lang.String,java.lang.String,java.sql.Date)

- com.coveros.training.library.BookCheckOutStepDefs::a_borrower_has_one_book_already_borrowed(java.lang.String,java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::andABookIsAlreadyCheckedOutTo(java.lang.String,java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::andABookIsAlreadyCheckedOutTo(java.lang.String,java.lang.String) -> com.coveros.training.library.LibraryUtils::lendBook(com.coveros.training.library.domainobjects.Book,com.coveros.training.library.domainobjects.Borrower,java.sql.Date)

- com.coveros.training.library.BookCheckOutStepDefs::andABookIsAlreadyCheckedOutTo(java.lang.String,java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::andABookIsAlreadyCheckedOutTo(java.lang.String,java.lang.String) -> com.coveros.training.library.LibraryUtils::searchForBorrowerByName(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::andABookIsAlreadyCheckedOutTo(java.lang.String,java.lang.String) -> com.coveros.training.library.LibraryUtils::searchForBookByTitle(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::theSystemIndicatesTheBookIsLoanedToThemOnSomeDate() -> com.coveros.training.library.LibraryUtils::searchForLoanByBook(com.coveros.training.library.domainobjects.Book)

- com.coveros.training.library.BookCheckOutStepDefs::theyCheckOutTheBook() -> com.coveros.training.library.LibraryUtils::lendBook(com.coveros.training.library.domainobjects.Book,com.coveros.training.library.domainobjects.Borrower,java.sql.Date)

- com.coveros.training.library.BookCheckOutStepDefs::theyTryToCheckOutTheBookOn(java.lang.String) -> com.coveros.training.library.LibraryUtils::lendBook(com.coveros.training.library.domainobjects.Book,com.coveros.training.library.domainobjects.Borrower,java.sql.Date)

- com.coveros.training.library.BookCheckOutStepDefs::they_have_two_books_currently_borrowed() -> com.coveros.training.library.LibraryUtils::searchForLoanByBorrower(com.coveros.training.library.domainobjects.Borrower)

- com.coveros.training.library.BookCheckOutStepDefs::they_have_two_books_currently_borrowed() -> com.coveros.training.library.LibraryUtils::searchForBorrowerByName(java.lang.String)

- com.coveros.training.math.AckermannStepDefs::i_calculate_ackermann_s_formula_using_and(int,int) -> com.coveros.training.mathematics.Ackermann::calculate(int,int)

- com.coveros.training.math.FibonacciStepDefs::i_calculate_the(java.lang.Integer) -> com.coveros.training.mathematics.Fibonacci::calculate(long)

### Potential Test inter-service method interactions
- com.coveros.training.library.domainobjects.BookTests::testCanCreateEmpty() -> com.coveros.training.library.domainobjects.Book::isEmpty()

- com.coveros.training.library.domainobjects.BookTests::testCanCreateEmpty() -> com.coveros.training.library.domainobjects.Book::createEmpty()

- com.coveros.training.library.domainobjects.BookTests::testShouldOutputGoodString() -> com.coveros.training.library.domainobjects.Book::toString()

- com.coveros.training.library.domainobjects.BorrowerTests::testCanCreateEmpty() -> com.coveros.training.library.domainobjects.Borrower::isEmpty()

- com.coveros.training.library.domainobjects.BorrowerTests::testCanCreateEmpty() -> com.coveros.training.library.domainobjects.Borrower::createEmpty()

- com.coveros.training.library.domainobjects.BorrowerTests::testShouldOutputGoodString() -> com.coveros.training.library.domainobjects.Borrower::toString()

- com.coveros.training.library.domainobjects.BorrowerTests::testShouldReturnJsonString() -> com.coveros.training.library.domainobjects.Borrower::toOutputString()

- com.coveros.training.library.domainobjects.LoanTests::testCanCreateEmpty() -> com.coveros.training.library.domainobjects.Loan::isEmpty()

- com.coveros.training.library.domainobjects.LoanTests::testCanCreateEmpty() -> com.coveros.training.library.domainobjects.Loan::createEmpty()

- com.coveros.training.library.domainobjects.LoanTests::testShouldOutputGoodString() -> com.coveros.training.library.domainobjects.Loan::toString()

- com.coveros.training.library.LendingTests::testShouldNotLendIfBookNotRegistered() -> com.coveros.training.library.domainobjects.Book::createEmpty()

- com.coveros.training.library.LendingTests::testShouldNotLendIfBookNotRegistered() -> com.coveros.training.library.LibraryUtils::lendBook(com.coveros.training.library.domainobjects.Book,com.coveros.training.library.domainobjects.Borrower,java.sql.Date)

- com.coveros.training.library.LendingTests::mockThatBookNotRegistered(java.lang.String) -> com.coveros.training.library.domainobjects.Book::createEmpty()

- com.coveros.training.library.LendingTests::shouldRegisterBorrower() -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.LendingTests::shouldRegisterBook() -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.LendingTests::mockSearchForLoan() -> com.coveros.training.library.domainobjects.Loan::createEmpty()

- com.coveros.training.library.LendingTests::testShouldNotLendIfBorrowerNotRegistered() -> com.coveros.training.library.domainobjects.Borrower::createEmpty()

- com.coveros.training.library.LendingTests::testShouldNotLendIfBorrowerNotRegistered() -> com.coveros.training.library.LibraryUtils::lendBook(com.coveros.training.library.domainobjects.Book,com.coveros.training.library.domainobjects.Borrower,java.sql.Date)

- com.coveros.training.library.LendingTests::mockBorrowerNotRegistered(java.lang.String) -> com.coveros.training.library.domainobjects.Borrower::createEmpty()

- com.coveros.training.library.LendingTests::shouldNotLendIfCurrentlyBorrowed() -> com.coveros.training.library.LibraryUtils::lendBook(com.coveros.training.library.domainobjects.Book,com.coveros.training.library.domainobjects.Borrower,java.sql.Date)

- com.coveros.training.library.LendingTests::shouldNotLendIfCurrentlyBorrowed() -> com.coveros.training.library.LibraryUtils::searchForLoanByBook(com.coveros.training.library.domainobjects.Book)

- com.coveros.training.library.LendingTests::shouldLendToUser() -> com.coveros.training.library.LibraryUtils::lendBook(com.coveros.training.library.domainobjects.Book,com.coveros.training.library.domainobjects.Borrower,java.sql.Date)

- com.coveros.training.library.LibraryBookListAvailableServletTests::testListAvailableBooks_MultipleBook() -> com.coveros.training.library.LibraryBookListAvailableServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBookListAvailableServletTests::testListAvailableBooks_MultipleBook() -> com.coveros.training.library.LibraryUtils::listAvailableBooks()

- com.coveros.training.library.LibraryBookListAvailableServletTests::testListAvailableBooks_OneBook() -> com.coveros.training.library.LibraryBookListAvailableServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBookListAvailableServletTests::testListAvailableBooks_OneBook() -> com.coveros.training.library.LibraryUtils::listAvailableBooks()

- com.coveros.training.library.LibraryBookListAvailableServletTests::testSearchNoBooks() -> com.coveros.training.library.LibraryBookListAvailableServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBookListAvailableServletTests::testListAvailableBooks_EmptyList() -> com.coveros.training.library.LibraryBookListAvailableServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchById_noBookFound() -> com.coveros.training.library.domainobjects.Book::createEmpty()

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchById_noBookFound() -> com.coveros.training.library.LibraryBookListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchById_noBookFound() -> com.coveros.training.library.LibraryUtils::searchForBookById(long)

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchNoBooks() -> com.coveros.training.library.LibraryBookListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchNothingFoundById() -> com.coveros.training.library.domainobjects.Book::createEmpty()

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchNothingFoundById() -> com.coveros.training.library.LibraryBookListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchNothingFoundById() -> com.coveros.training.library.LibraryUtils::searchForBookById(long)

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchByTitle() -> com.coveros.training.library.LibraryBookListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchByTitle() -> com.coveros.training.library.LibraryUtils::searchForBookByTitle(java.lang.String)

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchIdAndTitle() -> com.coveros.training.library.LibraryBookListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBookListSearchServletTests::testListAllBooks() -> com.coveros.training.library.LibraryBookListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBookListSearchServletTests::testListAllBooks() -> com.coveros.training.library.LibraryUtils::listAllBooks()

- com.coveros.training.library.LibraryBookListSearchServletTests::testListAllBooks_NoBooksInDatabase() -> com.coveros.training.library.LibraryBookListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchById() -> com.coveros.training.library.LibraryBookListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchById() -> com.coveros.training.library.LibraryUtils::searchForBookById(long)

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchNothingFoundByTitle() -> com.coveros.training.library.domainobjects.Book::createEmpty()

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchNothingFoundByTitle() -> com.coveros.training.library.LibraryBookListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchNothingFoundByTitle() -> com.coveros.training.library.LibraryUtils::searchForBookByTitle(java.lang.String)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchByNameNotFound() -> com.coveros.training.library.domainobjects.Borrower::createEmpty()

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchByNameNotFound() -> com.coveros.training.library.LibraryBorrowerListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchByNameNotFound() -> com.coveros.training.library.LibraryUtils::searchForBorrowerByName(java.lang.String)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchByName() -> com.coveros.training.library.LibraryBorrowerListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchByName() -> com.coveros.training.library.LibraryUtils::searchForBorrowerByName(java.lang.String)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchByBadId() -> com.coveros.training.library.LibraryBorrowerListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchByBadId() -> com.coveros.training.library.LibraryUtils::searchForBorrowerById(long)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchNothingFoundByName() -> com.coveros.training.library.domainobjects.Borrower::createEmpty()

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchNothingFoundByName() -> com.coveros.training.library.LibraryBorrowerListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchNothingFoundByName() -> com.coveros.training.library.LibraryUtils::searchForBorrowerByName(java.lang.String)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchNoBorrowers() -> com.coveros.training.library.LibraryBorrowerListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchNothingFoundById() -> com.coveros.training.library.domainobjects.Borrower::createEmpty()

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchNothingFoundById() -> com.coveros.training.library.LibraryBorrowerListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchNothingFoundById() -> com.coveros.training.library.LibraryUtils::searchForBorrowerById(long)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchIdAndName() -> com.coveros.training.library.LibraryBorrowerListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testListAllBorrowers() -> com.coveros.training.library.LibraryBorrowerListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testListAllBorrowers() -> com.coveros.training.library.LibraryUtils::listAllBorrowers()

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testListAllBorrowers_noBorrowersExist() -> com.coveros.training.library.LibraryBorrowerListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchById() -> com.coveros.training.library.domainobjects.Borrower::createEmpty()

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchById() -> com.coveros.training.library.LibraryBorrowerListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchById() -> com.coveros.training.library.LibraryUtils::searchForBorrowerById(long)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchBorrowerFoundById() -> com.coveros.training.library.LibraryBorrowerListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchBorrowerFoundById() -> com.coveros.training.library.LibraryUtils::searchForBorrowerById(long)

- com.coveros.training.library.LibraryLendServletTests::testHappyPathPost() -> com.coveros.training.library.LibraryLendServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryLendServletTests::testHappyPathPost() -> com.coveros.training.library.LibraryUtils::lendBook(java.lang.String,java.lang.String,java.sql.Date)

- com.coveros.training.library.LibraryLendServletTests::testEmptyString_Book() -> com.coveros.training.library.LibraryLendServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryLendServletTests::testDateFunction() -> com.coveros.training.library.LibraryLendServlet::getDateNow()

- com.coveros.training.library.LibraryLendServletTests::testEmptyString_Borrower() -> com.coveros.training.library.LibraryLendServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryRegisterBookServletTests::testHappyPathPost() -> com.coveros.training.library.LibraryRegisterBookServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryRegisterBookServletTests::testHappyPathPost() -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.LibraryRegisterBookServletTests::testEmptyString() -> com.coveros.training.library.LibraryRegisterBookServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryRegisterBorrowerServletTests::testHappyPathPost() -> com.coveros.training.library.LibraryRegisterBorrowerServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryRegisterBorrowerServletTests::testHappyPathPost() -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.LibraryRegisterBorrowerServletTests::testEmptyString() -> com.coveros.training.library.LibraryRegisterBorrowerServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryUtilsTests::testCanLendBook_wrapperMethod() -> com.coveros.training.library.domainobjects.Loan::createEmpty()

- com.coveros.training.library.LibraryUtilsTests::testCanLendBook_wrapperMethod() -> com.coveros.training.library.LibraryUtils::lendBook(java.lang.String,java.lang.String,java.sql.Date)

- com.coveros.training.library.LibraryUtilsTests::testShouldThrowExceptionWhenSearchingWithEmptyStringAsBookTitle() -> com.coveros.training.library.LibraryUtils::searchForBookByTitle(java.lang.String)

- com.coveros.training.library.LibraryUtilsTests::testCanRegisterBorrower() -> com.coveros.training.library.domainobjects.Borrower::createEmpty()

- com.coveros.training.library.LibraryUtilsTests::testCanRegisterBorrower() -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.LibraryUtilsTests::testCanSearchForBooksById() -> com.coveros.training.library.LibraryUtils::searchForBookById(long)

- com.coveros.training.library.LibraryUtilsTests::testCanSearchForLoanByBook() -> com.coveros.training.library.LibraryUtils::searchForLoanByBook(com.coveros.training.library.domainobjects.Book)

- com.coveros.training.library.LibraryUtilsTests::testCanRegisterBook() -> com.coveros.training.library.domainobjects.Book::createEmpty()

- com.coveros.training.library.LibraryUtilsTests::testCanRegisterBook() -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.LibraryUtilsTests::testCannotDeleteNonRegisteredBook() -> com.coveros.training.library.LibraryUtils::deleteBook(com.coveros.training.library.domainobjects.Book)

- com.coveros.training.library.LibraryUtilsTests::testCanCreateEmpty() -> com.coveros.training.library.LibraryUtils::createEmpty()

- com.coveros.training.library.LibraryUtilsTests::testCanCreateEmpty() -> com.coveros.training.library.LibraryUtils::isEmpty()

- com.coveros.training.library.LibraryUtilsTests::testCanLendBook() -> com.coveros.training.library.domainobjects.Loan::createEmpty()

- com.coveros.training.library.LibraryUtilsTests::testCanLendBook() -> com.coveros.training.library.LibraryUtils::lendBook(com.coveros.training.library.domainobjects.Book,com.coveros.training.library.domainobjects.Borrower,java.sql.Date)

- com.coveros.training.library.LibraryUtilsTests::testCannotDeleteNonRegisteredBorrower() -> com.coveros.training.library.LibraryUtils::deleteBorrower(com.coveros.training.library.domainobjects.Borrower)

- com.coveros.training.library.LibraryUtilsTests::testShouldThrowExceptionWhenSearchingWithLessThanOneAsBookId() -> com.coveros.training.library.LibraryUtils::searchForBookById(long)

- com.coveros.training.library.LibraryUtilsTests::testCanDeleteBook() -> com.coveros.training.library.LibraryUtils::deleteBook(com.coveros.training.library.domainobjects.Book)

- com.coveros.training.library.LibraryUtilsTests::testCanSearchForBooksByTitle() -> com.coveros.training.library.LibraryUtils::searchForBookByTitle(java.lang.String)

- com.coveros.training.library.LibraryUtilsTests::testCanSearchForLoanByBorrower() -> com.coveros.training.library.LibraryUtils::searchForLoanByBorrower(com.coveros.training.library.domainobjects.Borrower)

- com.coveros.training.library.LibraryUtilsTests::testShouldListAvailableBooks() -> com.coveros.training.library.LibraryUtils::listAvailableBooks()

- com.coveros.training.library.LibraryUtilsTests::testCanSearchForBorrowerByName() -> com.coveros.training.library.LibraryUtils::searchForBorrowerByName(java.lang.String)

- com.coveros.training.library.LibraryUtilsTests::testCannotRegisterBookWithEmptyString() -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.LibraryUtilsTests::testShouldBeAbleToListAllBooks() -> com.coveros.training.library.LibraryUtils::listAllBooks()

- com.coveros.training.library.LibraryUtilsTests::testCanDeleteBorrower() -> com.coveros.training.library.LibraryUtils::deleteBorrower(com.coveros.training.library.domainobjects.Borrower)

- com.coveros.training.library.LibraryUtilsTests::testShouldBeAbleToListAllBorrowers() -> com.coveros.training.library.LibraryUtils::listAllBorrowers()

- com.coveros.training.mathematics.AckServletTests::testPostService_Forward() -> com.coveros.training.mathematics.AckServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.mathematics.AckServletTests::testPostService_HappyPath() -> com.coveros.training.mathematics.AckServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.mathematics.AckServletTests::testPostService_realForward_withException() -> com.coveros.training.mathematics.AckServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.mathematics.AckServletTests::testPostService_TailRecursive() -> com.coveros.training.mathematics.AckServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.mathematics.AckermannIterativeParameterizedTests::testCalculateIterative() -> com.coveros.training.mathematics.AckermannIterative::calculate(int,int)

- com.coveros.training.mathematics.AckermannParameterizedTests::testShouldProperlyCalculate() -> com.coveros.training.mathematics.Ackermann::calculate(int,int)

- com.coveros.training.mathematics.FibServletTests::testPostService_Forward() -> com.coveros.training.mathematics.FibServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.mathematics.FibServletTests::testPostService_tailRecursive1() -> com.coveros.training.mathematics.FibServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.mathematics.FibServletTests::testPostService_tailRecursive2() -> com.coveros.training.mathematics.FibServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.mathematics.FibServletTests::testPostService_HappyPath() -> com.coveros.training.mathematics.FibServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.mathematics.FibServletTests::testPostService_realForward_withException() -> com.coveros.training.mathematics.FibServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.mathematics.FibonacciParameterizedTests::test() -> com.coveros.training.mathematics.Fibonacci::calculate(long)

- com.coveros.training.mathematics.FibonacciParameterizedTests::testIterative2() -> com.coveros.training.mathematics.FibonacciIterative::fibAlgo2(int)

- com.coveros.training.mathematics.FibonacciParameterizedTests::testIterative1() -> com.coveros.training.mathematics.FibonacciIterative::fibAlgo1(long)

- com.coveros.training.mathematics.FibonacciTests::testLargerValuesFibAlgo2() -> com.coveros.training.mathematics.FibonacciIterative::fibAlgo2(int)

- com.coveros.training.mathematics.FibonacciTests::testSmallValuesFibAlgo1() -> com.coveros.training.mathematics.FibonacciIterative::fibAlgo1(long)

- com.coveros.training.mathematics.FibonacciTests::testLargerValuesFibAlgo1() -> com.coveros.training.mathematics.FibonacciIterative::fibAlgo1(long)

- com.coveros.training.mathematics.FibonacciTests::testSmallValuesFibAlgo2() -> com.coveros.training.mathematics.FibonacciIterative::fibAlgo2(int)

- com.coveros.training.mathematics.FibonacciTests::testLargeValuesFibAlgo1() -> com.coveros.training.mathematics.FibonacciIterative::fibAlgo1(long)

- com.coveros.training.mathematics.FibonacciTests::testLargeValuesFibAlgo2() -> com.coveros.training.mathematics.FibonacciIterative::fibAlgo2(int)

- com.coveros.training.mathematics.MathServletTests::testPostService_Forward() -> com.coveros.training.mathematics.MathServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.mathematics.MathServletTests::testPostService_HappyPath() -> com.coveros.training.mathematics.MathServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.mathematics.MathServletTests::testPostService_realForward_withException() -> com.coveros.training.mathematics.MathServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.persistence.DbServletTests::testClean() -> com.coveros.training.persistence.DbServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.persistence.DbServletTests::testCleanAndMigrate() -> com.coveros.training.persistence.DbServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.persistence.DbServletTests::testMigrate() -> com.coveros.training.persistence.DbServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)


## library
### Expected inter-service method interactions
- com.coveros.training.persistence.PersistenceLayer::deleteBorrower(long) -> com.coveros.training.helpers.CheckUtils::IntParameterMustBePositive(long)

- com.coveros.training.persistence.PersistenceLayer::deleteBook(long) -> com.coveros.training.helpers.CheckUtils::IntParameterMustBePositive(long)

- com.coveros.training.persistence.PersistenceLayer::saveNewBorrower(java.lang.String) -> com.coveros.training.helpers.CheckUtils::StringMustNotBeNullOrEmpty(java.lang.String[])

- com.coveros.training.persistence.PersistenceLayer::searchBorrowersById(long) -> com.coveros.training.helpers.CheckUtils::IntParameterMustBePositive(long)

- com.coveros.training.persistence.PersistenceLayer::updateBorrower(long,java.lang.String) -> com.coveros.training.helpers.CheckUtils::StringMustNotBeNullOrEmpty(java.lang.String[])

- com.coveros.training.persistence.PersistenceLayer::updateBorrower(long,java.lang.String) -> com.coveros.training.helpers.CheckUtils::IntParameterMustBePositive(long)

- com.coveros.training.persistence.PersistenceLayer::updateUserWithPassword(long,java.lang.String) -> com.coveros.training.helpers.CheckUtils::IntParameterMustBePositive(long)

- com.coveros.training.persistence.PersistenceLayer::getBorrowerName(long) -> com.coveros.training.helpers.CheckUtils::IntParameterMustBePositive(long)

- com.coveros.training.persistence.PersistenceLayer::searchBooksByTitle(java.lang.String) -> com.coveros.training.helpers.CheckUtils::StringMustNotBeNullOrEmpty(java.lang.String[])

- com.coveros.training.persistence.PersistenceLayer::saveNewUser(java.lang.String) -> com.coveros.training.helpers.CheckUtils::StringMustNotBeNullOrEmpty(java.lang.String[])

- com.coveros.training.persistence.PersistenceLayer::searchBooksById(long) -> com.coveros.training.helpers.CheckUtils::IntParameterMustBePositive(long)

- com.coveros.training.persistence.PersistenceLayer::saveNewBook(java.lang.String) -> com.coveros.training.helpers.CheckUtils::StringMustNotBeNullOrEmpty(java.lang.String[])

- com.coveros.training.persistence.PersistenceLayer::searchForUserByName(java.lang.String) -> com.coveros.training.helpers.CheckUtils::StringMustNotBeNullOrEmpty(java.lang.String[])

- com.coveros.training.persistence.PersistenceLayer::createHashedValueFromPassword(java.lang.String) -> com.coveros.training.helpers.CheckUtils::StringMustNotBeNullOrEmpty(java.lang.String[])

- com.coveros.training.persistence.PersistenceLayer::searchBorrowerDataByName(java.lang.String) -> com.coveros.training.helpers.CheckUtils::StringMustNotBeNullOrEmpty(java.lang.String[])

### Potential inter-service method interactions
- com.coveros.training.authentication.LoginStepDefs::whenAUserAuthenticatesWithAnd(java.lang.String,java.lang.String) -> com.coveros.training.authentication.LoginUtils::isUserRegistered(java.lang.String,java.lang.String)

- com.coveros.training.authentication.LoginStepDefs::isRegisteredInSystemWithPassword(java.lang.String,java.lang.String) -> com.coveros.training.authentication.RegistrationUtils::processRegistration(java.lang.String,java.lang.String)

- com.coveros.training.authentication.RegistrationStepDefs::theyEnterTheirUsernameAndProvideAPoorPassword(java.lang.String) -> com.coveros.training.authentication.RegistrationUtils::processRegistration(java.lang.String,java.lang.String)

- com.coveros.training.authentication.RegistrationStepDefs::theyRegisterWithThatUsernameAndUseThePassword(java.lang.String) -> com.coveros.training.authentication.RegistrationUtils::processRegistration(java.lang.String,java.lang.String)

- com.coveros.training.authentication.RegistrationStepDefs::they_become_registered() -> com.coveros.training.authentication.RegistrationUtils::isUserInDatabase(java.lang.String)

- com.coveros.training.authentication.RegistrationStepDefs::userIsRegistered(java.lang.String) -> com.coveros.training.authentication.RegistrationUtils::isUserInDatabase(java.lang.String)

- com.coveros.training.authentication.RegistrationStepDefs::theyFailToRegisterAndTheSystemIndicatesAResponse(java.lang.String) -> com.coveros.training.authentication.domainobjects.RegistrationResult::toString()

- com.coveros.training.authentication.RegistrationStepDefs::theyTryRegisteringWithThePasswordPassword(java.lang.String) -> com.coveros.training.authentication.RegistrationUtils::isPasswordGood(java.lang.String)

- com.coveros.training.authentication.RegistrationStepDefs::aUsernameOfIsRegistered(java.lang.String) -> com.coveros.training.authentication.RegistrationUtils::processRegistration(java.lang.String,java.lang.String)

- com.coveros.training.authentication.RegistrationStepDefs::a_user_tries_to_register_with_that_same_name() -> com.coveros.training.authentication.RegistrationUtils::processRegistration(java.lang.String,java.lang.String)

- com.coveros.training.cartesianproduct.CartesianProductStepDefs::weCalculateTheCombinations() -> com.coveros.training.cartesianproduct.CartesianProduct::calculate(java.util.Set)

- com.coveros.training.expenses.AlcoholStepDefs::iCalculateTheAlcoholRelatedPortion() -> com.coveros.training.expenses.AlcoholCalculator::calculate(com.coveros.training.expenses.DinnerPrices)

- com.coveros.training.math.AckermannStepDefs::i_calculate_ackermann_s_formula_using_and(int,int) -> com.coveros.training.mathematics.Ackermann::calculate(int,int)

- com.coveros.training.math.FibonacciStepDefs::i_calculate_the(java.lang.Integer) -> com.coveros.training.mathematics.Fibonacci::calculate(long)

### Potential Test inter-service method interactions
- com.coveros.training.authentication.domainobjects.PasswordResultTests::createTestPasswordResult() -> com.coveros.training.authentication.domainobjects.PasswordResult::createDefault(com.coveros.training.authentication.domainobjects.PasswordResultEnums)

- com.coveros.training.authentication.domainobjects.PasswordResultTests::testCanCreateEmpty() -> com.coveros.training.authentication.domainobjects.PasswordResult::isEmpty()

- com.coveros.training.authentication.domainobjects.PasswordResultTests::testCanCreateEmpty() -> com.coveros.training.authentication.domainobjects.PasswordResult::createEmpty()

- com.coveros.training.authentication.domainobjects.PasswordResultTests::testShouldOutputGoodString() -> com.coveros.training.authentication.domainobjects.PasswordResult::toString()

- com.coveros.training.authentication.domainobjects.RegistrationResultTests::testCanCreateEmpty() -> com.coveros.training.authentication.domainobjects.RegistrationResult::isEmpty()

- com.coveros.training.authentication.domainobjects.RegistrationResultTests::testCanCreateEmpty() -> com.coveros.training.authentication.domainobjects.RegistrationResult::createEmpty()

- com.coveros.training.authentication.domainobjects.RegistrationResultTests::testShouldOutputGoodString() -> com.coveros.training.authentication.domainobjects.RegistrationResult::createEmpty()

- com.coveros.training.authentication.domainobjects.RegistrationResultTests::testShouldOutputGoodString() -> com.coveros.training.authentication.domainobjects.RegistrationResult::toString()

- com.coveros.training.authentication.domainobjects.UserTests::testCanCreateEmpty() -> com.coveros.training.authentication.domainobjects.User::isEmpty()

- com.coveros.training.authentication.domainobjects.UserTests::testCanCreateEmpty() -> com.coveros.training.authentication.domainobjects.User::createEmpty()

- com.coveros.training.authentication.domainobjects.UserTests::testShouldOutputGoodString() -> com.coveros.training.authentication.domainobjects.User::toString()

- com.coveros.training.authentication.LoginServletTests::testHappyPathPost() -> com.coveros.training.authentication.LoginServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.authentication.LoginServletTests::testShouldGetAccessDeniedIfUserNotRegistered() -> com.coveros.training.authentication.LoginServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.authentication.LoginServletTests::testEmptyString_Username() -> com.coveros.training.authentication.LoginServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.authentication.LoginServletTests::testEmptyString_Password() -> com.coveros.training.authentication.LoginServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.authentication.LoginServletTests::setMock_LoginUtilsUserRegistered(java.lang.String,java.lang.String,boolean) -> com.coveros.training.authentication.LoginUtils::isUserRegistered(java.lang.String,java.lang.String)

- com.coveros.training.authentication.LoginUtilsTests::testCanCreateEmpty() -> com.coveros.training.authentication.LoginUtils::isEmpty()

- com.coveros.training.authentication.LoginUtilsTests::testCanCreateEmpty() -> com.coveros.training.authentication.LoginUtils::createEmpty()

- com.coveros.training.authentication.LoginUtilsTests::testCanSeeIfUserRegistered() -> com.coveros.training.authentication.LoginUtils::isUserRegistered(java.lang.String,java.lang.String)

- com.coveros.training.authentication.NbvcxzTests::testShouldHaveSuccessfulEntropyInPassword() -> com.coveros.training.authentication.RegistrationUtils::isPasswordGood(java.lang.String)

- com.coveros.training.authentication.NbvcxzTests::testShouldHaveInsufficientEntropyInPassword() -> com.coveros.training.authentication.RegistrationUtils::isPasswordGood(java.lang.String)

- com.coveros.training.authentication.NbvcxzTests::testShouldHaveSufficientEntropyInPassword() -> com.coveros.training.authentication.RegistrationUtils::isPasswordGood(java.lang.String)

- com.coveros.training.authentication.RegisterServletTests::testEmptyString_Username() -> com.coveros.training.authentication.RegisterServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.authentication.RegisterServletTests::testEmptyString_Password() -> com.coveros.training.authentication.RegisterServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.authentication.RegisterServletTests::mockRegisterUserToReturnSomeResponse(com.coveros.training.authentication.domainobjects.RegistrationResult) -> com.coveros.training.authentication.RegistrationUtils::processRegistration(java.lang.String,java.lang.String)

- com.coveros.training.authentication.RegisterServletTests::doPostWithoutName() -> com.coveros.training.authentication.RegisterServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.authentication.RegisterServletTests::doPostWithName() -> com.coveros.training.authentication.RegisterServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.authentication.RegistrationUtilsTests::testShouldProcessRegistration_ExistingUser() -> com.coveros.training.authentication.RegistrationUtils::processRegistration(java.lang.String,java.lang.String)

- com.coveros.training.authentication.RegistrationUtilsTests::testShouldProcessRegistration_HappyPath() -> com.coveros.training.authentication.RegistrationUtils::processRegistration(java.lang.String,java.lang.String)

- com.coveros.training.authentication.RegistrationUtilsTests::testShouldFailOnEmptyPassword_EmptyString() -> com.coveros.training.authentication.RegistrationUtils::isPasswordGood(java.lang.String)

- com.coveros.training.authentication.RegistrationUtilsTests::testShouldFailOnShortPassword() -> com.coveros.training.authentication.RegistrationUtils::isPasswordGood(java.lang.String)

- com.coveros.training.authentication.RegistrationUtilsTests::testShouldDetermineIfUserInDatabase() -> com.coveros.training.authentication.RegistrationUtils::isUserInDatabase(java.lang.String)

- com.coveros.training.authentication.RegistrationUtilsTests::testShouldProcessRegistration_BadPassword() -> com.coveros.training.authentication.domainobjects.PasswordResult::toPrettyString()

- com.coveros.training.authentication.RegistrationUtilsTests::testShouldProcessRegistration_BadPassword() -> com.coveros.training.authentication.RegistrationUtils::processRegistration(java.lang.String,java.lang.String)

- com.coveros.training.authentication.RegistrationUtilsTests::testShouldProcessRegistration_BadPassword() -> com.coveros.training.authentication.RegistrationUtils::isPasswordGood(java.lang.String)

- com.coveros.training.authentication.RegistrationUtilsTests::testEmptyObject() -> com.coveros.training.authentication.RegistrationUtils::isEmpty()

- com.coveros.training.authentication.RegistrationUtilsTests::testEmptyObject() -> com.coveros.training.authentication.RegistrationUtils::createEmpty()

- com.coveros.training.authentication.RegistrationUtilsTests::testShouldProcessRegistration_EmptyUsername() -> com.coveros.training.authentication.RegistrationUtils::processRegistration(java.lang.String,java.lang.String)

- com.coveros.training.authentication.RegistrationUtilsTests::testShouldPerformWell() -> com.coveros.training.authentication.RegistrationUtils::isPasswordGood(java.lang.String)

- com.coveros.training.authentication.RegistrationUtilsTests::testShouldHaveSufficientEntropyInPassword() -> com.coveros.training.authentication.RegistrationUtils::isPasswordGood(java.lang.String)

- com.coveros.training.helpers.CheckUtilsTests::testShouldThrowErrorFor0() -> com.coveros.training.helpers.CheckUtils::IntParameterMustBePositive(long)

- com.coveros.training.helpers.CheckUtilsTests::testShouldThrowErrorForSubZero() -> com.coveros.training.helpers.CheckUtils::IntParameterMustBePositive(long)

- com.coveros.training.helpers.CheckUtilsTests::testShouldSucceedForPositiveValue() -> com.coveros.training.helpers.CheckUtils::IntParameterMustBePositive(long)

- com.coveros.training.mathematics.AckServletTests::testPostService_Forward() -> com.coveros.training.mathematics.AckServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.mathematics.AckServletTests::testPostService_HappyPath() -> com.coveros.training.mathematics.AckServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.mathematics.AckServletTests::testPostService_realForward_withException() -> com.coveros.training.mathematics.AckServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.mathematics.AckServletTests::testPostService_TailRecursive() -> com.coveros.training.mathematics.AckServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.mathematics.AckermannIterativeParameterizedTests::testCalculateIterative() -> com.coveros.training.mathematics.AckermannIterative::calculate(int,int)

- com.coveros.training.mathematics.AckermannParameterizedTests::testShouldProperlyCalculate() -> com.coveros.training.mathematics.Ackermann::calculate(int,int)

- com.coveros.training.mathematics.FibServletTests::testPostService_Forward() -> com.coveros.training.mathematics.FibServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.mathematics.FibServletTests::testPostService_tailRecursive1() -> com.coveros.training.mathematics.FibServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.mathematics.FibServletTests::testPostService_tailRecursive2() -> com.coveros.training.mathematics.FibServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.mathematics.FibServletTests::testPostService_HappyPath() -> com.coveros.training.mathematics.FibServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.mathematics.FibServletTests::testPostService_realForward_withException() -> com.coveros.training.mathematics.FibServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.mathematics.FibonacciParameterizedTests::test() -> com.coveros.training.mathematics.Fibonacci::calculate(long)

- com.coveros.training.mathematics.FibonacciParameterizedTests::testIterative2() -> com.coveros.training.mathematics.FibonacciIterative::fibAlgo2(int)

- com.coveros.training.mathematics.FibonacciParameterizedTests::testIterative1() -> com.coveros.training.mathematics.FibonacciIterative::fibAlgo1(long)

- com.coveros.training.mathematics.FibonacciTests::testLargerValuesFibAlgo2() -> com.coveros.training.mathematics.FibonacciIterative::fibAlgo2(int)

- com.coveros.training.mathematics.FibonacciTests::testSmallValuesFibAlgo1() -> com.coveros.training.mathematics.FibonacciIterative::fibAlgo1(long)

- com.coveros.training.mathematics.FibonacciTests::testLargerValuesFibAlgo1() -> com.coveros.training.mathematics.FibonacciIterative::fibAlgo1(long)

- com.coveros.training.mathematics.FibonacciTests::testSmallValuesFibAlgo2() -> com.coveros.training.mathematics.FibonacciIterative::fibAlgo2(int)

- com.coveros.training.mathematics.FibonacciTests::testLargeValuesFibAlgo1() -> com.coveros.training.mathematics.FibonacciIterative::fibAlgo1(long)

- com.coveros.training.mathematics.FibonacciTests::testLargeValuesFibAlgo2() -> com.coveros.training.mathematics.FibonacciIterative::fibAlgo2(int)

- com.coveros.training.mathematics.MathServletTests::testPostService_Forward() -> com.coveros.training.mathematics.MathServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.mathematics.MathServletTests::testPostService_HappyPath() -> com.coveros.training.mathematics.MathServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.mathematics.MathServletTests::testPostService_realForward_withException() -> com.coveros.training.mathematics.MathServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.persistence.DbServletTests::testClean() -> com.coveros.training.persistence.DbServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.persistence.DbServletTests::testCleanAndMigrate() -> com.coveros.training.persistence.DbServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.persistence.DbServletTests::testMigrate() -> com.coveros.training.persistence.DbServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)


## mathematics
### Potential inter-service method interactions
- com.coveros.training.authentication.LoginStepDefs::whenAUserAuthenticatesWithAnd(java.lang.String,java.lang.String) -> com.coveros.training.authentication.LoginUtils::isUserRegistered(java.lang.String,java.lang.String)

- com.coveros.training.authentication.LoginStepDefs::initializeDatabaseAccess() -> com.coveros.training.persistence.IPersistenceLayer::cleanAndMigrateDatabase()

- com.coveros.training.authentication.LoginStepDefs::isRegisteredInSystemWithPassword(java.lang.String,java.lang.String) -> com.coveros.training.authentication.RegistrationUtils::processRegistration(java.lang.String,java.lang.String)

- com.coveros.training.authentication.RegistrationStepDefs::theyEnterTheirUsernameAndProvideAPoorPassword(java.lang.String) -> com.coveros.training.authentication.RegistrationUtils::processRegistration(java.lang.String,java.lang.String)

- com.coveros.training.authentication.RegistrationStepDefs::theyRegisterWithThatUsernameAndUseThePassword(java.lang.String) -> com.coveros.training.authentication.RegistrationUtils::processRegistration(java.lang.String,java.lang.String)

- com.coveros.training.authentication.RegistrationStepDefs::they_become_registered() -> com.coveros.training.authentication.RegistrationUtils::isUserInDatabase(java.lang.String)

- com.coveros.training.authentication.RegistrationStepDefs::userIsRegistered(java.lang.String) -> com.coveros.training.authentication.RegistrationUtils::isUserInDatabase(java.lang.String)

- com.coveros.training.authentication.RegistrationStepDefs::theyFailToRegisterAndTheSystemIndicatesAResponse(java.lang.String) -> com.coveros.training.authentication.domainobjects.RegistrationResult::toString()

- com.coveros.training.authentication.RegistrationStepDefs::theyTryRegisteringWithThePasswordPassword(java.lang.String) -> com.coveros.training.authentication.RegistrationUtils::isPasswordGood(java.lang.String)

- com.coveros.training.authentication.RegistrationStepDefs::initializeDatabaseAccess() -> com.coveros.training.persistence.IPersistenceLayer::cleanAndMigrateDatabase()

- com.coveros.training.authentication.RegistrationStepDefs::aUsernameOfIsRegistered(java.lang.String) -> com.coveros.training.authentication.RegistrationUtils::processRegistration(java.lang.String,java.lang.String)

- com.coveros.training.authentication.RegistrationStepDefs::a_user_tries_to_register_with_that_same_name() -> com.coveros.training.authentication.RegistrationUtils::processRegistration(java.lang.String,java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::aBookIsLoanedOut(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::aBookIsLoanedOut(java.lang.String) -> com.coveros.training.library.LibraryUtils::lendBook(java.lang.String,java.lang.String,java.sql.Date)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::aBookIsLoanedOut(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::aBookIsCurrentlyLoanedOut(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::aBookIsCurrentlyLoanedOut(java.lang.String) -> com.coveros.training.library.LibraryUtils::lendBook(java.lang.String,java.lang.String,java.sql.Date)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::aBookIsCurrentlyLoanedOut(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::aBookIsCurrentlyLoanedOutTo(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::aBookIsCurrentlyLoanedOutTo(java.lang.String) -> com.coveros.training.library.LibraryUtils::lendBook(java.lang.String,java.lang.String,java.sql.Date)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::aBookIsCurrentlyLoanedOutTo(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_registers_that_borrower() -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::the_system_does_not_have_the_borrower_registered() -> com.coveros.training.library.domainobjects.Borrower::isEmpty()

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::the_system_does_not_have_the_borrower_registered() -> com.coveros.training.library.LibraryUtils::searchForBorrowerByName(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_searches_by_its_id() -> com.coveros.training.library.LibraryUtils::searchForBookById(long)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_searches_for_a_borrower_by_id(java.lang.Integer) -> com.coveros.training.library.LibraryUtils::searchForBorrowerById(long)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::the_system_does_not_have_the_book_registered() -> com.coveros.training.library.domainobjects.Book::isEmpty()

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::the_system_does_not_have_the_book_registered() -> com.coveros.training.library.LibraryUtils::searchForBookByTitle(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_searches_for_a_borrower_by_name_of(java.lang.String) -> com.coveros.training.library.LibraryUtils::searchForBorrowerByName(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::the_system_reports_that_there_are_no_borrowers_found_with_that_name() -> com.coveros.training.library.domainobjects.Borrower::isEmpty()

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::initializeEmptyDatabaseAndUtility() -> com.coveros.training.persistence.IPersistenceLayer::cleanAndMigrateDatabase()

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_library_with_the_following_books_registered() -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_searches_for_a_book_by_id(java.lang.Integer) -> com.coveros.training.library.LibraryUtils::searchForBookById(long)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_lists_all_the_registered_books() -> com.coveros.training.library.LibraryUtils::listAllBooks()

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_lists_the_available_books() -> com.coveros.training.library.LibraryUtils::listAvailableBooks()

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_searches_for_a_book_by_title_of(java.lang.String) -> com.coveros.training.library.LibraryUtils::searchForBookByTitle(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_lists_all_the_borrowers() -> com.coveros.training.library.LibraryUtils::listAllBorrowers()

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_searches_by_that_id() -> com.coveros.training.library.LibraryUtils::searchForBorrowerById(long)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_searches_by_that_id() -> com.coveros.training.library.LibraryUtils::searchForBorrowerByName(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_searches_by_that_name() -> com.coveros.training.library.LibraryUtils::searchForBorrowerByName(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_lists_all_the_registered_borrowers() -> com.coveros.training.library.LibraryUtils::listAllBorrowers()

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::some_books_are_checked_out() -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::some_books_are_checked_out() -> com.coveros.training.library.LibraryUtils::lendBook(java.lang.String,java.lang.String,java.sql.Date)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::some_books_are_checked_out() -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::the_system_returns_an_empty_result_for_the_book() -> com.coveros.training.library.domainobjects.Book::isEmpty()

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::the_system_reports_that_there_are_no_borrowers_with_that_id() -> com.coveros.training.library.domainobjects.Borrower::isEmpty()

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_deletes_that_borrower() -> com.coveros.training.library.LibraryUtils::deleteBorrower(com.coveros.training.library.domainobjects.Borrower)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_book_is_currently_registered_in_the_system(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_book_is_currently_registered_in_the_system(java.lang.String) -> com.coveros.training.library.LibraryUtils::searchForBookByTitle(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::aBookIsLoanedTo(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::aBookIsLoanedTo(java.lang.String) -> com.coveros.training.library.LibraryUtils::lendBook(java.lang.String,java.lang.String,java.sql.Date)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::aBookIsLoanedTo(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::aBookIsLoanedTo(java.lang.String) -> com.coveros.training.library.LibraryUtils::searchForBookByTitle(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::the_system_has_the_borrower_registered() -> com.coveros.training.library.LibraryUtils::searchForBorrowerByName(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_searches_by_that_title() -> com.coveros.training.library.LibraryUtils::searchForBookByTitle(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_registers_that_book() -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_registers_that_book() -> com.coveros.training.library.LibraryUtils::searchForBookByTitle(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_library_with_the_following_borrowers_registered() -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::the_system_returns_an_empty_result_for_the_borrower() -> com.coveros.training.library.domainobjects.Borrower::isEmpty()

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_borrower_is_currently_registered_in_the_system(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::theLoanIsDeletedAsWell() -> com.coveros.training.library.domainobjects.Loan::isEmpty()

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::theLoanIsDeletedAsWell() -> com.coveros.training.library.LibraryUtils::searchForLoanByBook(com.coveros.training.library.domainobjects.Book)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_deletes_that_book() -> com.coveros.training.library.LibraryUtils::deleteBook(com.coveros.training.library.domainobjects.Book)

- com.coveros.training.library.BookCheckOutStepDefs::another_borrower_tries_to_borrow_that_book(java.lang.String) -> com.coveros.training.library.LibraryUtils::lendBook(java.lang.String,java.lang.String,java.sql.Date)

- com.coveros.training.library.BookCheckOutStepDefs::another_borrower_tries_to_borrow_that_book(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::they_borrow_another_book() -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::they_borrow_another_book() -> com.coveros.training.library.LibraryUtils::lendBook(java.lang.String,java.lang.String,java.sql.Date)

- com.coveros.training.library.BookCheckOutStepDefs::theSystemIndicatesTheBookIsLoanedToThemOnThatDate() -> com.coveros.training.library.LibraryUtils::searchForLoanByBook(com.coveros.training.library.domainobjects.Book)

- com.coveros.training.library.BookCheckOutStepDefs::aBorrowerIsRegistered(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::aBorrowerIsRegistered(java.lang.String) -> com.coveros.training.library.LibraryUtils::searchForBorrowerByName(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::theyTryToCheckOutABookThatIsAvailable(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::theyTryToCheckOutABookThatIsAvailable(java.lang.String) -> com.coveros.training.library.LibraryUtils::lendBook(com.coveros.training.library.domainobjects.Book,com.coveros.training.library.domainobjects.Borrower,java.sql.Date)

- com.coveros.training.library.BookCheckOutStepDefs::theyTryToCheckOutABookThatIsAvailable(java.lang.String) -> com.coveros.training.library.LibraryUtils::searchForBookByTitle(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::aBookIsAvailableForBorrowing(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::aBookIsAvailableForBorrowing(java.lang.String) -> com.coveros.training.library.LibraryUtils::searchForBookByTitle(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::a_borrower_has_one_book_already_borrowed(java.lang.String,java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::a_borrower_has_one_book_already_borrowed(java.lang.String,java.lang.String) -> com.coveros.training.library.LibraryUtils::lendBook(java.lang.String,java.lang.String,java.sql.Date)

- com.coveros.training.library.BookCheckOutStepDefs::a_borrower_has_one_book_already_borrowed(java.lang.String,java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::andABookIsAlreadyCheckedOutTo(java.lang.String,java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::andABookIsAlreadyCheckedOutTo(java.lang.String,java.lang.String) -> com.coveros.training.library.LibraryUtils::lendBook(com.coveros.training.library.domainobjects.Book,com.coveros.training.library.domainobjects.Borrower,java.sql.Date)

- com.coveros.training.library.BookCheckOutStepDefs::andABookIsAlreadyCheckedOutTo(java.lang.String,java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::andABookIsAlreadyCheckedOutTo(java.lang.String,java.lang.String) -> com.coveros.training.library.LibraryUtils::searchForBorrowerByName(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::andABookIsAlreadyCheckedOutTo(java.lang.String,java.lang.String) -> com.coveros.training.library.LibraryUtils::searchForBookByTitle(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::initializeEmptyDatabaseAndUtility() -> com.coveros.training.persistence.IPersistenceLayer::cleanAndMigrateDatabase()

- com.coveros.training.library.BookCheckOutStepDefs::theSystemIndicatesTheBookIsLoanedToThemOnSomeDate() -> com.coveros.training.library.LibraryUtils::searchForLoanByBook(com.coveros.training.library.domainobjects.Book)

- com.coveros.training.library.BookCheckOutStepDefs::theyCheckOutTheBook() -> com.coveros.training.library.LibraryUtils::lendBook(com.coveros.training.library.domainobjects.Book,com.coveros.training.library.domainobjects.Borrower,java.sql.Date)

- com.coveros.training.library.BookCheckOutStepDefs::theyTryToCheckOutTheBookOn(java.lang.String) -> com.coveros.training.library.LibraryUtils::lendBook(com.coveros.training.library.domainobjects.Book,com.coveros.training.library.domainobjects.Borrower,java.sql.Date)

- com.coveros.training.library.BookCheckOutStepDefs::they_have_two_books_currently_borrowed() -> com.coveros.training.library.LibraryUtils::searchForLoanByBorrower(com.coveros.training.library.domainobjects.Borrower)

- com.coveros.training.library.BookCheckOutStepDefs::they_have_two_books_currently_borrowed() -> com.coveros.training.library.LibraryUtils::searchForBorrowerByName(java.lang.String)

### Potential Test inter-service method interactions
- com.coveros.training.authentication.domainobjects.PasswordResultTests::createTestPasswordResult() -> com.coveros.training.authentication.domainobjects.PasswordResult::createDefault(com.coveros.training.authentication.domainobjects.PasswordResultEnums)

- com.coveros.training.authentication.domainobjects.PasswordResultTests::testCanCreateEmpty() -> com.coveros.training.authentication.domainobjects.PasswordResult::isEmpty()

- com.coveros.training.authentication.domainobjects.PasswordResultTests::testCanCreateEmpty() -> com.coveros.training.authentication.domainobjects.PasswordResult::createEmpty()

- com.coveros.training.authentication.domainobjects.PasswordResultTests::testShouldOutputGoodString() -> com.coveros.training.authentication.domainobjects.PasswordResult::toString()

- com.coveros.training.authentication.domainobjects.RegistrationResultTests::testCanCreateEmpty() -> com.coveros.training.authentication.domainobjects.RegistrationResult::isEmpty()

- com.coveros.training.authentication.domainobjects.RegistrationResultTests::testCanCreateEmpty() -> com.coveros.training.authentication.domainobjects.RegistrationResult::createEmpty()

- com.coveros.training.authentication.domainobjects.RegistrationResultTests::testShouldOutputGoodString() -> com.coveros.training.authentication.domainobjects.RegistrationResult::createEmpty()

- com.coveros.training.authentication.domainobjects.RegistrationResultTests::testShouldOutputGoodString() -> com.coveros.training.authentication.domainobjects.RegistrationResult::toString()

- com.coveros.training.authentication.domainobjects.UserTests::testCanCreateEmpty() -> com.coveros.training.authentication.domainobjects.User::isEmpty()

- com.coveros.training.authentication.domainobjects.UserTests::testCanCreateEmpty() -> com.coveros.training.authentication.domainobjects.User::createEmpty()

- com.coveros.training.authentication.domainobjects.UserTests::testShouldOutputGoodString() -> com.coveros.training.authentication.domainobjects.User::toString()

- com.coveros.training.authentication.LoginServletTests::testHappyPathPost() -> com.coveros.training.authentication.LoginServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.authentication.LoginServletTests::testShouldGetAccessDeniedIfUserNotRegistered() -> com.coveros.training.authentication.LoginServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.authentication.LoginServletTests::testEmptyString_Username() -> com.coveros.training.authentication.LoginServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.authentication.LoginServletTests::testEmptyString_Password() -> com.coveros.training.authentication.LoginServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.authentication.LoginServletTests::setMock_LoginUtilsUserRegistered(java.lang.String,java.lang.String,boolean) -> com.coveros.training.authentication.LoginUtils::isUserRegistered(java.lang.String,java.lang.String)

- com.coveros.training.authentication.LoginUtilsTests::testCanCreateEmpty() -> com.coveros.training.authentication.LoginUtils::isEmpty()

- com.coveros.training.authentication.LoginUtilsTests::testCanCreateEmpty() -> com.coveros.training.authentication.LoginUtils::createEmpty()

- com.coveros.training.authentication.LoginUtilsTests::testCanSeeIfUserRegistered() -> com.coveros.training.authentication.LoginUtils::isUserRegistered(java.lang.String,java.lang.String)

- com.coveros.training.authentication.NbvcxzTests::testShouldHaveSuccessfulEntropyInPassword() -> com.coveros.training.authentication.RegistrationUtils::isPasswordGood(java.lang.String)

- com.coveros.training.authentication.NbvcxzTests::testShouldHaveInsufficientEntropyInPassword() -> com.coveros.training.authentication.RegistrationUtils::isPasswordGood(java.lang.String)

- com.coveros.training.authentication.NbvcxzTests::testShouldHaveSufficientEntropyInPassword() -> com.coveros.training.authentication.RegistrationUtils::isPasswordGood(java.lang.String)

- com.coveros.training.authentication.RegisterServletTests::testEmptyString_Username() -> com.coveros.training.authentication.RegisterServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.authentication.RegisterServletTests::testEmptyString_Password() -> com.coveros.training.authentication.RegisterServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.authentication.RegisterServletTests::mockRegisterUserToReturnSomeResponse(com.coveros.training.authentication.domainobjects.RegistrationResult) -> com.coveros.training.authentication.RegistrationUtils::processRegistration(java.lang.String,java.lang.String)

- com.coveros.training.authentication.RegisterServletTests::doPostWithoutName() -> com.coveros.training.authentication.RegisterServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.authentication.RegisterServletTests::doPostWithName() -> com.coveros.training.authentication.RegisterServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.authentication.RegistrationUtilsTests::testShouldProcessRegistration_ExistingUser() -> com.coveros.training.authentication.RegistrationUtils::processRegistration(java.lang.String,java.lang.String)

- com.coveros.training.authentication.RegistrationUtilsTests::testShouldProcessRegistration_ExistingUser() -> com.coveros.training.persistence.IPersistenceLayer::searchForUserByName(java.lang.String)

- com.coveros.training.authentication.RegistrationUtilsTests::testShouldProcessRegistration_HappyPath() -> com.coveros.training.authentication.RegistrationUtils::processRegistration(java.lang.String,java.lang.String)

- com.coveros.training.authentication.RegistrationUtilsTests::testShouldProcessRegistration_HappyPath() -> com.coveros.training.persistence.IPersistenceLayer::searchForUserByName(java.lang.String)

- com.coveros.training.authentication.RegistrationUtilsTests::testShouldFailOnEmptyPassword_EmptyString() -> com.coveros.training.authentication.RegistrationUtils::isPasswordGood(java.lang.String)

- com.coveros.training.authentication.RegistrationUtilsTests::testShouldFailOnShortPassword() -> com.coveros.training.authentication.RegistrationUtils::isPasswordGood(java.lang.String)

- com.coveros.training.authentication.RegistrationUtilsTests::testShouldDetermineIfUserInDatabase() -> com.coveros.training.authentication.RegistrationUtils::isUserInDatabase(java.lang.String)

- com.coveros.training.authentication.RegistrationUtilsTests::testShouldDetermineIfUserInDatabase() -> com.coveros.training.persistence.IPersistenceLayer::searchForUserByName(java.lang.String)

- com.coveros.training.authentication.RegistrationUtilsTests::testShouldProcessRegistration_BadPassword() -> com.coveros.training.authentication.domainobjects.PasswordResult::toPrettyString()

- com.coveros.training.authentication.RegistrationUtilsTests::testShouldProcessRegistration_BadPassword() -> com.coveros.training.authentication.RegistrationUtils::processRegistration(java.lang.String,java.lang.String)

- com.coveros.training.authentication.RegistrationUtilsTests::testShouldProcessRegistration_BadPassword() -> com.coveros.training.authentication.RegistrationUtils::isPasswordGood(java.lang.String)

- com.coveros.training.authentication.RegistrationUtilsTests::testShouldProcessRegistration_BadPassword() -> com.coveros.training.persistence.IPersistenceLayer::searchForUserByName(java.lang.String)

- com.coveros.training.authentication.RegistrationUtilsTests::testEmptyObject() -> com.coveros.training.authentication.RegistrationUtils::isEmpty()

- com.coveros.training.authentication.RegistrationUtilsTests::testEmptyObject() -> com.coveros.training.authentication.RegistrationUtils::createEmpty()

- com.coveros.training.authentication.RegistrationUtilsTests::testShouldProcessRegistration_EmptyUsername() -> com.coveros.training.authentication.RegistrationUtils::processRegistration(java.lang.String,java.lang.String)

- com.coveros.training.authentication.RegistrationUtilsTests::testShouldPerformWell() -> com.coveros.training.authentication.RegistrationUtils::isPasswordGood(java.lang.String)

- com.coveros.training.authentication.RegistrationUtilsTests::testShouldHaveSufficientEntropyInPassword() -> com.coveros.training.authentication.RegistrationUtils::isPasswordGood(java.lang.String)

- com.coveros.training.helpers.CheckUtilsTests::testShouldThrowErrorFor0() -> com.coveros.training.helpers.CheckUtils::IntParameterMustBePositive(long)

- com.coveros.training.helpers.CheckUtilsTests::testShouldThrowErrorForSubZero() -> com.coveros.training.helpers.CheckUtils::IntParameterMustBePositive(long)

- com.coveros.training.helpers.CheckUtilsTests::testShouldSucceedForPositiveValue() -> com.coveros.training.helpers.CheckUtils::IntParameterMustBePositive(long)

- com.coveros.training.helpers.StringUtilsTests::testShouldConvertNullToEmptyString() -> com.coveros.training.helpers.StringUtils::makeNotNullable(java.lang.String)

- com.coveros.training.helpers.StringUtilsTests::testShouldNotAlterNonNullString() -> com.coveros.training.helpers.StringUtils::makeNotNullable(java.lang.String)

- com.coveros.training.helpers.StringUtilsTests::testEscapeForJson_ShouldEscapeBackslash() -> com.coveros.training.helpers.StringUtils::escapeForJson(java.lang.String)

- com.coveros.training.helpers.StringUtilsTests::testEscapeForJson_ShouldEscapeDoubleQuote() -> com.coveros.training.helpers.StringUtils::escapeForJson(java.lang.String)

- com.coveros.training.library.domainobjects.BookTests::testCanCreateEmpty() -> com.coveros.training.library.domainobjects.Book::isEmpty()

- com.coveros.training.library.domainobjects.BookTests::testCanCreateEmpty() -> com.coveros.training.library.domainobjects.Book::createEmpty()

- com.coveros.training.library.domainobjects.BookTests::testShouldOutputGoodString() -> com.coveros.training.library.domainobjects.Book::toString()

- com.coveros.training.library.domainobjects.BorrowerTests::testCanCreateEmpty() -> com.coveros.training.library.domainobjects.Borrower::isEmpty()

- com.coveros.training.library.domainobjects.BorrowerTests::testCanCreateEmpty() -> com.coveros.training.library.domainobjects.Borrower::createEmpty()

- com.coveros.training.library.domainobjects.BorrowerTests::testShouldOutputGoodString() -> com.coveros.training.library.domainobjects.Borrower::toString()

- com.coveros.training.library.domainobjects.BorrowerTests::testShouldReturnJsonString() -> com.coveros.training.library.domainobjects.Borrower::toOutputString()

- com.coveros.training.library.domainobjects.LoanTests::testCanCreateEmpty() -> com.coveros.training.library.domainobjects.Loan::isEmpty()

- com.coveros.training.library.domainobjects.LoanTests::testCanCreateEmpty() -> com.coveros.training.library.domainobjects.Loan::createEmpty()

- com.coveros.training.library.domainobjects.LoanTests::testShouldOutputGoodString() -> com.coveros.training.library.domainobjects.Loan::toString()

- com.coveros.training.library.LendingTests::testShouldNotLendIfBookNotRegistered() -> com.coveros.training.library.domainobjects.Book::createEmpty()

- com.coveros.training.library.LendingTests::testShouldNotLendIfBookNotRegistered() -> com.coveros.training.library.LibraryUtils::lendBook(com.coveros.training.library.domainobjects.Book,com.coveros.training.library.domainobjects.Borrower,java.sql.Date)

- com.coveros.training.library.LendingTests::mockThatBookNotRegistered(java.lang.String) -> com.coveros.training.library.domainobjects.Book::createEmpty()

- com.coveros.training.library.LendingTests::shouldRegisterBorrower() -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.LendingTests::shouldRegisterBook() -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.LendingTests::mockSearchForLoan() -> com.coveros.training.library.domainobjects.Loan::createEmpty()

- com.coveros.training.library.LendingTests::testShouldNotLendIfBorrowerNotRegistered() -> com.coveros.training.library.domainobjects.Borrower::createEmpty()

- com.coveros.training.library.LendingTests::testShouldNotLendIfBorrowerNotRegistered() -> com.coveros.training.library.LibraryUtils::lendBook(com.coveros.training.library.domainobjects.Book,com.coveros.training.library.domainobjects.Borrower,java.sql.Date)

- com.coveros.training.library.LendingTests::mockBorrowerNotRegistered(java.lang.String) -> com.coveros.training.library.domainobjects.Borrower::createEmpty()

- com.coveros.training.library.LendingTests::shouldNotLendIfCurrentlyBorrowed() -> com.coveros.training.library.LibraryUtils::lendBook(com.coveros.training.library.domainobjects.Book,com.coveros.training.library.domainobjects.Borrower,java.sql.Date)

- com.coveros.training.library.LendingTests::shouldNotLendIfCurrentlyBorrowed() -> com.coveros.training.library.LibraryUtils::searchForLoanByBook(com.coveros.training.library.domainobjects.Book)

- com.coveros.training.library.LendingTests::shouldLendToUser() -> com.coveros.training.library.LibraryUtils::lendBook(com.coveros.training.library.domainobjects.Book,com.coveros.training.library.domainobjects.Borrower,java.sql.Date)

- com.coveros.training.library.LibraryBookListAvailableServletTests::testListAvailableBooks_MultipleBook() -> com.coveros.training.library.LibraryBookListAvailableServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBookListAvailableServletTests::testListAvailableBooks_MultipleBook() -> com.coveros.training.library.LibraryUtils::listAvailableBooks()

- com.coveros.training.library.LibraryBookListAvailableServletTests::testListAvailableBooks_OneBook() -> com.coveros.training.library.LibraryBookListAvailableServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBookListAvailableServletTests::testListAvailableBooks_OneBook() -> com.coveros.training.library.LibraryUtils::listAvailableBooks()

- com.coveros.training.library.LibraryBookListAvailableServletTests::testSearchNoBooks() -> com.coveros.training.library.LibraryBookListAvailableServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBookListAvailableServletTests::testListAvailableBooks_EmptyList() -> com.coveros.training.library.LibraryBookListAvailableServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchById_noBookFound() -> com.coveros.training.library.domainobjects.Book::createEmpty()

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchById_noBookFound() -> com.coveros.training.library.LibraryBookListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchById_noBookFound() -> com.coveros.training.library.LibraryUtils::searchForBookById(long)

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchNoBooks() -> com.coveros.training.library.LibraryBookListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchNothingFoundById() -> com.coveros.training.library.domainobjects.Book::createEmpty()

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchNothingFoundById() -> com.coveros.training.library.LibraryBookListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchNothingFoundById() -> com.coveros.training.library.LibraryUtils::searchForBookById(long)

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchByTitle() -> com.coveros.training.library.LibraryBookListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchByTitle() -> com.coveros.training.library.LibraryUtils::searchForBookByTitle(java.lang.String)

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchIdAndTitle() -> com.coveros.training.library.LibraryBookListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBookListSearchServletTests::testListAllBooks() -> com.coveros.training.library.LibraryBookListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBookListSearchServletTests::testListAllBooks() -> com.coveros.training.library.LibraryUtils::listAllBooks()

- com.coveros.training.library.LibraryBookListSearchServletTests::testListAllBooks_NoBooksInDatabase() -> com.coveros.training.library.LibraryBookListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchById() -> com.coveros.training.library.LibraryBookListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchById() -> com.coveros.training.library.LibraryUtils::searchForBookById(long)

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchNothingFoundByTitle() -> com.coveros.training.library.domainobjects.Book::createEmpty()

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchNothingFoundByTitle() -> com.coveros.training.library.LibraryBookListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchNothingFoundByTitle() -> com.coveros.training.library.LibraryUtils::searchForBookByTitle(java.lang.String)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchByNameNotFound() -> com.coveros.training.library.domainobjects.Borrower::createEmpty()

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchByNameNotFound() -> com.coveros.training.library.LibraryBorrowerListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchByNameNotFound() -> com.coveros.training.library.LibraryUtils::searchForBorrowerByName(java.lang.String)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchByName() -> com.coveros.training.library.LibraryBorrowerListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchByName() -> com.coveros.training.library.LibraryUtils::searchForBorrowerByName(java.lang.String)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchByBadId() -> com.coveros.training.library.LibraryBorrowerListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchByBadId() -> com.coveros.training.library.LibraryUtils::searchForBorrowerById(long)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchNothingFoundByName() -> com.coveros.training.library.domainobjects.Borrower::createEmpty()

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchNothingFoundByName() -> com.coveros.training.library.LibraryBorrowerListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchNothingFoundByName() -> com.coveros.training.library.LibraryUtils::searchForBorrowerByName(java.lang.String)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchNoBorrowers() -> com.coveros.training.library.LibraryBorrowerListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchNothingFoundById() -> com.coveros.training.library.domainobjects.Borrower::createEmpty()

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchNothingFoundById() -> com.coveros.training.library.LibraryBorrowerListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchNothingFoundById() -> com.coveros.training.library.LibraryUtils::searchForBorrowerById(long)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchIdAndName() -> com.coveros.training.library.LibraryBorrowerListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testListAllBorrowers() -> com.coveros.training.library.LibraryBorrowerListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testListAllBorrowers() -> com.coveros.training.library.LibraryUtils::listAllBorrowers()

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testListAllBorrowers_noBorrowersExist() -> com.coveros.training.library.LibraryBorrowerListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchById() -> com.coveros.training.library.domainobjects.Borrower::createEmpty()

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchById() -> com.coveros.training.library.LibraryBorrowerListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchById() -> com.coveros.training.library.LibraryUtils::searchForBorrowerById(long)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchBorrowerFoundById() -> com.coveros.training.library.LibraryBorrowerListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchBorrowerFoundById() -> com.coveros.training.library.LibraryUtils::searchForBorrowerById(long)

- com.coveros.training.library.LibraryLendServletTests::testHappyPathPost() -> com.coveros.training.library.LibraryLendServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryLendServletTests::testHappyPathPost() -> com.coveros.training.library.LibraryUtils::lendBook(java.lang.String,java.lang.String,java.sql.Date)

- com.coveros.training.library.LibraryLendServletTests::testEmptyString_Book() -> com.coveros.training.library.LibraryLendServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryLendServletTests::testDateFunction() -> com.coveros.training.library.LibraryLendServlet::getDateNow()

- com.coveros.training.library.LibraryLendServletTests::testEmptyString_Borrower() -> com.coveros.training.library.LibraryLendServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryRegisterBookServletTests::testHappyPathPost() -> com.coveros.training.library.LibraryRegisterBookServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryRegisterBookServletTests::testHappyPathPost() -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.LibraryRegisterBookServletTests::testEmptyString() -> com.coveros.training.library.LibraryRegisterBookServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryRegisterBorrowerServletTests::testHappyPathPost() -> com.coveros.training.library.LibraryRegisterBorrowerServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryRegisterBorrowerServletTests::testHappyPathPost() -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.LibraryRegisterBorrowerServletTests::testEmptyString() -> com.coveros.training.library.LibraryRegisterBorrowerServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryUtilsTests::testCanLendBook_wrapperMethod() -> com.coveros.training.library.domainobjects.Loan::createEmpty()

- com.coveros.training.library.LibraryUtilsTests::testCanLendBook_wrapperMethod() -> com.coveros.training.library.LibraryUtils::lendBook(java.lang.String,java.lang.String,java.sql.Date)

- com.coveros.training.library.LibraryUtilsTests::testShouldThrowExceptionWhenSearchingWithEmptyStringAsBookTitle() -> com.coveros.training.library.LibraryUtils::searchForBookByTitle(java.lang.String)

- com.coveros.training.library.LibraryUtilsTests::testCanRegisterBorrower() -> com.coveros.training.library.domainobjects.Borrower::createEmpty()

- com.coveros.training.library.LibraryUtilsTests::testCanRegisterBorrower() -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.LibraryUtilsTests::testCanSearchForBooksById() -> com.coveros.training.library.LibraryUtils::searchForBookById(long)

- com.coveros.training.library.LibraryUtilsTests::testCanSearchForBooksById() -> com.coveros.training.persistence.IPersistenceLayer::searchBooksById(long)

- com.coveros.training.library.LibraryUtilsTests::testCanSearchForLoanByBook() -> com.coveros.training.library.LibraryUtils::searchForLoanByBook(com.coveros.training.library.domainobjects.Book)

- com.coveros.training.library.LibraryUtilsTests::testCanRegisterBook() -> com.coveros.training.library.domainobjects.Book::createEmpty()

- com.coveros.training.library.LibraryUtilsTests::testCanRegisterBook() -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.LibraryUtilsTests::testCannotDeleteNonRegisteredBook() -> com.coveros.training.library.LibraryUtils::deleteBook(com.coveros.training.library.domainobjects.Book)

- com.coveros.training.library.LibraryUtilsTests::testCannotDeleteNonRegisteredBook() -> com.coveros.training.persistence.IPersistenceLayer::searchBooksByTitle(java.lang.String)

- com.coveros.training.library.LibraryUtilsTests::testCanCreateEmpty() -> com.coveros.training.library.LibraryUtils::createEmpty()

- com.coveros.training.library.LibraryUtilsTests::testCanCreateEmpty() -> com.coveros.training.library.LibraryUtils::isEmpty()

- com.coveros.training.library.LibraryUtilsTests::testCanLendBook() -> com.coveros.training.library.domainobjects.Loan::createEmpty()

- com.coveros.training.library.LibraryUtilsTests::testCanLendBook() -> com.coveros.training.library.LibraryUtils::lendBook(com.coveros.training.library.domainobjects.Book,com.coveros.training.library.domainobjects.Borrower,java.sql.Date)

- com.coveros.training.library.LibraryUtilsTests::testCannotDeleteNonRegisteredBorrower() -> com.coveros.training.library.LibraryUtils::deleteBorrower(com.coveros.training.library.domainobjects.Borrower)

- com.coveros.training.library.LibraryUtilsTests::testCannotDeleteNonRegisteredBorrower() -> com.coveros.training.persistence.IPersistenceLayer::searchBorrowerDataByName(java.lang.String)

- com.coveros.training.library.LibraryUtilsTests::testShouldThrowExceptionWhenSearchingWithLessThanOneAsBookId() -> com.coveros.training.library.LibraryUtils::searchForBookById(long)

- com.coveros.training.library.LibraryUtilsTests::testCanDeleteBook() -> com.coveros.training.library.LibraryUtils::deleteBook(com.coveros.training.library.domainobjects.Book)

- com.coveros.training.library.LibraryUtilsTests::testCanDeleteBook() -> com.coveros.training.persistence.IPersistenceLayer::searchBooksByTitle(java.lang.String)

- com.coveros.training.library.LibraryUtilsTests::testCanSearchForBooksByTitle() -> com.coveros.training.library.LibraryUtils::searchForBookByTitle(java.lang.String)

- com.coveros.training.library.LibraryUtilsTests::testCanSearchForBooksByTitle() -> com.coveros.training.persistence.IPersistenceLayer::searchBooksByTitle(java.lang.String)

- com.coveros.training.library.LibraryUtilsTests::testCanSearchForLoanByBorrower() -> com.coveros.training.library.LibraryUtils::searchForLoanByBorrower(com.coveros.training.library.domainobjects.Borrower)

- com.coveros.training.library.LibraryUtilsTests::testShouldListAvailableBooks() -> com.coveros.training.library.LibraryUtils::listAvailableBooks()

- com.coveros.training.library.LibraryUtilsTests::testCanSearchForBorrowerByName() -> com.coveros.training.library.LibraryUtils::searchForBorrowerByName(java.lang.String)

- com.coveros.training.library.LibraryUtilsTests::testCannotRegisterBookWithEmptyString() -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.LibraryUtilsTests::testShouldBeAbleToListAllBooks() -> com.coveros.training.library.LibraryUtils::listAllBooks()

- com.coveros.training.library.LibraryUtilsTests::testShouldBeAbleToListAllBooks() -> com.coveros.training.persistence.IPersistenceLayer::listAllBooks()

- com.coveros.training.library.LibraryUtilsTests::testCanDeleteBorrower() -> com.coveros.training.library.LibraryUtils::deleteBorrower(com.coveros.training.library.domainobjects.Borrower)

- com.coveros.training.library.LibraryUtilsTests::testCanDeleteBorrower() -> com.coveros.training.persistence.IPersistenceLayer::searchBorrowerDataByName(java.lang.String)

- com.coveros.training.library.LibraryUtilsTests::testShouldBeAbleToListAllBorrowers() -> com.coveros.training.library.LibraryUtils::listAllBorrowers()

- com.coveros.training.library.LibraryUtilsTests::testShouldBeAbleToListAllBorrowers() -> com.coveros.training.persistence.IPersistenceLayer::listAllBorrowers()

- com.coveros.training.persistence.DbServletTests::testClean() -> com.coveros.training.persistence.DbServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.persistence.DbServletTests::testCleanAndMigrate() -> com.coveros.training.persistence.DbServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.persistence.DbServletTests::testMigrate() -> com.coveros.training.persistence.DbServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.persistence.EmptyDataSourceTests::testUnwrap() -> com.coveros.training.persistence.EmptyDataSource::unwrap(java.lang.Class)

- com.coveros.training.persistence.EmptyDataSourceTests::testGetLogWriter() -> com.coveros.training.persistence.EmptyDataSource::getLogWriter()

- com.coveros.training.persistence.EmptyDataSourceTests::testGetParentLogger() -> com.coveros.training.persistence.EmptyDataSource::getParentLogger()

- com.coveros.training.persistence.EmptyDataSourceTests::testGetLoginTimeout() -> com.coveros.training.persistence.EmptyDataSource::getLoginTimeout()

- com.coveros.training.persistence.EmptyDataSourceTests::testSetLogWriter() -> com.coveros.training.persistence.EmptyDataSource::setLogWriter(java.io.PrintWriter)

- com.coveros.training.persistence.EmptyDataSourceTests::testSetLoginTimeout() -> com.coveros.training.persistence.EmptyDataSource::setLoginTimeout(int)

- com.coveros.training.persistence.EmptyDataSourceTests::testGetConnection() -> com.coveros.training.persistence.EmptyDataSource::getConnection()

- com.coveros.training.persistence.EmptyDataSourceTests::testGetConnectionWithParams() -> com.coveros.training.persistence.EmptyDataSource::getConnection(java.lang.String,java.lang.String)

- com.coveros.training.persistence.EmptyDataSourceTests::testIsWrapperFor() -> com.coveros.training.persistence.EmptyDataSource::isWrapperFor(java.lang.Class)

- com.coveros.training.persistence.ParameterObjectTests::testCanCreateEmpty() -> com.coveros.training.persistence.ParameterObject::isEmpty()

- com.coveros.training.persistence.ParameterObjectTests::testCanCreateEmpty() -> com.coveros.training.persistence.ParameterObject::createEmpty()

- com.coveros.training.persistence.ParameterObjectTests::testShouldOutputGoodString() -> com.coveros.training.persistence.ParameterObject::toString()

- com.coveros.training.persistence.PersistenceLayerTests::testWeCanSearchForALoanByABook() -> com.coveros.training.persistence.IPersistenceLayer::searchForLoanByBook(com.coveros.training.library.domainobjects.Book)

- com.coveros.training.persistence.PersistenceLayerTests::testWeCanSearchForALoanByABorrower() -> com.coveros.training.persistence.IPersistenceLayer::searchForLoanByBorrower(com.coveros.training.library.domainobjects.Borrower)

- com.coveros.training.persistence.PersistenceLayerTests::testShouldBeAbleToDeleteBorrower() -> com.coveros.training.persistence.IPersistenceLayer::deleteBorrower(long)

- com.coveros.training.persistence.PersistenceLayerTests::testShouldBeAbleToDeleteBorrower() -> com.coveros.training.persistence.IPersistenceLayer::searchBorrowerDataByName(java.lang.String)

- com.coveros.training.persistence.PersistenceLayerTests::testShouldListNoAvailableBooksIfAllCheckedOut() -> com.coveros.training.persistence.IPersistenceLayer::listAvailableBooks()

- com.coveros.training.persistence.PersistenceLayerTests::testShouldListNoAvailableBooksIfAllCheckedOut() -> com.coveros.training.persistence.IPersistenceLayer::createLoan(com.coveros.training.library.domainobjects.Book,com.coveros.training.library.domainobjects.Borrower,java.sql.Date)

- com.coveros.training.persistence.PersistenceLayerTests::testShouldListNoAvailableBooksIfAllCheckedOut() -> com.coveros.training.persistence.IPersistenceLayer::searchBorrowerDataByName(java.lang.String)

- com.coveros.training.persistence.PersistenceLayerTests::testShouldListNoAvailableBooksIfAllCheckedOut() -> com.coveros.training.persistence.IPersistenceLayer::searchBooksByTitle(java.lang.String)

- com.coveros.training.persistence.PersistenceLayerTests::testShouldUpdateBorrowerToDatabase() -> com.coveros.training.persistence.IPersistenceLayer::updateBorrower(long,java.lang.String)

- com.coveros.training.persistence.PersistenceLayerTests::testShouldUpdateBorrowerToDatabase() -> com.coveros.training.persistence.IPersistenceLayer::getBorrowerName(long)

- com.coveros.training.persistence.PersistenceLayerTests::testShouldBeAbleToSearchForBooksByTitle() -> com.coveros.training.persistence.IPersistenceLayer::searchBooksByTitle(java.lang.String)

- com.coveros.training.persistence.PersistenceLayerTests::testWeCanSaveANewUser() -> com.coveros.training.persistence.IPersistenceLayer::cleanAndMigrateDatabase()

- com.coveros.training.persistence.PersistenceLayerTests::testWeCanSaveANewUser() -> com.coveros.training.persistence.IPersistenceLayer::saveNewUser(java.lang.String)

- com.coveros.training.persistence.PersistenceLayerTests::testShouldBeAbleToSearchForBorrowersById() -> com.coveros.training.persistence.IPersistenceLayer::searchBorrowersById(long)

- com.coveros.training.persistence.PersistenceLayerTests::testWeCanCreateLoan() -> com.coveros.training.persistence.IPersistenceLayer::createLoan(com.coveros.training.library.domainobjects.Book,com.coveros.training.library.domainobjects.Borrower,java.sql.Date)

- com.coveros.training.persistence.PersistenceLayerTests::testExecuteUpdateTemplate_ExceptionThrown() -> com.coveros.training.persistence.PersistenceLayer::executeUpdateTemplate(java.lang.String,java.lang.String,java.lang.Object[])

- com.coveros.training.persistence.PersistenceLayerTests::testShouldListAllBorrowers() -> com.coveros.training.persistence.IPersistenceLayer::listAllBorrowers()

- com.coveros.training.persistence.PersistenceLayerTests::testWeCanSaveABook() -> com.coveros.training.persistence.IPersistenceLayer::cleanAndMigrateDatabase()

- com.coveros.training.persistence.PersistenceLayerTests::testWeCanSaveABook() -> com.coveros.training.persistence.IPersistenceLayer::saveNewBook(java.lang.String)

- com.coveros.training.persistence.PersistenceLayerTests::runBackup() -> com.coveros.training.persistence.IPersistenceLayer::runBackup(java.lang.String)

- com.coveros.training.persistence.PersistenceLayerTests::runRestore(java.lang.String) -> com.coveros.training.persistence.IPersistenceLayer::runRestore(java.lang.String)

- com.coveros.training.persistence.PersistenceLayerTests::testShouldBeAbleToSearchBorrowerByName() -> com.coveros.training.persistence.IPersistenceLayer::searchBorrowerDataByName(java.lang.String)

- com.coveros.training.persistence.PersistenceLayerTests::testShouldBeAbleToDeleteBook() -> com.coveros.training.persistence.IPersistenceLayer::deleteBook(long)

- com.coveros.training.persistence.PersistenceLayerTests::testShouldBeAbleToDeleteBook() -> com.coveros.training.persistence.IPersistenceLayer::searchBooksByTitle(java.lang.String)

- com.coveros.training.persistence.PersistenceLayerTests::testShouldSaveBorrowerToDatabase() -> com.coveros.training.persistence.IPersistenceLayer::saveNewBorrower(java.lang.String)

- com.coveros.training.persistence.PersistenceLayerTests::testShouldSaveBorrowerToDatabase() -> com.coveros.training.persistence.IPersistenceLayer::cleanAndMigrateDatabase()

- com.coveros.training.persistence.PersistenceLayerTests::testShouldBeAbleToSearchForBooksById() -> com.coveros.training.persistence.IPersistenceLayer::searchBooksById(long)

- com.coveros.training.persistence.PersistenceLayerTests::testShouldListAvailableBooks() -> com.coveros.training.persistence.IPersistenceLayer::listAvailableBooks()

- com.coveros.training.persistence.PersistenceLayerTests::testShouldListAvailableBooks() -> com.coveros.training.persistence.IPersistenceLayer::createLoan(com.coveros.training.library.domainobjects.Book,com.coveros.training.library.domainobjects.Borrower,java.sql.Date)

- com.coveros.training.persistence.PersistenceLayerTests::testShouldListAvailableBooks() -> com.coveros.training.persistence.IPersistenceLayer::searchBorrowerDataByName(java.lang.String)

- com.coveros.training.persistence.PersistenceLayerTests::testShouldListAvailableBooks() -> com.coveros.training.persistence.IPersistenceLayer::searchBooksByTitle(java.lang.String)

- com.coveros.training.persistence.PersistenceLayerTests::testGetBorrowerName_WhenExceptionThrown() -> com.coveros.training.persistence.PersistenceLayer::getBorrowerName(long)

- com.coveros.training.persistence.PersistenceLayerTests::testShouldListAllBooks() -> com.coveros.training.persistence.IPersistenceLayer::listAllBooks()

- com.coveros.training.persistence.PersistenceLayerTests::testShouldBeAbleToSearchAUserByName() -> com.coveros.training.persistence.IPersistenceLayer::searchForUserByName(java.lang.String)

- com.coveros.training.persistence.PersistenceLayerTests::testThatExecuteInsertOnPreparedStatementHandlesExceptions() -> com.coveros.training.persistence.PersistenceLayer::executeInsertOnPreparedStatement(com.coveros.training.persistence.SqlData,java.sql.PreparedStatement)

- com.coveros.training.persistence.PersistenceLayerTests::testThatExecuteInsertOnPreparedStatementHandlesExceptions() -> com.coveros.training.persistence.SqlData::createEmpty()

- com.coveros.training.persistence.PersistenceLayerTests::testGetBorrowerName_WhenNoValueReturned() -> com.coveros.training.persistence.PersistenceLayer::getBorrowerName(long)

- com.coveros.training.persistence.PersistenceLayerTests::testShouldListAllBooksIfNoneCheckedOut() -> com.coveros.training.persistence.IPersistenceLayer::listAvailableBooks()

- com.coveros.training.persistence.PersistenceLayerTests::testThatWeCanUpdateAUsersPassword() -> com.coveros.training.persistence.IPersistenceLayer::updateUserWithPassword(long,java.lang.String)

- com.coveros.training.persistence.PersistenceLayerTests::testThatWeCanUpdateAUsersPassword() -> com.coveros.training.persistence.IPersistenceLayer::areCredentialsValid(java.lang.String,java.lang.String)

- com.coveros.training.persistence.PersistenceLayerTests::testWeCanCreateALoan() -> com.coveros.training.persistence.IPersistenceLayer::createLoan(com.coveros.training.library.domainobjects.Book,com.coveros.training.library.domainobjects.Borrower,java.sql.Date)

- com.coveros.training.persistence.SqlDataTests::testCanCreateEmpty() -> com.coveros.training.persistence.SqlData::isEmpty()

- com.coveros.training.persistence.SqlDataTests::testCanCreateEmpty() -> com.coveros.training.persistence.SqlData::createEmpty()

- com.coveros.training.persistence.SqlDataTests::applyParam(java.lang.Object,java.lang.Class) -> com.coveros.training.persistence.SqlData::addParameter(java.lang.Object,java.lang.Class)

- com.coveros.training.persistence.SqlDataTests::applyParam(java.lang.Object,java.lang.Class) -> com.coveros.training.persistence.SqlData::applyParametersToPreparedStatement(java.sql.PreparedStatement)

- com.coveros.training.persistence.SqlDataTests::testShouldOutputGoodString() -> com.coveros.training.persistence.SqlData::toString()

- com.coveros.training.tomcat.WebAppListenerTests::testContextDestroyed() -> com.coveros.training.tomcat.WebAppListener::contextDestroyed(javax.servlet.ServletContextEvent)

- com.coveros.training.tomcat.WebAppListenerTests::testContextInitialized() -> com.coveros.training.tomcat.WebAppListener::contextInitialized(javax.servlet.ServletContextEvent)


## persistence
### Potential inter-service method interactions
- com.coveros.training.authentication.LoginStepDefs::whenAUserAuthenticatesWithAnd(java.lang.String,java.lang.String) -> com.coveros.training.authentication.LoginUtils::isUserRegistered(java.lang.String,java.lang.String)

- com.coveros.training.authentication.LoginStepDefs::isRegisteredInSystemWithPassword(java.lang.String,java.lang.String) -> com.coveros.training.authentication.RegistrationUtils::processRegistration(java.lang.String,java.lang.String)

- com.coveros.training.authentication.RegistrationStepDefs::theyEnterTheirUsernameAndProvideAPoorPassword(java.lang.String) -> com.coveros.training.authentication.RegistrationUtils::processRegistration(java.lang.String,java.lang.String)

- com.coveros.training.authentication.RegistrationStepDefs::theyRegisterWithThatUsernameAndUseThePassword(java.lang.String) -> com.coveros.training.authentication.RegistrationUtils::processRegistration(java.lang.String,java.lang.String)

- com.coveros.training.authentication.RegistrationStepDefs::they_become_registered() -> com.coveros.training.authentication.RegistrationUtils::isUserInDatabase(java.lang.String)

- com.coveros.training.authentication.RegistrationStepDefs::userIsRegistered(java.lang.String) -> com.coveros.training.authentication.RegistrationUtils::isUserInDatabase(java.lang.String)

- com.coveros.training.authentication.RegistrationStepDefs::theyFailToRegisterAndTheSystemIndicatesAResponse(java.lang.String) -> com.coveros.training.authentication.domainobjects.RegistrationResult::toString()

- com.coveros.training.authentication.RegistrationStepDefs::theyTryRegisteringWithThePasswordPassword(java.lang.String) -> com.coveros.training.authentication.RegistrationUtils::isPasswordGood(java.lang.String)

- com.coveros.training.authentication.RegistrationStepDefs::aUsernameOfIsRegistered(java.lang.String) -> com.coveros.training.authentication.RegistrationUtils::processRegistration(java.lang.String,java.lang.String)

- com.coveros.training.authentication.RegistrationStepDefs::a_user_tries_to_register_with_that_same_name() -> com.coveros.training.authentication.RegistrationUtils::processRegistration(java.lang.String,java.lang.String)

- com.coveros.training.cartesianproduct.CartesianProductStepDefs::weCalculateTheCombinations() -> com.coveros.training.cartesianproduct.CartesianProduct::calculate(java.util.Set)

- com.coveros.training.expenses.AlcoholStepDefs::iCalculateTheAlcoholRelatedPortion() -> com.coveros.training.expenses.AlcoholCalculator::calculate(com.coveros.training.expenses.DinnerPrices)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::aBookIsLoanedOut(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::aBookIsLoanedOut(java.lang.String) -> com.coveros.training.library.LibraryUtils::lendBook(java.lang.String,java.lang.String,java.sql.Date)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::aBookIsLoanedOut(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::aBookIsCurrentlyLoanedOut(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::aBookIsCurrentlyLoanedOut(java.lang.String) -> com.coveros.training.library.LibraryUtils::lendBook(java.lang.String,java.lang.String,java.sql.Date)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::aBookIsCurrentlyLoanedOut(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::aBookIsCurrentlyLoanedOutTo(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::aBookIsCurrentlyLoanedOutTo(java.lang.String) -> com.coveros.training.library.LibraryUtils::lendBook(java.lang.String,java.lang.String,java.sql.Date)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::aBookIsCurrentlyLoanedOutTo(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_registers_that_borrower() -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::the_system_does_not_have_the_borrower_registered() -> com.coveros.training.library.domainobjects.Borrower::isEmpty()

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::the_system_does_not_have_the_borrower_registered() -> com.coveros.training.library.LibraryUtils::searchForBorrowerByName(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_searches_by_its_id() -> com.coveros.training.library.LibraryUtils::searchForBookById(long)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_searches_for_a_borrower_by_id(java.lang.Integer) -> com.coveros.training.library.LibraryUtils::searchForBorrowerById(long)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::the_system_does_not_have_the_book_registered() -> com.coveros.training.library.domainobjects.Book::isEmpty()

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::the_system_does_not_have_the_book_registered() -> com.coveros.training.library.LibraryUtils::searchForBookByTitle(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_searches_for_a_borrower_by_name_of(java.lang.String) -> com.coveros.training.library.LibraryUtils::searchForBorrowerByName(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::the_system_reports_that_there_are_no_borrowers_found_with_that_name() -> com.coveros.training.library.domainobjects.Borrower::isEmpty()

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_library_with_the_following_books_registered() -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_searches_for_a_book_by_id(java.lang.Integer) -> com.coveros.training.library.LibraryUtils::searchForBookById(long)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_lists_all_the_registered_books() -> com.coveros.training.library.LibraryUtils::listAllBooks()

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_lists_the_available_books() -> com.coveros.training.library.LibraryUtils::listAvailableBooks()

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_searches_for_a_book_by_title_of(java.lang.String) -> com.coveros.training.library.LibraryUtils::searchForBookByTitle(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_lists_all_the_borrowers() -> com.coveros.training.library.LibraryUtils::listAllBorrowers()

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_searches_by_that_id() -> com.coveros.training.library.LibraryUtils::searchForBorrowerById(long)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_searches_by_that_id() -> com.coveros.training.library.LibraryUtils::searchForBorrowerByName(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_searches_by_that_name() -> com.coveros.training.library.LibraryUtils::searchForBorrowerByName(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_lists_all_the_registered_borrowers() -> com.coveros.training.library.LibraryUtils::listAllBorrowers()

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::some_books_are_checked_out() -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::some_books_are_checked_out() -> com.coveros.training.library.LibraryUtils::lendBook(java.lang.String,java.lang.String,java.sql.Date)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::some_books_are_checked_out() -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::the_system_returns_an_empty_result_for_the_book() -> com.coveros.training.library.domainobjects.Book::isEmpty()

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::the_system_reports_that_there_are_no_borrowers_with_that_id() -> com.coveros.training.library.domainobjects.Borrower::isEmpty()

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_deletes_that_borrower() -> com.coveros.training.library.LibraryUtils::deleteBorrower(com.coveros.training.library.domainobjects.Borrower)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_book_is_currently_registered_in_the_system(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_book_is_currently_registered_in_the_system(java.lang.String) -> com.coveros.training.library.LibraryUtils::searchForBookByTitle(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::aBookIsLoanedTo(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::aBookIsLoanedTo(java.lang.String) -> com.coveros.training.library.LibraryUtils::lendBook(java.lang.String,java.lang.String,java.sql.Date)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::aBookIsLoanedTo(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::aBookIsLoanedTo(java.lang.String) -> com.coveros.training.library.LibraryUtils::searchForBookByTitle(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::the_system_has_the_borrower_registered() -> com.coveros.training.library.LibraryUtils::searchForBorrowerByName(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_searches_by_that_title() -> com.coveros.training.library.LibraryUtils::searchForBookByTitle(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_registers_that_book() -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_registers_that_book() -> com.coveros.training.library.LibraryUtils::searchForBookByTitle(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_library_with_the_following_borrowers_registered() -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::the_system_returns_an_empty_result_for_the_borrower() -> com.coveros.training.library.domainobjects.Borrower::isEmpty()

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_borrower_is_currently_registered_in_the_system(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::theLoanIsDeletedAsWell() -> com.coveros.training.library.domainobjects.Loan::isEmpty()

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::theLoanIsDeletedAsWell() -> com.coveros.training.library.LibraryUtils::searchForLoanByBook(com.coveros.training.library.domainobjects.Book)

- com.coveros.training.library.AddDeleteListSearchBooksAndBorrowersStepDefs::a_librarian_deletes_that_book() -> com.coveros.training.library.LibraryUtils::deleteBook(com.coveros.training.library.domainobjects.Book)

- com.coveros.training.library.BookCheckOutStepDefs::another_borrower_tries_to_borrow_that_book(java.lang.String) -> com.coveros.training.library.LibraryUtils::lendBook(java.lang.String,java.lang.String,java.sql.Date)

- com.coveros.training.library.BookCheckOutStepDefs::another_borrower_tries_to_borrow_that_book(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::they_borrow_another_book() -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::they_borrow_another_book() -> com.coveros.training.library.LibraryUtils::lendBook(java.lang.String,java.lang.String,java.sql.Date)

- com.coveros.training.library.BookCheckOutStepDefs::theSystemIndicatesTheBookIsLoanedToThemOnThatDate() -> com.coveros.training.library.LibraryUtils::searchForLoanByBook(com.coveros.training.library.domainobjects.Book)

- com.coveros.training.library.BookCheckOutStepDefs::aBorrowerIsRegistered(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::aBorrowerIsRegistered(java.lang.String) -> com.coveros.training.library.LibraryUtils::searchForBorrowerByName(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::theyTryToCheckOutABookThatIsAvailable(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::theyTryToCheckOutABookThatIsAvailable(java.lang.String) -> com.coveros.training.library.LibraryUtils::lendBook(com.coveros.training.library.domainobjects.Book,com.coveros.training.library.domainobjects.Borrower,java.sql.Date)

- com.coveros.training.library.BookCheckOutStepDefs::theyTryToCheckOutABookThatIsAvailable(java.lang.String) -> com.coveros.training.library.LibraryUtils::searchForBookByTitle(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::aBookIsAvailableForBorrowing(java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::aBookIsAvailableForBorrowing(java.lang.String) -> com.coveros.training.library.LibraryUtils::searchForBookByTitle(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::a_borrower_has_one_book_already_borrowed(java.lang.String,java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::a_borrower_has_one_book_already_borrowed(java.lang.String,java.lang.String) -> com.coveros.training.library.LibraryUtils::lendBook(java.lang.String,java.lang.String,java.sql.Date)

- com.coveros.training.library.BookCheckOutStepDefs::a_borrower_has_one_book_already_borrowed(java.lang.String,java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::andABookIsAlreadyCheckedOutTo(java.lang.String,java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::andABookIsAlreadyCheckedOutTo(java.lang.String,java.lang.String) -> com.coveros.training.library.LibraryUtils::lendBook(com.coveros.training.library.domainobjects.Book,com.coveros.training.library.domainobjects.Borrower,java.sql.Date)

- com.coveros.training.library.BookCheckOutStepDefs::andABookIsAlreadyCheckedOutTo(java.lang.String,java.lang.String) -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::andABookIsAlreadyCheckedOutTo(java.lang.String,java.lang.String) -> com.coveros.training.library.LibraryUtils::searchForBorrowerByName(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::andABookIsAlreadyCheckedOutTo(java.lang.String,java.lang.String) -> com.coveros.training.library.LibraryUtils::searchForBookByTitle(java.lang.String)

- com.coveros.training.library.BookCheckOutStepDefs::theSystemIndicatesTheBookIsLoanedToThemOnSomeDate() -> com.coveros.training.library.LibraryUtils::searchForLoanByBook(com.coveros.training.library.domainobjects.Book)

- com.coveros.training.library.BookCheckOutStepDefs::theyCheckOutTheBook() -> com.coveros.training.library.LibraryUtils::lendBook(com.coveros.training.library.domainobjects.Book,com.coveros.training.library.domainobjects.Borrower,java.sql.Date)

- com.coveros.training.library.BookCheckOutStepDefs::theyTryToCheckOutTheBookOn(java.lang.String) -> com.coveros.training.library.LibraryUtils::lendBook(com.coveros.training.library.domainobjects.Book,com.coveros.training.library.domainobjects.Borrower,java.sql.Date)

- com.coveros.training.library.BookCheckOutStepDefs::they_have_two_books_currently_borrowed() -> com.coveros.training.library.LibraryUtils::searchForLoanByBorrower(com.coveros.training.library.domainobjects.Borrower)

- com.coveros.training.library.BookCheckOutStepDefs::they_have_two_books_currently_borrowed() -> com.coveros.training.library.LibraryUtils::searchForBorrowerByName(java.lang.String)

- com.coveros.training.math.AckermannStepDefs::i_calculate_ackermann_s_formula_using_and(int,int) -> com.coveros.training.mathematics.Ackermann::calculate(int,int)

- com.coveros.training.math.FibonacciStepDefs::i_calculate_the(java.lang.Integer) -> com.coveros.training.mathematics.Fibonacci::calculate(long)

### Potential Test inter-service method interactions
- com.coveros.training.authentication.domainobjects.PasswordResultTests::createTestPasswordResult() -> com.coveros.training.authentication.domainobjects.PasswordResult::createDefault(com.coveros.training.authentication.domainobjects.PasswordResultEnums)

- com.coveros.training.authentication.domainobjects.PasswordResultTests::testCanCreateEmpty() -> com.coveros.training.authentication.domainobjects.PasswordResult::isEmpty()

- com.coveros.training.authentication.domainobjects.PasswordResultTests::testCanCreateEmpty() -> com.coveros.training.authentication.domainobjects.PasswordResult::createEmpty()

- com.coveros.training.authentication.domainobjects.PasswordResultTests::testShouldOutputGoodString() -> com.coveros.training.authentication.domainobjects.PasswordResult::toString()

- com.coveros.training.authentication.domainobjects.RegistrationResultTests::testCanCreateEmpty() -> com.coveros.training.authentication.domainobjects.RegistrationResult::isEmpty()

- com.coveros.training.authentication.domainobjects.RegistrationResultTests::testCanCreateEmpty() -> com.coveros.training.authentication.domainobjects.RegistrationResult::createEmpty()

- com.coveros.training.authentication.domainobjects.RegistrationResultTests::testShouldOutputGoodString() -> com.coveros.training.authentication.domainobjects.RegistrationResult::createEmpty()

- com.coveros.training.authentication.domainobjects.RegistrationResultTests::testShouldOutputGoodString() -> com.coveros.training.authentication.domainobjects.RegistrationResult::toString()

- com.coveros.training.authentication.domainobjects.UserTests::testCanCreateEmpty() -> com.coveros.training.authentication.domainobjects.User::isEmpty()

- com.coveros.training.authentication.domainobjects.UserTests::testCanCreateEmpty() -> com.coveros.training.authentication.domainobjects.User::createEmpty()

- com.coveros.training.authentication.domainobjects.UserTests::testShouldOutputGoodString() -> com.coveros.training.authentication.domainobjects.User::toString()

- com.coveros.training.authentication.LoginServletTests::testHappyPathPost() -> com.coveros.training.authentication.LoginServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.authentication.LoginServletTests::testShouldGetAccessDeniedIfUserNotRegistered() -> com.coveros.training.authentication.LoginServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.authentication.LoginServletTests::testEmptyString_Username() -> com.coveros.training.authentication.LoginServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.authentication.LoginServletTests::testEmptyString_Password() -> com.coveros.training.authentication.LoginServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.authentication.LoginServletTests::setMock_LoginUtilsUserRegistered(java.lang.String,java.lang.String,boolean) -> com.coveros.training.authentication.LoginUtils::isUserRegistered(java.lang.String,java.lang.String)

- com.coveros.training.authentication.LoginUtilsTests::testCanCreateEmpty() -> com.coveros.training.authentication.LoginUtils::isEmpty()

- com.coveros.training.authentication.LoginUtilsTests::testCanCreateEmpty() -> com.coveros.training.authentication.LoginUtils::createEmpty()

- com.coveros.training.authentication.LoginUtilsTests::testCanSeeIfUserRegistered() -> com.coveros.training.authentication.LoginUtils::isUserRegistered(java.lang.String,java.lang.String)

- com.coveros.training.authentication.NbvcxzTests::testShouldHaveSuccessfulEntropyInPassword() -> com.coveros.training.authentication.RegistrationUtils::isPasswordGood(java.lang.String)

- com.coveros.training.authentication.NbvcxzTests::testShouldHaveInsufficientEntropyInPassword() -> com.coveros.training.authentication.RegistrationUtils::isPasswordGood(java.lang.String)

- com.coveros.training.authentication.NbvcxzTests::testShouldHaveSufficientEntropyInPassword() -> com.coveros.training.authentication.RegistrationUtils::isPasswordGood(java.lang.String)

- com.coveros.training.authentication.RegisterServletTests::testEmptyString_Username() -> com.coveros.training.authentication.RegisterServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.authentication.RegisterServletTests::testEmptyString_Password() -> com.coveros.training.authentication.RegisterServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.authentication.RegisterServletTests::mockRegisterUserToReturnSomeResponse(com.coveros.training.authentication.domainobjects.RegistrationResult) -> com.coveros.training.authentication.RegistrationUtils::processRegistration(java.lang.String,java.lang.String)

- com.coveros.training.authentication.RegisterServletTests::doPostWithoutName() -> com.coveros.training.authentication.RegisterServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.authentication.RegisterServletTests::doPostWithName() -> com.coveros.training.authentication.RegisterServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.authentication.RegistrationUtilsTests::testShouldProcessRegistration_ExistingUser() -> com.coveros.training.authentication.RegistrationUtils::processRegistration(java.lang.String,java.lang.String)

- com.coveros.training.authentication.RegistrationUtilsTests::testShouldProcessRegistration_HappyPath() -> com.coveros.training.authentication.RegistrationUtils::processRegistration(java.lang.String,java.lang.String)

- com.coveros.training.authentication.RegistrationUtilsTests::testShouldFailOnEmptyPassword_EmptyString() -> com.coveros.training.authentication.RegistrationUtils::isPasswordGood(java.lang.String)

- com.coveros.training.authentication.RegistrationUtilsTests::testShouldFailOnShortPassword() -> com.coveros.training.authentication.RegistrationUtils::isPasswordGood(java.lang.String)

- com.coveros.training.authentication.RegistrationUtilsTests::testShouldDetermineIfUserInDatabase() -> com.coveros.training.authentication.RegistrationUtils::isUserInDatabase(java.lang.String)

- com.coveros.training.authentication.RegistrationUtilsTests::testShouldProcessRegistration_BadPassword() -> com.coveros.training.authentication.domainobjects.PasswordResult::toPrettyString()

- com.coveros.training.authentication.RegistrationUtilsTests::testShouldProcessRegistration_BadPassword() -> com.coveros.training.authentication.RegistrationUtils::processRegistration(java.lang.String,java.lang.String)

- com.coveros.training.authentication.RegistrationUtilsTests::testShouldProcessRegistration_BadPassword() -> com.coveros.training.authentication.RegistrationUtils::isPasswordGood(java.lang.String)

- com.coveros.training.authentication.RegistrationUtilsTests::testEmptyObject() -> com.coveros.training.authentication.RegistrationUtils::isEmpty()

- com.coveros.training.authentication.RegistrationUtilsTests::testEmptyObject() -> com.coveros.training.authentication.RegistrationUtils::createEmpty()

- com.coveros.training.authentication.RegistrationUtilsTests::testShouldProcessRegistration_EmptyUsername() -> com.coveros.training.authentication.RegistrationUtils::processRegistration(java.lang.String,java.lang.String)

- com.coveros.training.authentication.RegistrationUtilsTests::testShouldPerformWell() -> com.coveros.training.authentication.RegistrationUtils::isPasswordGood(java.lang.String)

- com.coveros.training.authentication.RegistrationUtilsTests::testShouldHaveSufficientEntropyInPassword() -> com.coveros.training.authentication.RegistrationUtils::isPasswordGood(java.lang.String)

- com.coveros.training.library.domainobjects.BookTests::testCanCreateEmpty() -> com.coveros.training.library.domainobjects.Book::isEmpty()

- com.coveros.training.library.domainobjects.BookTests::testCanCreateEmpty() -> com.coveros.training.library.domainobjects.Book::createEmpty()

- com.coveros.training.library.domainobjects.BookTests::testShouldOutputGoodString() -> com.coveros.training.library.domainobjects.Book::toString()

- com.coveros.training.library.domainobjects.BorrowerTests::testCanCreateEmpty() -> com.coveros.training.library.domainobjects.Borrower::isEmpty()

- com.coveros.training.library.domainobjects.BorrowerTests::testCanCreateEmpty() -> com.coveros.training.library.domainobjects.Borrower::createEmpty()

- com.coveros.training.library.domainobjects.BorrowerTests::testShouldOutputGoodString() -> com.coveros.training.library.domainobjects.Borrower::toString()

- com.coveros.training.library.domainobjects.BorrowerTests::testShouldReturnJsonString() -> com.coveros.training.library.domainobjects.Borrower::toOutputString()

- com.coveros.training.library.domainobjects.LoanTests::testCanCreateEmpty() -> com.coveros.training.library.domainobjects.Loan::isEmpty()

- com.coveros.training.library.domainobjects.LoanTests::testCanCreateEmpty() -> com.coveros.training.library.domainobjects.Loan::createEmpty()

- com.coveros.training.library.domainobjects.LoanTests::testShouldOutputGoodString() -> com.coveros.training.library.domainobjects.Loan::toString()

- com.coveros.training.library.LendingTests::testShouldNotLendIfBookNotRegistered() -> com.coveros.training.library.domainobjects.Book::createEmpty()

- com.coveros.training.library.LendingTests::testShouldNotLendIfBookNotRegistered() -> com.coveros.training.library.LibraryUtils::lendBook(com.coveros.training.library.domainobjects.Book,com.coveros.training.library.domainobjects.Borrower,java.sql.Date)

- com.coveros.training.library.LendingTests::mockThatBookNotRegistered(java.lang.String) -> com.coveros.training.library.domainobjects.Book::createEmpty()

- com.coveros.training.library.LendingTests::shouldRegisterBorrower() -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.LendingTests::shouldRegisterBook() -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.LendingTests::mockSearchForLoan() -> com.coveros.training.library.domainobjects.Loan::createEmpty()

- com.coveros.training.library.LendingTests::testShouldNotLendIfBorrowerNotRegistered() -> com.coveros.training.library.domainobjects.Borrower::createEmpty()

- com.coveros.training.library.LendingTests::testShouldNotLendIfBorrowerNotRegistered() -> com.coveros.training.library.LibraryUtils::lendBook(com.coveros.training.library.domainobjects.Book,com.coveros.training.library.domainobjects.Borrower,java.sql.Date)

- com.coveros.training.library.LendingTests::mockBorrowerNotRegistered(java.lang.String) -> com.coveros.training.library.domainobjects.Borrower::createEmpty()

- com.coveros.training.library.LendingTests::shouldNotLendIfCurrentlyBorrowed() -> com.coveros.training.library.LibraryUtils::lendBook(com.coveros.training.library.domainobjects.Book,com.coveros.training.library.domainobjects.Borrower,java.sql.Date)

- com.coveros.training.library.LendingTests::shouldNotLendIfCurrentlyBorrowed() -> com.coveros.training.library.LibraryUtils::searchForLoanByBook(com.coveros.training.library.domainobjects.Book)

- com.coveros.training.library.LendingTests::shouldLendToUser() -> com.coveros.training.library.LibraryUtils::lendBook(com.coveros.training.library.domainobjects.Book,com.coveros.training.library.domainobjects.Borrower,java.sql.Date)

- com.coveros.training.library.LibraryBookListAvailableServletTests::testListAvailableBooks_MultipleBook() -> com.coveros.training.library.LibraryBookListAvailableServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBookListAvailableServletTests::testListAvailableBooks_MultipleBook() -> com.coveros.training.library.LibraryUtils::listAvailableBooks()

- com.coveros.training.library.LibraryBookListAvailableServletTests::testListAvailableBooks_OneBook() -> com.coveros.training.library.LibraryBookListAvailableServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBookListAvailableServletTests::testListAvailableBooks_OneBook() -> com.coveros.training.library.LibraryUtils::listAvailableBooks()

- com.coveros.training.library.LibraryBookListAvailableServletTests::testSearchNoBooks() -> com.coveros.training.library.LibraryBookListAvailableServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBookListAvailableServletTests::testListAvailableBooks_EmptyList() -> com.coveros.training.library.LibraryBookListAvailableServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchById_noBookFound() -> com.coveros.training.library.domainobjects.Book::createEmpty()

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchById_noBookFound() -> com.coveros.training.library.LibraryBookListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchById_noBookFound() -> com.coveros.training.library.LibraryUtils::searchForBookById(long)

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchNoBooks() -> com.coveros.training.library.LibraryBookListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchNothingFoundById() -> com.coveros.training.library.domainobjects.Book::createEmpty()

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchNothingFoundById() -> com.coveros.training.library.LibraryBookListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchNothingFoundById() -> com.coveros.training.library.LibraryUtils::searchForBookById(long)

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchByTitle() -> com.coveros.training.library.LibraryBookListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchByTitle() -> com.coveros.training.library.LibraryUtils::searchForBookByTitle(java.lang.String)

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchIdAndTitle() -> com.coveros.training.library.LibraryBookListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBookListSearchServletTests::testListAllBooks() -> com.coveros.training.library.LibraryBookListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBookListSearchServletTests::testListAllBooks() -> com.coveros.training.library.LibraryUtils::listAllBooks()

- com.coveros.training.library.LibraryBookListSearchServletTests::testListAllBooks_NoBooksInDatabase() -> com.coveros.training.library.LibraryBookListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchById() -> com.coveros.training.library.LibraryBookListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchById() -> com.coveros.training.library.LibraryUtils::searchForBookById(long)

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchNothingFoundByTitle() -> com.coveros.training.library.domainobjects.Book::createEmpty()

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchNothingFoundByTitle() -> com.coveros.training.library.LibraryBookListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBookListSearchServletTests::testSearchNothingFoundByTitle() -> com.coveros.training.library.LibraryUtils::searchForBookByTitle(java.lang.String)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchByNameNotFound() -> com.coveros.training.library.domainobjects.Borrower::createEmpty()

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchByNameNotFound() -> com.coveros.training.library.LibraryBorrowerListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchByNameNotFound() -> com.coveros.training.library.LibraryUtils::searchForBorrowerByName(java.lang.String)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchByName() -> com.coveros.training.library.LibraryBorrowerListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchByName() -> com.coveros.training.library.LibraryUtils::searchForBorrowerByName(java.lang.String)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchByBadId() -> com.coveros.training.library.LibraryBorrowerListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchByBadId() -> com.coveros.training.library.LibraryUtils::searchForBorrowerById(long)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchNothingFoundByName() -> com.coveros.training.library.domainobjects.Borrower::createEmpty()

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchNothingFoundByName() -> com.coveros.training.library.LibraryBorrowerListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchNothingFoundByName() -> com.coveros.training.library.LibraryUtils::searchForBorrowerByName(java.lang.String)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchNoBorrowers() -> com.coveros.training.library.LibraryBorrowerListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchNothingFoundById() -> com.coveros.training.library.domainobjects.Borrower::createEmpty()

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchNothingFoundById() -> com.coveros.training.library.LibraryBorrowerListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchNothingFoundById() -> com.coveros.training.library.LibraryUtils::searchForBorrowerById(long)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchIdAndName() -> com.coveros.training.library.LibraryBorrowerListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testListAllBorrowers() -> com.coveros.training.library.LibraryBorrowerListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testListAllBorrowers() -> com.coveros.training.library.LibraryUtils::listAllBorrowers()

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testListAllBorrowers_noBorrowersExist() -> com.coveros.training.library.LibraryBorrowerListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchById() -> com.coveros.training.library.domainobjects.Borrower::createEmpty()

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchById() -> com.coveros.training.library.LibraryBorrowerListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchById() -> com.coveros.training.library.LibraryUtils::searchForBorrowerById(long)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchBorrowerFoundById() -> com.coveros.training.library.LibraryBorrowerListSearchServlet::doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryBorrowerListSearchServletTests::testSearchBorrowerFoundById() -> com.coveros.training.library.LibraryUtils::searchForBorrowerById(long)

- com.coveros.training.library.LibraryLendServletTests::testHappyPathPost() -> com.coveros.training.library.LibraryLendServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryLendServletTests::testHappyPathPost() -> com.coveros.training.library.LibraryUtils::lendBook(java.lang.String,java.lang.String,java.sql.Date)

- com.coveros.training.library.LibraryLendServletTests::testEmptyString_Book() -> com.coveros.training.library.LibraryLendServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryLendServletTests::testDateFunction() -> com.coveros.training.library.LibraryLendServlet::getDateNow()

- com.coveros.training.library.LibraryLendServletTests::testEmptyString_Borrower() -> com.coveros.training.library.LibraryLendServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryRegisterBookServletTests::testHappyPathPost() -> com.coveros.training.library.LibraryRegisterBookServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryRegisterBookServletTests::testHappyPathPost() -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.LibraryRegisterBookServletTests::testEmptyString() -> com.coveros.training.library.LibraryRegisterBookServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryRegisterBorrowerServletTests::testHappyPathPost() -> com.coveros.training.library.LibraryRegisterBorrowerServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryRegisterBorrowerServletTests::testHappyPathPost() -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.LibraryRegisterBorrowerServletTests::testEmptyString() -> com.coveros.training.library.LibraryRegisterBorrowerServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.library.LibraryUtilsTests::testCanLendBook_wrapperMethod() -> com.coveros.training.library.domainobjects.Loan::createEmpty()

- com.coveros.training.library.LibraryUtilsTests::testCanLendBook_wrapperMethod() -> com.coveros.training.library.LibraryUtils::lendBook(java.lang.String,java.lang.String,java.sql.Date)

- com.coveros.training.library.LibraryUtilsTests::testShouldThrowExceptionWhenSearchingWithEmptyStringAsBookTitle() -> com.coveros.training.library.LibraryUtils::searchForBookByTitle(java.lang.String)

- com.coveros.training.library.LibraryUtilsTests::testCanRegisterBorrower() -> com.coveros.training.library.domainobjects.Borrower::createEmpty()

- com.coveros.training.library.LibraryUtilsTests::testCanRegisterBorrower() -> com.coveros.training.library.LibraryUtils::registerBorrower(java.lang.String)

- com.coveros.training.library.LibraryUtilsTests::testCanSearchForBooksById() -> com.coveros.training.library.LibraryUtils::searchForBookById(long)

- com.coveros.training.library.LibraryUtilsTests::testCanSearchForLoanByBook() -> com.coveros.training.library.LibraryUtils::searchForLoanByBook(com.coveros.training.library.domainobjects.Book)

- com.coveros.training.library.LibraryUtilsTests::testCanRegisterBook() -> com.coveros.training.library.domainobjects.Book::createEmpty()

- com.coveros.training.library.LibraryUtilsTests::testCanRegisterBook() -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.LibraryUtilsTests::testCannotDeleteNonRegisteredBook() -> com.coveros.training.library.LibraryUtils::deleteBook(com.coveros.training.library.domainobjects.Book)

- com.coveros.training.library.LibraryUtilsTests::testCanCreateEmpty() -> com.coveros.training.library.LibraryUtils::createEmpty()

- com.coveros.training.library.LibraryUtilsTests::testCanCreateEmpty() -> com.coveros.training.library.LibraryUtils::isEmpty()

- com.coveros.training.library.LibraryUtilsTests::testCanLendBook() -> com.coveros.training.library.domainobjects.Loan::createEmpty()

- com.coveros.training.library.LibraryUtilsTests::testCanLendBook() -> com.coveros.training.library.LibraryUtils::lendBook(com.coveros.training.library.domainobjects.Book,com.coveros.training.library.domainobjects.Borrower,java.sql.Date)

- com.coveros.training.library.LibraryUtilsTests::testCannotDeleteNonRegisteredBorrower() -> com.coveros.training.library.LibraryUtils::deleteBorrower(com.coveros.training.library.domainobjects.Borrower)

- com.coveros.training.library.LibraryUtilsTests::testShouldThrowExceptionWhenSearchingWithLessThanOneAsBookId() -> com.coveros.training.library.LibraryUtils::searchForBookById(long)

- com.coveros.training.library.LibraryUtilsTests::testCanDeleteBook() -> com.coveros.training.library.LibraryUtils::deleteBook(com.coveros.training.library.domainobjects.Book)

- com.coveros.training.library.LibraryUtilsTests::testCanSearchForBooksByTitle() -> com.coveros.training.library.LibraryUtils::searchForBookByTitle(java.lang.String)

- com.coveros.training.library.LibraryUtilsTests::testCanSearchForLoanByBorrower() -> com.coveros.training.library.LibraryUtils::searchForLoanByBorrower(com.coveros.training.library.domainobjects.Borrower)

- com.coveros.training.library.LibraryUtilsTests::testShouldListAvailableBooks() -> com.coveros.training.library.LibraryUtils::listAvailableBooks()

- com.coveros.training.library.LibraryUtilsTests::testCanSearchForBorrowerByName() -> com.coveros.training.library.LibraryUtils::searchForBorrowerByName(java.lang.String)

- com.coveros.training.library.LibraryUtilsTests::testCannotRegisterBookWithEmptyString() -> com.coveros.training.library.LibraryUtils::registerBook(java.lang.String)

- com.coveros.training.library.LibraryUtilsTests::testShouldBeAbleToListAllBooks() -> com.coveros.training.library.LibraryUtils::listAllBooks()

- com.coveros.training.library.LibraryUtilsTests::testCanDeleteBorrower() -> com.coveros.training.library.LibraryUtils::deleteBorrower(com.coveros.training.library.domainobjects.Borrower)

- com.coveros.training.library.LibraryUtilsTests::testShouldBeAbleToListAllBorrowers() -> com.coveros.training.library.LibraryUtils::listAllBorrowers()

- com.coveros.training.mathematics.AckServletTests::testPostService_Forward() -> com.coveros.training.mathematics.AckServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.mathematics.AckServletTests::testPostService_HappyPath() -> com.coveros.training.mathematics.AckServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.mathematics.AckServletTests::testPostService_realForward_withException() -> com.coveros.training.mathematics.AckServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.mathematics.AckServletTests::testPostService_TailRecursive() -> com.coveros.training.mathematics.AckServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.mathematics.AckermannIterativeParameterizedTests::testCalculateIterative() -> com.coveros.training.mathematics.AckermannIterative::calculate(int,int)

- com.coveros.training.mathematics.AckermannParameterizedTests::testShouldProperlyCalculate() -> com.coveros.training.mathematics.Ackermann::calculate(int,int)

- com.coveros.training.mathematics.FibServletTests::testPostService_Forward() -> com.coveros.training.mathematics.FibServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.mathematics.FibServletTests::testPostService_tailRecursive1() -> com.coveros.training.mathematics.FibServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.mathematics.FibServletTests::testPostService_tailRecursive2() -> com.coveros.training.mathematics.FibServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.mathematics.FibServletTests::testPostService_HappyPath() -> com.coveros.training.mathematics.FibServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.mathematics.FibServletTests::testPostService_realForward_withException() -> com.coveros.training.mathematics.FibServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.mathematics.FibonacciParameterizedTests::test() -> com.coveros.training.mathematics.Fibonacci::calculate(long)

- com.coveros.training.mathematics.FibonacciParameterizedTests::testIterative2() -> com.coveros.training.mathematics.FibonacciIterative::fibAlgo2(int)

- com.coveros.training.mathematics.FibonacciParameterizedTests::testIterative1() -> com.coveros.training.mathematics.FibonacciIterative::fibAlgo1(long)

- com.coveros.training.mathematics.FibonacciTests::testLargerValuesFibAlgo2() -> com.coveros.training.mathematics.FibonacciIterative::fibAlgo2(int)

- com.coveros.training.mathematics.FibonacciTests::testSmallValuesFibAlgo1() -> com.coveros.training.mathematics.FibonacciIterative::fibAlgo1(long)

- com.coveros.training.mathematics.FibonacciTests::testLargerValuesFibAlgo1() -> com.coveros.training.mathematics.FibonacciIterative::fibAlgo1(long)

- com.coveros.training.mathematics.FibonacciTests::testSmallValuesFibAlgo2() -> com.coveros.training.mathematics.FibonacciIterative::fibAlgo2(int)

- com.coveros.training.mathematics.FibonacciTests::testLargeValuesFibAlgo1() -> com.coveros.training.mathematics.FibonacciIterative::fibAlgo1(long)

- com.coveros.training.mathematics.FibonacciTests::testLargeValuesFibAlgo2() -> com.coveros.training.mathematics.FibonacciIterative::fibAlgo2(int)

- com.coveros.training.mathematics.MathServletTests::testPostService_Forward() -> com.coveros.training.mathematics.MathServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.mathematics.MathServletTests::testPostService_HappyPath() -> com.coveros.training.mathematics.MathServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

- com.coveros.training.mathematics.MathServletTests::testPostService_realForward_withException() -> com.coveros.training.mathematics.MathServlet::doPost(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)

