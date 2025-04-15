package org.mybatis.jpetstore.Interface;
 import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.mybatis.jpetstore.Interface.Item;
public class ItemImpl implements Item{

@Autowired
 private RestTemplate restTemplate;

  String url = "http://1";


public String getItemId(){
  UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url.concat("/getItemId"))
;  String aux = restTemplate.getForObject(builder.toUriString(), String.class);

 return aux;
}


public BigDecimal getListPrice(){
  UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url.concat("/getListPrice"))
;  BigDecimal aux = restTemplate.getForObject(builder.toUriString(), BigDecimal.class);

 return aux;
}


}