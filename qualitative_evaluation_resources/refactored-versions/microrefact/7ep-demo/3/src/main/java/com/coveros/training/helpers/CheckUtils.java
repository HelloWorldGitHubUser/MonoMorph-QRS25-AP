package com.coveros.training.helpers;
 public class CheckUtils {

private CheckUtils() {
    // using a private constructor to hide the implicit public one.
}
public void IntParameterMustBePositive(long parameter){
    if (parameter <= 0) {
        throw new IllegalArgumentException("int value must be 1 or above.");
    }
}


public void StringMustNotBeNullOrEmpty(String values){
    for (String value : values) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("string must not be null or empty at this point");
        }
    }
}


public void mustBeTrueAtThisPoint(boolean mustBeTrue,String message){
    if (!mustBeTrue) {
        throw new AssertionException(message);
    }
}


}