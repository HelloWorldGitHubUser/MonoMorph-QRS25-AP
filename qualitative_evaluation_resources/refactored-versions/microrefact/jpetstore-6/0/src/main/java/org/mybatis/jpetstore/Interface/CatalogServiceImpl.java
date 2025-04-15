package org.mybatis.jpetstore.Interface;
 import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.mybatis.jpetstore.Interface.CatalogService;
public class CatalogServiceImpl implements CatalogService{

@Autowired
 private RestTemplate restTemplate;

  String url = "http://1";


public List<Product> getProductListByCategory(String categoryId){
  UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url.concat("/getProductListByCategory"))
    .queryParam("categoryId",categoryId)
;  List<Product> aux = restTemplate.getForObject(builder.toUriString(), List<Product>.class);

 return aux;
}


}