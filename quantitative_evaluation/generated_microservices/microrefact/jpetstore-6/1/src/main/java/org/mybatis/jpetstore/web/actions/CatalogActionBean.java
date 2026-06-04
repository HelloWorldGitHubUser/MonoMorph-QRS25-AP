package org.mybatis.jpetstore.web.actions;
 import java.util.List;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.SessionScope;
import net.sourceforge.stripes.integration.spring.SpringBean;
import org.mybatis.jpetstore.domain.Category;
import org.mybatis.jpetstore.domain.Item;
import org.mybatis.jpetstore.domain.Product;
import org.mybatis.jpetstore.service.CatalogService;
@SessionScope
public class CatalogActionBean extends AbstractActionBean{

 private  long serialVersionUID;

 private  String MAIN;

 private  String VIEW_CATEGORY;

 private  String VIEW_PRODUCT;

 private  String VIEW_ITEM;

 private  String SEARCH_PRODUCTS;

@SpringBean
 private  CatalogService catalogService;

 private  String keyword;

 private  String categoryId;

 private  Category category;

 private  List<Category> categoryList;

 private  String productId;

 private  Product product;

 private  List<Product> productList;

 private  String itemId;

 private  Item item;

 private  List<Item> itemList;


public List<Item> getItemList(){
    return itemList;
}


public Item getItem(){
    return item;
}


public String getProductId(){
    return productId;
}


public String getItemId(){
    return itemId;
}


public void setKeyword(String keyword){
    this.keyword = keyword;
}


public void setCategory(Category category){
    this.category = category;
}


public ForwardResolution viewCategory(){
    if (categoryId != null) {
        productList = catalogService.getProductListByCategory(categoryId);
        category = catalogService.getCategory(categoryId);
    }
    return new ForwardResolution(VIEW_CATEGORY);
}


public void setCategoryId(String categoryId){
    this.categoryId = categoryId;
}


public ForwardResolution searchProducts(){
    if (keyword == null || keyword.length() < 1) {
        setMessage("Please enter a keyword to search for, then press the search button.");
        return new ForwardResolution(ERROR);
    } else {
        productList = catalogService.searchProductList(keyword.toLowerCase());
        return new ForwardResolution(SEARCH_PRODUCTS);
    }
}


public ForwardResolution viewItem(){
    item = catalogService.getItem(itemId);
    product = item.getProduct();
    return new ForwardResolution(VIEW_ITEM);
}


public void setItemId(String itemId){
    this.itemId = itemId;
}


public List<Product> getProductList(){
    return productList;
}


public void setItem(Item item){
    this.item = item;
}


public void setProduct(Product product){
    this.product = product;
}


public void setCategoryList(List<Category> categoryList){
    this.categoryList = categoryList;
}


public Product getProduct(){
    return product;
}


public List<Category> getCategoryList(){
    return categoryList;
}


public void setProductList(List<Product> productList){
    this.productList = productList;
}


public String getCategoryId(){
    return categoryId;
}


public void setProductId(String productId){
    this.productId = productId;
}


public Category getCategory(){
    return category;
}


public void clear(){
    keyword = null;
    categoryId = null;
    category = null;
    categoryList = null;
    productId = null;
    product = null;
    productList = null;
    itemId = null;
    item = null;
    itemList = null;
}


public void setItemList(List<Item> itemList){
    this.itemList = itemList;
}


public String getKeyword(){
    return keyword;
}


public ForwardResolution viewProduct(){
    if (productId != null) {
        itemList = catalogService.getItemListByProduct(productId);
        product = catalogService.getProduct(productId);
    }
    return new ForwardResolution(VIEW_PRODUCT);
}


@DefaultHandler
public ForwardResolution viewMain(){
    return new ForwardResolution(MAIN);
}


}