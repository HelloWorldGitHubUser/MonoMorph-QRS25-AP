package org.mybatis.jpetstore.domain;
 import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Optional;
import org.mybatis.jpetstore.Interface.Item;
public class LineItem implements Serializable{

 private  long serialVersionUID;

 private  int orderId;

 private  int lineNumber;

 private  int quantity;

 private  String itemId;

 private  BigDecimal unitPrice;

 private  Item item;

 private  BigDecimal total;

public LineItem() {
}/**
 * Instantiates a new line item.
 *
 * @param lineNumber
 *          the line number
 * @param cartItem
 *          the cart item
 */
public LineItem(int lineNumber, CartItem cartItem) {
    this.lineNumber = lineNumber;
    this.quantity = cartItem.getQuantity();
    this.itemId = cartItem.getItem().getItemId();
    this.unitPrice = cartItem.getItem().getListPrice();
    this.item = cartItem.getItem();
    calculateTotal();
}
public int getQuantity(){
    return quantity;
}


public void setUnitPrice(BigDecimal unitprice){
    this.unitPrice = unitprice;
}


public int getOrderId(){
    return orderId;
}


public Item getItem(){
    return item;
}


public void setOrderId(int orderId){
    this.orderId = orderId;
}


public int getLineNumber(){
    return lineNumber;
}


public void calculateTotal(){
    total = Optional.ofNullable(item).map(Item::getListPrice).map(v -> v.multiply(new BigDecimal(quantity))).orElse(null);
}


public String getItemId(){
    return itemId;
}


public void setQuantity(int quantity){
    this.quantity = quantity;
    calculateTotal();
}


public void setLineNumber(int lineNumber){
    this.lineNumber = lineNumber;
}


public BigDecimal getTotal(){
    return total;
}


public void setItemId(String itemId){
    this.itemId = itemId;
}


public BigDecimal getUnitPrice(){
    return unitPrice;
}


public void setItem(Item item){
    this.item = item;
    calculateTotal();
}


}