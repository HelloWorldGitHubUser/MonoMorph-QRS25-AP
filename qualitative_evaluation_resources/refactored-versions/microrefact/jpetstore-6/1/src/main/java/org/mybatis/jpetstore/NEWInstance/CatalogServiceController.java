package org.mybatis.jpetstore.NEWInstance;
 import org.springframework.web.bind.annotation.*;
@RestController
@CrossOrigin
public class CatalogServiceController {

 private CatalogService catalogservice;


@GetMapping
("/getProductListByCategory")
public List<Product> getProductListByCategory(@RequestParam(name = "categoryId") String categoryId){
  return catalogservice.getProductListByCategory(categoryId);
}


}