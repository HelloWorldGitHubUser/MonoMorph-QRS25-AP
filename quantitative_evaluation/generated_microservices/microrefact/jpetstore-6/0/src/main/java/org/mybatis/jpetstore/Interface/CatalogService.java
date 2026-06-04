package org.mybatis.jpetstore.Interface;
import java.util.List;
import org.mybatis.jpetstore.DTO.Product;
public interface CatalogService {

   public List<Product> getProductListByCategory(String categoryId);
}
