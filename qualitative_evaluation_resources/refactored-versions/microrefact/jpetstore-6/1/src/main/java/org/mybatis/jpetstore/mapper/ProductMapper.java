package org.mybatis.jpetstore.mapper;
 import java.util.List;
import org.mybatis.jpetstore.domain.Product;
public interface ProductMapper {


public Product getProduct(String productId)
;

public List<Product> searchProductList(String keywords)
;

public List<Product> getProductListByCategory(String categoryId)
;

}