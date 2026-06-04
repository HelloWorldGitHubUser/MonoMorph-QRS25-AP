package com.coveros.training.library.domainobjects;
 import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.checkerframework.checker.nullness.qual.Nullable;
import java.sql.Date;
public class Loan {

 public  java.sql.Date checkoutDate;

 public  Book book;

 public  Borrower borrower;

 public  long id;

public Loan(Book book, Borrower borrower, long id, Date checkoutDate) {

    this.book = book;

    this.borrower = borrower;

    this.id = id;

    this.checkoutDate = checkoutDate;

}
public static Loan createEmpty(){

    return new Loan(Book.createEmpty(), Borrower.createEmpty(), 0, new Date(0));

}


public int hashCode(){

    // you pick a hard-coded, randomly chosen, non-zero, odd number

    // ideally different for each class

    return new HashCodeBuilder(5, 21).append(book).append(borrower).append(id).append(checkoutDate).toHashCode();

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

    Loan rhs = (Loan) obj;

    return new EqualsBuilder().append(id, rhs.id).append(book, rhs.book).append(borrower, rhs.borrower).append(checkoutDate, rhs.checkoutDate).isEquals();

}


public boolean isEmpty(){

    return this.equals(createEmpty());

}


public String toString(){

    return ToStringBuilder.reflectionToString(this);

}


}
