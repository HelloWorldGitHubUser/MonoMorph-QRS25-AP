package com.coveros.training.mathematics;
 import com.coveros.training.helpers.ServletUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@MultipartConfig
@WebServlet(name = "MathServlet", urlPatterns = { "/math" }, loadOnStartup = 1)
public class MathServlet extends HttpServlet{

 private  long serialVersionUID;

 static  org.slf4j.Logger logger;


public int putNumberInRequest(String itemName,HttpServletRequest request){
    int item = Integer.parseInt(request.getParameter(itemName));
    request.setAttribute(itemName, item);
    return item;
}


public void forwardToResult(HttpServletRequest request,HttpServletResponse response,Logger logger){
    ServletUtils.forwardToRestfulResult(request, response, logger);
}


public void setResultToSum(HttpServletRequest request,int itemA,int itemB){
    final int result = Calculator.add(itemA, itemB);
    request.setAttribute("result", result);
}


@Override
public void doPost(HttpServletRequest request,HttpServletResponse response){
    try {
        int itemA = putNumberInRequest("item_a", request);
        int itemB = putNumberInRequest("item_b", request);
        logger.info("received request to add two numbers, {} and {}", itemA, itemB);
        setResultToSum(request, itemA, itemB);
    } catch (NumberFormatException ex) {
        request.setAttribute("result", "Error: only accepts integers");
    }
    forwardToResult(request, response, logger);
}


}