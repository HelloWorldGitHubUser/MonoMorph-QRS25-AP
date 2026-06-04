package com.coveros.training.authentication.domainobjects;
 import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.checkerframework.checker.nullness.qual.Nullable;
public class PasswordResult {

 public  PasswordResultEnums status;

 private  Double entropy;

 public  String timeToCrackOffline;

 private  String timeToCrackOnline;

 private  String message;

 private  static String BASIC_PASSWORD_CHECKS_FAILED = "BASIC_PASSWORD_CHECKS_FAILED";

public PasswordResult(PasswordResultEnums status, Double entropy, String timeToCrackOffline, String timeToCrackOnline, String message) {

    this.status = status;

    this.entropy = entropy;

    this.timeToCrackOffline = timeToCrackOffline;

    this.timeToCrackOnline = timeToCrackOnline;

    this.message = message;

}
public static PasswordResult createEmpty(){

    return new PasswordResult(PasswordResultEnums.NULL, 0d, "", "", "");

}


@Override
public int hashCode(){

    // you pick a hard-coded, randomly chosen, non-zero, odd number

    // ideally different for each class

    return new HashCodeBuilder(15, 33).append(status).append(entropy).append(timeToCrackOffline).append(timeToCrackOnline).append(message).toHashCode();

}


@Override
public boolean equals(Object obj){

    if (obj == null) {

        return false;

    }

    if (obj == this) {

        return true;

    }

    if (obj.getClass() != getClass()) {

        return false;

    }

    PasswordResult rhs = (PasswordResult) obj;

    return new EqualsBuilder().append(status, rhs.status).append(entropy, rhs.entropy).append(timeToCrackOffline, rhs.timeToCrackOffline).append(timeToCrackOnline, rhs.timeToCrackOnline).append(message, rhs.message).isEquals();

}


public boolean isEmpty(){

    return this.equals(createEmpty());

}


public String toPrettyString(){

    return String.format("status: %s%n", status) + String.format("entropy: %s%n", entropy) + String.format("time to crack offline: %s%n", timeToCrackOffline) + String.format("time to crack online: %s%n", timeToCrackOnline) + String.format("Nbvcxz response: %s%n", message);

}


public String toString(){

    return ToStringBuilder.reflectionToString(this);

}


public static PasswordResult createDefault(PasswordResultEnums resultStatus){

    return new PasswordResult(resultStatus, 0d, "", "", BASIC_PASSWORD_CHECKS_FAILED);

}


}
