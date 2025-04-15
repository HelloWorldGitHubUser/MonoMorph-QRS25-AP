package com.coveros.training.library.domainobjects;
 import com.coveros.training.helpers.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.checkerframework.checker.nullness.qual.Nullable;
public class Borrower {

 public  long id;

 public  String name;

public Borrower(long id, String name) {
    this.id = id;
    this.name = name;
}
public Borrower createEmpty(){
    return new Borrower(0, "");
}


public int hashCode(){
    // you pick a hard-coded, randomly chosen, non-zero, odd number
    // ideally different for each class
    return new HashCodeBuilder(17, 37).append(id).append(name).toHashCode();
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
    Borrower rhs = (Borrower) obj;
    return new EqualsBuilder().append(id, rhs.id).append(name, rhs.name).isEquals();
}


public String toOutputString(){
    return String.format("{\"Name\": \"%s\", \"Id\": \"%s\"}", StringUtils.escapeForJson(name), id);
}


public boolean isEmpty(){
    return this.equals(createEmpty());
}


public String toString(){
    return ToStringBuilder.reflectionToString(this);
}


}