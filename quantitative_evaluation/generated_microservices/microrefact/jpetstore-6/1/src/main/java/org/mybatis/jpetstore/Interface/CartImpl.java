package org.mybatis.jpetstore.Interface;
 import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.mybatis.jpetstore.Interface.Cart;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.mybatis.jpetstore.domain.Item;
import java.util.Iterator;
import java.util.List;
import org.mybatis.jpetstore.DTO.CartItem;
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

public Iterator<CartItem> getAllCartItems(){
  UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url.concat("/getAllCartItems"))
;  
ResponseEntity<List<CartItem>> response = restTemplate.exchange(
    builder.toUriString(),
    HttpMethod.GET,
    null,
    new ParameterizedTypeReference<List<CartItem>>() {}
);
List<CartItem> result = response.getBody();

 return result.iterator();
}
public void setQuantityByItemId(String itemId, int q){
  UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url.concat("/setQuantityByItemId"))
    .queryParam("itemId",itemId).queryParam("quantity",q)
;
  restTemplate.put(builder.toUriString(), null);

}
}
