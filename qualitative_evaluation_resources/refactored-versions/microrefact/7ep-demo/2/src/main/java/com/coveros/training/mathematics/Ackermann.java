package com.coveros.training.mathematics;
 import java.math.BigInteger;
public class Ackermann {

private Ackermann() {
    throw new IllegalStateException("Utility class");
}
public BigInteger ack(BigInteger m,BigInteger n){
    if (m.equals(BigInteger.ZERO)) {
        return n.add(BigInteger.ONE);
    }
    if (n.equals(BigInteger.ZERO)) {
        return ack(m.subtract(BigInteger.ONE), BigInteger.ONE);
    }
    return ack(m.subtract(BigInteger.ONE), ack(m, n.subtract(BigInteger.ONE)));
}


public BigInteger calculate(int m,int n){
    BigInteger bigM = BigInteger.valueOf(m);
    BigInteger bigN = BigInteger.valueOf(n);
    return ack(bigM, bigN);
}


}