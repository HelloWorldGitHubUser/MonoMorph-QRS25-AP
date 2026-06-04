package org.mybatis.jpetstore.domain;
 import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.mybatis.jpetstore.DTO.Item;
public class Cart implements Serializable{

 private  long serialVersionUID;

 private  Map<String,CartItem> itemMap;

 private  List<CartItem> itemList;


public void addItem(Item item,boolean isInStock){
    CartItem cartItem = itemMap.get(item.getItemId());
    if (cartItem == null) {
        cartItem = new CartItem();
        cartItem.setItem(item);
        cartItem.setQuantity(0);
        cartItem.setInStock(isInStock);
        itemMap.put(item.getItemId(), cartItem);
        itemList.add(cartItem);
    }
    cartItem.incrementQuantity();
}


public Iterator<CartItem> getAllCartItems(){
    return itemList.iterator();
}


public Iterator<CartItem> getCartItems(){
    return itemList.iterator();
}


public void incrementQuantityByItemId(String itemId){
    CartItem cartItem = itemMap.get(itemId);
    cartItem.incrementQuantity();
}


public BigDecimal getSubTotal(){
    return itemList.stream().map(cartItem -> cartItem.getItem().getListPrice().multiply(new BigDecimal(cartItem.getQuantity()))).reduce(BigDecimal.ZERO, BigDecimal::add);
}


public Item removeItemById(String itemId){
    CartItem cartItem = itemMap.remove(itemId);
    if (cartItem == null) {
        return null;
    } else {
        itemList.remove(cartItem);
        return cartItem.getItem();
    }
}


public void setQuantityByItemId(String itemId,int quantity){
    CartItem cartItem = itemMap.get(itemId);
    cartItem.setQuantity(quantity);
}


public List<CartItem> getCartItemList(){
    return itemList;
}


public int getNumberOfItems(){
    return itemList.size();
}


public boolean containsItemId(String itemId){
    return itemMap.containsKey(itemId);
}


}