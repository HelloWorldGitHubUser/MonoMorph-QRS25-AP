package org.mybatis.jpetstore.NEWInstance;
 import org.springframework.web.bind.annotation.*;
import org.mybatis.jpetstore.domain.Item;
import java.math.BigDecimal;
@RestController
@CrossOrigin
public class ItemController {

 private Item item;


@GetMapping
("/getItemId")
public String getItemId(){
  return item.getItemId();
}


@GetMapping
("/getListPrice")
public BigDecimal getListPrice(){
  return item.getListPrice();
}


@PutMapping
("/setQuantity")
public void setQuantity(@RequestParam(name = "quantity") int quantity){
item.setQuantity(quantity);
}


}
