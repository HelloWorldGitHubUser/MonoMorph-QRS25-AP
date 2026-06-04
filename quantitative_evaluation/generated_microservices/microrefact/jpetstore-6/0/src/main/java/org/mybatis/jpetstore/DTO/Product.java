package org.mybatis.jpetstore.DTO;
 import java.io.Serializable;
public class Product implements Serializable{

 private  long serialVersionUID;

 private  String productId;

 private  String categoryId;

 private  String name;

 private  String description;


public String getName(){
    return name;
}


public String getCategoryId(){
    return categoryId;
}


@Override
public String toString(){
    return getName();
}


public String getDescription(){
    return description;
}


public String getProductId(){
    return productId;
}


}