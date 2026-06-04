package com.coveros.training.authentication;
 import com.coveros.training.authentication.domainobjects.PasswordResult;
import com.coveros.training.authentication.domainobjects.RegistrationResult;
import com.coveros.training.authentication.domainobjects.RegistrationStatusEnums;
import com.coveros.training.persistence.IPersistenceLayer;
import com.coveros.training.persistence.PersistenceLayer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import com.coveros.training.authentication.domainobjects.PasswordResultEnums;
public class RegistrationStepDefs {

 private  RegistrationResult ALREADY_REGISTERED;

 private  String myUsername;

 private  RegistrationResult myRegistrationResult;

 private  RegistrationUtils registrationUtils;

 private  PasswordResult passwordResult;

 private  IPersistenceLayer pl;

 private  String TYPICAL_PASSWORD;


@When("^they register with that username and use the password \"([^\"]*)\"$")
public void theyRegisterWithThatUsernameAndUseThePassword(String pw){

    registrationUtils.processRegistration(myUsername, pw);

}


@Then("they become registered")
public void they_become_registered(){

    registrationUtils.isUserInDatabase(myUsername);

}


public boolean userIsRegistered(String username){

    return registrationUtils.isUserInDatabase(username);

}


@When("^they enter their username and provide a poor password of (.*)$")
public void theyEnterTheirUsernameAndProvideAPoorPassword(String password){

    myRegistrationResult = registrationUtils.processRegistration(myUsername, password);

}


@Given("^a user is in the midst of registering for an account$")
public void aUserIsInTheMidstOfRegisteringForAnAccount(){

// just a comment.  No state needs to be set up.

}


@Then("the system indicates a failure to register")
public void the_system_indicates_a_failure_to_register(){

    Assert.assertEquals(ALREADY_REGISTERED, myRegistrationResult);

}


@When("^they try registering with the password (.*)$")
public void theyTryRegisteringWithThePasswordPassword(String password){

    passwordResult = RegistrationUtils.isPasswordGood(password);

}


public void initializeDatabaseAccess(){

    pl.cleanAndMigrateDatabase();

    registrationUtils = new RegistrationUtils();

}


@Then("^they fail to register and the system indicates a response: (.*)$")
public void theyFailToRegisterAndTheSystemIndicatesAResponse(String response){

    Assert.assertTrue(myRegistrationResult.toString().toLowerCase().replace("_", " ").contains(response));

}


@Then("the system returns that the password has insufficient entropy")
public void theSystemReturnsThatThePasswordHasInsufficientEntropyTakingThisLongToCrackTime_to_crack(){

    Assert.assertEquals(PasswordResultEnums.INSUFFICIENT_ENTROPY, passwordResult.status);

}


@Given("^a user \"([^\"]*)\" is not currently registered in the system$")
public void aUserIsNotCurrentlyRegisteredInTheSystem(String username){

    initializeDatabaseAccess();

    Assert.assertFalse(userIsRegistered(username));

    myUsername = username;

}


@Given("^a username of \"([^\"]*)\" is registered$")
public void aUsernameOfIsRegistered(String username){

    initializeDatabaseAccess();

    registrationUtils.processRegistration(username, TYPICAL_PASSWORD);

    Assert.assertTrue(userIsRegistered(username));

    myUsername = username;

}


@When("a user tries to register with that same name")
public void a_user_tries_to_register_with_that_same_name(){

    myRegistrationResult = registrationUtils.processRegistration(myUsername, TYPICAL_PASSWORD);

}


}
