package com.coveros.training.mathematics;
 import com.coveros.training.helpers.ServletUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigInteger;
@MultipartConfig
@WebServlet(name = "FibServlet", urlPatterns = { "/fibonacci" }, loadOnStartup = 1)
public class FibServlet extends HttpServlet{

 private  long serialVersionUID;

 public  String RESULT;

 public  String FIBONACCI_VALUE_IS;

 static  Logger logger;


public void defaultRecursiveCalculation(HttpServletRequest request,int itemA){
    final long result = Fibonacci.calculate(itemA);
    logger.info(FIBONACCI_VALUE_IS, result);
    request.setAttribute(RESULT, result);
}


public int putNumberInRequest(String itemName,HttpServletRequest request){
    int item = Integer.parseInt(request.getParameter(itemName));
    request.setAttribute(itemName, item);
    return item;
}


public void tailRecursiveAlgo2Calc(HttpServletRequest request,int fibParamN){
    final BigInteger result = FibonacciIterative.fibAlgo2(fibParamN);
    logger.info(FIBONACCI_VALUE_IS, result);
    request.setAttribute(RESULT, result);
}


public void forwardToResult(HttpServletRequest request,HttpServletResponse response,Logger logger){
    ServletUtils.forwardToRestfulResult(request, response, logger);
}


public void tailRecursiveAlgo1Calc(HttpServletRequest request,int fibParamN){
    final BigInteger result = FibonacciIterative.fibAlgo1(fibParamN);
    logger.info(FIBONACCI_VALUE_IS, result);
    request.setAttribute(RESULT, result);
}


@Override
public void doPost(HttpServletRequest request,HttpServletResponse response){
    try {
        int fibParamN = putNumberInRequest("fib_param_n", request);
        String algorithm = request.getParameter("fib_algorithm_choice");
        logger.info("received request to calculate the {}th fibonacci number by {}", fibParamN, algorithm);
        if (algorithm.equals("tail_recursive_1")) {
            tailRecursiveAlgo1Calc(request, fibParamN);
        } else if (algorithm.equals("tail_recursive_2")) {
            tailRecursiveAlgo2Calc(request, fibParamN);
        } else {
            defaultRecursiveCalculation(request, fibParamN);
        }
    } catch (NumberFormatException ex) {
        request.setAttribute(RESULT, "Error: only accepts integers");
    }
    forwardToResult(request, response, logger);
}


}