package org.mybatis.jpetstore.DTO;
 import java.io.Serializable;
import java.math.BigDecimal;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
public class Item implements Serializable{

 private  long serialVersionUID;

 private  String itemId;

 private  String productId;

 private  BigDecimal listPrice;

 private  BigDecimal unitCost;

 private  int supplierId;

 private  String status;

 private  String attribute1;

 private  String attribute2;

 private  String attribute3;

 private  String attribute4;

 private  String attribute5;

 private  Product product;

 private  int quantity;

 private RestTemplate restTemplate = new RestTemplate();

  String url = "http://1";


public int getQuantity(){
    return quantity;
}


public BigDecimal getUnitCost(){
    return unitCost;
}


public String getStatus(){
    return status;
}


public String getItemId(){
    return itemId;
}


public String getAttribute4(){
    return attribute4;
}


public String getAttribute5(){
    return attribute5;
}


public Product getProduct(){
    return product;
}


public String getAttribute2(){
    return attribute2;
}


public String getAttribute3(){
    return attribute3;
}


public String getAttribute1(){
    return attribute1;
}


public BigDecimal getListPrice(){
    return listPrice;
}


public int getSupplierId(){
    return supplierId;
}


public void setQuantity(int quantity){
    this.quantity = quantity;
 

  UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url.concat("/setQuantity"))

.queryParam("quantity",quantity)
;
restTemplate.put(builder.toUriString(),null);
}
public void setItemId(String id){
    this.itemId = id;
  UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url.concat("/setItemId"))
.queryParam("itemId",id)
;
restTemplate.put(builder.toUriString(),null);
}
public void setListPrice(BigDecimal p){
    this.listPrice = p;
  UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url.concat("/setListPrice"))
.queryParam("listPrice",p.doubleValue())
;
restTemplate.put(builder.toUriString(),null);
}

}
