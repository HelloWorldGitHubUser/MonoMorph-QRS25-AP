package com.coveros.training.mathematics;
 @FunctionalInterface
public interface FunctionalField {


@SuppressWarnings("unchecked")
public V field(F field){
    return (V) untypedField(field);
}
;

public Object untypedField(F field)
;

}