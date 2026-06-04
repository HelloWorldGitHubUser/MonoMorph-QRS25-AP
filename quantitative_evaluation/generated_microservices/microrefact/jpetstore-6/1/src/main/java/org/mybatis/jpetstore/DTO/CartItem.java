package org.mybatis.jpetstore.DTO;
 import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Optional;
import org.mybatis.jpetstore.domain.Item;
public class CartItem implements Serializable{

 private  long serialVersionUID;

 private  Item item;

 private  int quantity;

 private  boolean inStock;

 private  BigDecimal total;


public int getQuantity(){
    return quantity;
}


public Item getItem(){
    return item;
}


public BigDecimal getTotal(){
    return total;
}


}
