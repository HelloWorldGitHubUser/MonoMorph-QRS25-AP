package com.coveros.training.library.domainobjects;
 import com.coveros.training.helpers.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.checkerframework.checker.nullness.qual.Nullable;
public class Book {

 public  String title;

 public  long id;

public Book(long id, String title) {
    this.title = title;
    this.id = id;
}
public Book createEmpty(){
    return new Book(0, "");
}


public int hashCode(){
    // you pick a hard-coded, randomly chosen, non-zero, odd number
    // ideally different for each class
    return new HashCodeBuilder(13, 33).append(id).append(title).toHashCode();
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
    Book rhs = (Book) obj;
    return new EqualsBuilder().append(id, rhs.id).append(title, rhs.title).isEquals();
}


public String toOutputString(){
    return String.format("{\"Title\": \"%s\", \"Id\": \"%s\"}", StringUtils.escapeForJson(title), id);
}


public boolean isEmpty(){
    return this.equals(createEmpty());
}


public String toString(){
    return ToStringBuilder.reflectionToString(this);
}


}