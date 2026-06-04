package com.coveros.training.authentication.domainobjects;
 import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.checkerframework.checker.nullness.qual.Nullable;
public class RegistrationResult {

 public  boolean wasSuccessfullyRegistered;

 public  RegistrationStatusEnums status;

 private  String message;

public RegistrationResult(boolean wasSuccessfullyRegistered, RegistrationStatusEnums status, String message) {

    this.wasSuccessfullyRegistered = wasSuccessfullyRegistered;

    this.status = status;

    this.message = message;

}public RegistrationResult(boolean wasSuccessfullyRegistered, RegistrationStatusEnums status) {

    this(wasSuccessfullyRegistered, status, "");

}
public static RegistrationResult createEmpty(){

    return new RegistrationResult(false, RegistrationStatusEnums.EMPTY);

}


public int hashCode(){

    // you pick a hard-coded, randomly chosen, non-zero, odd number

    // ideally different for each class

    return new HashCodeBuilder(15, 33).append(wasSuccessfullyRegistered).append(status).append(message).toHashCode();

}


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

    RegistrationResult rhs = (RegistrationResult) obj;

    return new EqualsBuilder().append(wasSuccessfullyRegistered, rhs.wasSuccessfullyRegistered).append(status, rhs.status).append(message, rhs.message).isEquals();

}


public boolean isEmpty(){

    return this.equals(createEmpty());

}


public String toPrettyString(){

    return String.format("successfully registered: %s%n", wasSuccessfullyRegistered) + String.format("status: %s%n", status) + String.format("message: %n%n%s%n", message);

}


public String toString(){

    return ToStringBuilder.reflectionToString(this);

}


}