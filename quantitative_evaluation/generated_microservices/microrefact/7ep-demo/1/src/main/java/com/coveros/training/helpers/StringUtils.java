package com.coveros.training.helpers;
 import org.apache.logging.log4j.core.util.JsonUtils;
import org.checkerframework.checker.nullness.qual.Nullable;
public class StringUtils {

 static  byte SINGLE_QUOTE;

 static  byte DOUBLE_QUOTE;

 static  byte BACKSLASH;

 static  byte NEW_LINE;

 static  byte CARRIAGE_RETURN;

 static  byte TAB;

 static  byte BACKSPACE;

 static  byte FORM_FEED;

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
