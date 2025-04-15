package org.mybatis.jpetstore.NEWInstance;
 import org.springframework.web.bind.annotation.*;
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


}