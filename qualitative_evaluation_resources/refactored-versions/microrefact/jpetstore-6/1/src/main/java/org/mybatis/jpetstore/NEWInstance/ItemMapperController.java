package org.mybatis.jpetstore.NEWInstance;
 import org.springframework.web.bind.annotation.*;
@RestController
@CrossOrigin
public class ItemMapperController {

 private ItemMapper itemmapper;


@PutMapping
("/updateInventoryQuantity")
public void updateInventoryQuantity(@RequestParam(name = "param") Map<String,Object> param){
itemmapper.updateInventoryQuantity(param);
}


@GetMapping
("/getItem")
public Item getItem(@RequestParam(name = "itemId") String itemId){
  return itemmapper.getItem(itemId);
}


@GetMapping
("/getInventoryQuantity")
public int getInventoryQuantity(@RequestParam(name = "itemId") String itemId){
  return itemmapper.getInventoryQuantity(itemId);
}


}