package com.coveros.training.authentication;
 import com.coveros.training.persistence.IPersistenceLayer;
import com.coveros.training.persistence.PersistenceLayer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
public class LoginStepDefs {

 private  boolean isRegisteredUser;

 private  RegistrationUtils registrationUtils;

 private  LoginUtils loginUtils;

 private  IPersistenceLayer pl;


@Then("^The system decides that they are not authenticated, because .*$")
public void theSystemDecidesThatTheyAreNotAuthenticated(){
    Assert.assertFalse(isRegisteredUser);
}


@When("^when a user authenticates with \"([^\"]*)\" and \"([^\"]*)\"$")
public void whenAUserAuthenticatesWithAnd(String username,String password){
    isRegisteredUser = loginUtils.isUserRegistered(username, password);
}


@Then("^The system decides that they are authenticated.$")
public void theSystemDecidesThatTheyAreAuthenticated(){
    Assert.assertTrue(isRegisteredUser);
}


@Given("^\"([^\"]*)\" is registered in the system with the password \"([^\"]*)\"$")
public void isRegisteredInSystemWithPassword(String username,String password){
    initializeDatabaseAccess();
    registrationUtils.processRegistration(username, password);
}


public void initializeDatabaseAccess(){
    pl.cleanAndMigrateDatabase();
    registrationUtils = new RegistrationUtils();
    loginUtils = new LoginUtils();
}


}