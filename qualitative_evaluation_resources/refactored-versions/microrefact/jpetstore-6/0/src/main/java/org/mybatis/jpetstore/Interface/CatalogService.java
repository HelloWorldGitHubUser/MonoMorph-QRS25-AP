package org.mybatis.jpetstore.Interface;
public interface CatalogService {

   public List<Product> getProductListByCategory(String categoryId);
}