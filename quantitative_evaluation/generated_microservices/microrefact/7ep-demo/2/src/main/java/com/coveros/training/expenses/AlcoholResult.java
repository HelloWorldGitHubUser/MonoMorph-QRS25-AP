package com.coveros.training.expenses;
 public class AlcoholResult {

 private  Double foodPrice;

 private  Double alcoholPrice;

 private  Double foodRatio;

public AlcoholResult(Double foodPrice, Double alcoholPrice, Double foodRatio) {

    this.foodPrice = foodPrice;

    this.alcoholPrice = alcoholPrice;

    this.foodRatio = foodRatio;

}
public static AlcoholResult returnEmpty(){

    return new AlcoholResult(0d, 0d, 0d);

}


}
