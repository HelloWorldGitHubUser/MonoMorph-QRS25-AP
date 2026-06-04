package org.mybatis.jpetstore.DTO;
 import java.io.Serializable;
public class Product implements Serializable{

 private  long serialVersionUID;

 private  String productId;

 private  String categoryId;

 private  String name;

 private  String description;


public void setName(String name){
    this.name = name;
}


public String getName(){
    return name;
}


public void setProductId(String productId){
    this.productId = productId.trim();
}


public String getCategoryId(){
    return categoryId;
}


public void setCategoryId(String categoryId){
    this.categoryId = categoryId;
}


@Override
public String toString(){
    return getName();
}


public void setDescription(String description){
    this.description = description;
}


public String getDescription(){
    return description;
}


public String getProductId(){
    return productId;
}


}