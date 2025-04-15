package org.mybatis.jpetstore.domain;
 import java.io.Serializable;
public class Category implements Serializable{

 private  long serialVersionUID;

 private  String categoryId;

 private  String name;

 private  String description;


public void setName(String name){
    this.name = name;
}


public String getName(){
    return name;
}


public String getCategoryId(){
    return categoryId;
}


public void setCategoryId(String categoryId){
    this.categoryId = categoryId.trim();
}


@Override
public String toString(){
    return getCategoryId();
}


public void setDescription(String description){
    this.description = description;
}


public String getDescription(){
    return description;
}


}