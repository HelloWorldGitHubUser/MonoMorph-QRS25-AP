package org.mybatis.jpetstore.Interface;
 import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.mybatis.jpetstore.Interface.Cart;
public class CartImpl implements Cart{

@Autowired
 private RestTemplate restTemplate;

  String url = "http://2";


public boolean containsItemId(String itemId){
  UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url.concat("/containsItemId"))
    .queryParam("itemId",itemId)
;  boolean aux = restTemplate.getForObject(builder.toUriString(), boolean.class);

 return aux;
}


public void addItem(Item item,boolean isInStock){
  UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url.concat("/addItem"))
    .queryParam("item",item)
    .queryParam("isInStock",isInStock)
;
  restTemplate.put(builder.toUriString(), null);
}


public void incrementQuantityByItemId(String itemId){
  UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url.concat("/incrementQuantityByItemId"))
    .queryParam("itemId",itemId)
;
  restTemplate.put(builder.toUriString(), null);
}


public Item removeItemById(String itemId){
  UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url.concat("/removeItemById"))
    .queryParam("itemId",itemId)
;  Item aux = restTemplate.getForObject(builder.toUriString(), Item.class);

 return aux;
}


}