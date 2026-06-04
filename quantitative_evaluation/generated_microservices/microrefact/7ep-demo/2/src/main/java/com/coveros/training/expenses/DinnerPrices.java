package com.coveros.training.expenses;
 public class DinnerPrices {

 private  double subTotal;

 private  double foodTotal;

 private  double tip;

 private  double tax;

public DinnerPrices(double subTotal, double foodTotal, double tip, double tax) {
    this.subTotal = subTotal;
    this.foodTotal = foodTotal;
    this.tip = tip;
    this.tax = tax;
}
}