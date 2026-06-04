package org.mybatis.jpetstore.DTO;
 import java.io.Serializable;
import net.sourceforge.stripes.validation.Validate;
public class Account implements Serializable{

 private  long serialVersionUID;

 private  String username;

 private  String password;

 private  String email;

 private  String firstName;

 private  String lastName;

 private  String status;

 private  String address1;

 private  String address2;

 private  String city;

 private  String state;

 private  String zip;

 private  String country;

 private  String phone;

 private  String favouriteCategoryId;

 private  String languagePreference;

 private  boolean listOption;

 private  boolean bannerOption;

 private  String bannerName;


public String getPhone(){
    return phone;
}


public String getAddress2(){
    return address2;
}


public String getCountry(){
    return country;
}


public String getAddress1(){
    return address1;
}


public String getStatus(){
    return status;
}


public String getFavouriteCategoryId(){
    return favouriteCategoryId;
}


public String getUsername(){
    return username;
}


public String getCity(){
    return city;
}


public String getZip(){
    return zip;
}


public String getLastName(){
    return lastName;
}


public String getPassword(){
    return password;
}


public String getBannerName(){
    return bannerName;
}


public String getState(){
    return state;
}


public String getLanguagePreference(){
    return languagePreference;
}


public String getEmail(){
    return email;
}


public String getFirstName(){
    return firstName;
}
public void setUsername(String s){
     this.username = s;
}
public void setEmail(String s){
     this.email = s;
}
public void setFirstName(String s){
     this.firstName = s;
}
public void setLastName(String s){
     this.lastName = s;
}
public void setStatus(String s){
    this.status = s;
}
public void setAddress1(String s){
    this.address1 = s;
}
public void setAddress2(String s){
    this.address2 = s;
}
public void setCity(String s){
    this.city = s;
}
public void setState(String s){
     this.state = s;
}
public void setZip(String s){
     this.zip = s;
}
public void setCountry(String s){
     this.country = s;
}
public void setPhone(String s){
     this.phone = s;
}

}
