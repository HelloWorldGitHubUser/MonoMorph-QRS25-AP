package com.coveros.training.mathematics;
 import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public interface AckermannIterative {

 private  BigInteger ZERO;

 private  BigInteger ONE;

 private  BigInteger TWO;

 private  BigInteger THREE;

 private  BinaryOperator<BigInteger> ACKERMANN;


@Override
public Deque<BigInteger> stack(){
    return field(Field.STACK);
}
;

@Override
public boolean flag(){
    return field(Field.FLAG);
}
;

public AckermannIterative tail(BigInteger number1,BigInteger number2,Deque<BigInteger> stack,boolean flag){
    return (FunctionalAckermann) field -> {
        switch(field) {
            case NUMBER_1:
                return number1;
            case NUMBER_2:
                return number2;
            case STACK:
                return stack;
            case FLAG:
                return flag;
            default:
                throw new UnsupportedOperationException(field instanceof Field ? "Field checker has not been updated properly." : "Field is not of the correct type.");
        }
    };
}
;

@Override
public BigInteger number1(){
    return field(Field.NUMBER_1);
}
;

public BigInteger main(BigInteger m,BigInteger n){
    return ACKERMANN.apply(m, n);
}
;

public BigInteger calculate(int m,int n){
    BigInteger bigM = BigInteger.valueOf(m);
    BigInteger bigN = BigInteger.valueOf(n);
    return $.main(bigM, bigN);
}
;

@Override
public BigInteger number2(){
    return field(Field.NUMBER_2);
}
;

}