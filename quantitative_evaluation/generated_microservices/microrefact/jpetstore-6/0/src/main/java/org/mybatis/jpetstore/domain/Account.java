package org.mybatis.jpetstore.domain;
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


public void setPassword(String password){
    this.password = password;
}


public void setCountry(String country){
    this.country = country;
}


public boolean isBannerOption(){
    return bannerOption;
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


public void setFavouriteCategoryId(String favouriteCategoryId){
    this.favouriteCategoryId = favouriteCategoryId;
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


@Validate(required = true, on = { "newAccount", "editAccount" })
public void setLastName(String lastName){
    this.lastName = lastName;
}


public void setAddress1(String address1){
    this.address1 = address1;
}


public boolean isListOption(){
    return listOption;
}


public void setZip(String zip){
    this.zip = zip;
}


public String getCity(){
    return city;
}


public String getZip(){
    return zip;
}


public void setUsername(String username){
    this.username = username;
}


public void setBannerOption(boolean bannerOption){
    this.bannerOption = bannerOption;
}


public void setCity(String city){
    this.city = city;
}


public void setPhone(String phone){
    this.phone = phone;
}


public String getLastName(){
    return lastName;
}


public void setStatus(String status){
    this.status = status;
}


public void setAddress2(String address2){
    this.address2 = address2;
}


public void setListOption(boolean listOption){
    this.listOption = listOption;
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


public void setEmail(String email){
    this.email = email;
}


@Validate(required = true, on = { "newAccount", "editAccount" })
public void setFirstName(String firstName){
    this.firstName = firstName;
}


public String getLanguagePreference(){
    return languagePreference;
}


public String getEmail(){
    return email;
}


public void setState(String state){
    this.state = state;
}


public void setBannerName(String bannerName){
    this.bannerName = bannerName;
}


public String getFirstName(){
    return firstName;
}


public void setLanguagePreference(String languagePreference){
    this.languagePreference = languagePreference;
}


}