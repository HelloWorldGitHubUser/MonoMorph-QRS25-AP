package org.mybatis.jpetstore.Interface;
 import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.mybatis.jpetstore.Interface.ItemMapper;
public class ItemMapperImpl implements ItemMapper{

@Autowired
 private RestTemplate restTemplate;

  String url = "http://1";


public void updateInventoryQuantity(Map<String,Object> param){
  UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url.concat("/updateInventoryQuantity"))
    .queryParam("param",param)
;
  restTemplate.put(builder.toUriString(), null);
}


public Item getItem(String itemId){
  UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url.concat("/getItem"))
    .queryParam("itemId",itemId)
;  Item aux = restTemplate.getForObject(builder.toUriString(), Item.class);

 return aux;
}


public int getInventoryQuantity(String itemId){
  UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url.concat("/getInventoryQuantity"))
    .queryParam("itemId",itemId)
;  int aux = restTemplate.getForObject(builder.toUriString(), int.class);

 return aux;
}


}