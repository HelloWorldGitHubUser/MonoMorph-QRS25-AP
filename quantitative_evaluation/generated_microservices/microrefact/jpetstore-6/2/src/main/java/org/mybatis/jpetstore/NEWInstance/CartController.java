package org.mybatis.jpetstore.NEWInstance;
 import org.springframework.web.bind.annotation.*;
import org.mybatis.jpetstore.domain.Cart;
import org.mybatis.jpetstore.DTO.Item;
import org.mybatis.jpetstore.domain.CartItem;
import java.util.Iterator;
@RestController
@CrossOrigin
public class CartController {

 private Cart cart;


@GetMapping
("/containsItemId")
public boolean containsItemId(@RequestParam(name = "itemId") String itemId){
  return cart.containsItemId(itemId);
}


@PutMapping
("/addItem")
public void addItem(@RequestParam(name = "item") Item item,@RequestParam(name = "isInStock") boolean isInStock){
cart.addItem(item,isInStock);
}


@PutMapping
("/incrementQuantityByItemId")
public void incrementQuantityByItemId(@RequestParam(name = "itemId") String itemId){
cart.incrementQuantityByItemId(itemId);
}


@GetMapping
("/removeItemById")
public Item removeItemById(@RequestParam(name = "itemId") String itemId){
  return cart.removeItemById(itemId);
}

@GetMapping
("/getAllCartItems")
public Iterator<CartItem> getAllCartItems(){
  return cart.getAllCartItems();
}
@PutMapping
("/setQuantityByItemId")
public void setQuantityByItemId(@RequestParam(name = "itemId") String itemId,@RequestParam(name = "quantity") int quantity ){
cart.setQuantityByItemId(itemId,quantity);
}


}
