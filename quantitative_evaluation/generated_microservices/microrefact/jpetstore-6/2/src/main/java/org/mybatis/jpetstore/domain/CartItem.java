package org.mybatis.jpetstore.domain;
 import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Optional;
import org.mybatis.jpetstore.DTO.Item;
public class CartItem implements Serializable{

 private  long serialVersionUID;

 private  Item item;

 private  int quantity;

 private  boolean inStock;

 private  BigDecimal total;


public void incrementQuantity(){
    quantity++;
    calculateTotal();
}


public void calculateTotal(){
    total = Optional.ofNullable(item).map(Item::getListPrice).map(v -> v.multiply(new BigDecimal(quantity))).orElse(null);
}


public int getQuantity(){
    return quantity;
}


public void setInStock(boolean inStock){
    this.inStock = inStock;
}


public void setQuantity(int quantity){
    this.quantity = quantity;
    calculateTotal();
}


public Item getItem(){
    return item;
}


public BigDecimal getTotal(){
    return total;
}


public boolean isInStock(){
    return inStock;
}


public void setItem(Item item){
    this.item = item;
    calculateTotal();
}


}
