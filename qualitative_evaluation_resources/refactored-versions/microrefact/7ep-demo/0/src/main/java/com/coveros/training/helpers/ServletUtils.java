package com.coveros.training.helpers;
 import org.slf4j.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class ServletUtils {

 public  String RESTFUL_RESULT_JSP;

 public  String RESULT_JSP;

private ServletUtils() {
    // using a private constructor to hide the implicit public one.
}
public void forwardToRestfulResult(HttpServletRequest request,HttpServletResponse response,Logger logger){
    try {
        request.getRequestDispatcher(RESTFUL_RESULT_JSP).forward(request, response);
    } catch (Exception ex) {
        logger.error(String.format("failed during forward: %s", ex));
    }
}


public void forwardToResult(HttpServletRequest request,HttpServletResponse response,Logger logger){
    try {
        request.getRequestDispatcher(RESULT_JSP).forward(request, response);
    } catch (Exception ex) {
        logger.error(String.format("failed during forward: %s", ex));
    }
}


}