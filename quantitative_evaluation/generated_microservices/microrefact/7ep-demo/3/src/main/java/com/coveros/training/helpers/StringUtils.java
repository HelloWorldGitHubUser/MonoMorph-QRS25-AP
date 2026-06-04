package com.coveros.training.helpers;
 import org.apache.logging.log4j.core.util.JsonUtils;
import org.checkerframework.checker.nullness.qual.Nullable;
public class StringUtils {

     static final byte SINGLE_QUOTE    = 39;
    static final byte DOUBLE_QUOTE    = 34;
    static final byte BACKSLASH       = 92;
    static final byte NEW_LINE        = 10;
    static final byte CARRIAGE_RETURN = 13;
    static final byte TAB             = 9;
    static final byte BACKSPACE       = 8;
    static final byte FORM_FEED       = 12;

private StringUtils() {

// using a private constructor to hide the implicit public one.

}
public static String escapeForJson(String value){

    StringBuilder sb = new StringBuilder();

    JsonUtils.quoteAsString(value, sb);

    return sb.toString();

}


public static String makeNotNullable(String s){

    return s == null ? "" : s;

}


}
