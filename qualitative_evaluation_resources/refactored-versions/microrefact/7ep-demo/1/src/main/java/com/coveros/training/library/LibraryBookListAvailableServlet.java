package com.coveros.training.library;
 import com.coveros.training.library.domainobjects.Book;
import com.coveros.training.helpers.ServletUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.stream.Collectors;
@MultipartConfig
@WebServlet(name = "LibraryBookListAvailableSearch", urlPatterns = { "/listavailable" }, loadOnStartup = 1)
public class LibraryBookListAvailableServlet extends HttpServlet{

 private  long serialVersionUID;

 private  Logger logger;

 public  String RESULT;

 static  LibraryUtils libraryUtils;


@Override
public void doGet(HttpServletRequest request,HttpServletResponse response){
    final List<Book> books = libraryUtils.listAvailableBooks();
    logger.info("Received request for all available books");
    String result;
    if (books.isEmpty()) {
        result = "No books exist in the database";
    } else {
        final String allBooks = books.stream().map(Book::toOutputString).collect(Collectors.joining(","));
        result = "[" + allBooks + "]";
    }
    request.setAttribute(RESULT, result);
    ServletUtils.forwardToRestfulResult(request, response, logger);
}


}