package org.mybatis.jpetstore.Interface;
 import org.springframework.web.client.RestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.mybatis.jpetstore.Interface.CatalogService;
import org.mybatis.jpetstore.DTO.Product;
import java.util.List;
public class CatalogServiceImpl implements CatalogService{

@Autowired
 private RestTemplate restTemplate;

  String url = "http://1";


public List<Product> getProductListByCategory(String categoryId){
    UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url.concat("/getProductListByCategory"))
    .queryParam("categoryId",categoryId);
ResponseEntity<List<Product>> response = restTemplate.exchange(
    builder.toUriString(),
    HttpMethod.GET,
    null,
    new ParameterizedTypeReference<List<Product>>() {}
);
List<Product> result = response.getBody();

 return result;
}


}
