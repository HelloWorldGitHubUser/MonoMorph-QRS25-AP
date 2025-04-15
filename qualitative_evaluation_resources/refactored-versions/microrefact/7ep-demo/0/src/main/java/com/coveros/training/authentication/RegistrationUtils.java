package com.coveros.training.authentication;
 import com.coveros.training.authentication.domainobjects.PasswordResult;
import com.coveros.training.authentication.domainobjects.RegistrationResult;
import com.coveros.training.helpers.CheckUtils;
import com.coveros.training.persistence.IPersistenceLayer;
import com.coveros.training.persistence.PersistenceLayer;
import me.gosimple.nbvcxz.Nbvcxz;
import me.gosimple.nbvcxz.scoring.Result;
import me.gosimple.nbvcxz.scoring.TimeEstimate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.coveros.training.authentication.domainobjects.PasswordResultEnums.EMPTY_PASSWORD;
import com.coveros.training.authentication.domainobjects.PasswordResultEnums;
import com.coveros.training.authentication.domainobjects.RegistrationStatusEnums;
import com.coveros.training.helpers.CheckUtils.StringMustNotBeNullOrEmpty;
public class RegistrationUtils {

 private  Logger logger;

 private  IPersistenceLayer persistenceLayer;

public RegistrationUtils(IPersistenceLayer persistenceLayer) {
    this.persistenceLayer = persistenceLayer;
}public RegistrationUtils() {
    this(new PersistenceLayer());
}
public RegistrationUtils createEmpty(){
    return new RegistrationUtils(PersistenceLayer.createEmpty());
}


public RegistrationResult processRegistration(String username,String password){
    logger.info("Starting registration");
    StringMustNotBeNullOrEmpty(username);
    StringMustNotBeNullOrEmpty(password);
    if (isUserInDatabase(username)) {
        logger.info("cannot register this user - they are already registered");
        return new RegistrationResult(false, ALREADY_REGISTERED);
    }
    // at this point we know the user is not yet registered in the database
    // then we check if the password is good.
    final PasswordResult passwordResult = isPasswordGood(password);
    if (passwordResult.status != SUCCESS) {
        logger.info("user provided a bad password during registration");
        return new RegistrationResult(false, BAD_PASSWORD, passwordResult.toPrettyString());
    }
    // at this point, we feel assured it's ok to save to the database.
    saveToDatabase(username, password);
    logger.info("saving new user, {}, to database", username);
    return new RegistrationResult(true, SUCCESSFULLY_REGISTERED);
}


public PasswordResult isPasswordGood(String password){
    if (password.isEmpty()) {
        logger.info("password was empty");
        return PasswordResult.createDefault(EMPTY_PASSWORD);
    }
    StringMustNotBeNullOrEmpty(password);
    final boolean isTooSmall = password.length() < 10;
    if (isTooSmall) {
        logger.info("password was too short");
        return PasswordResult.createDefault(TOO_SHORT);
    }
    CheckUtils.mustBeTrueAtThisPoint(isTooSmall == false, "At this point, the password cannot be too small");
    final boolean isTooLarge = password.length() > 100;
    if (isTooLarge) {
        logger.info("password was too long");
        return PasswordResult.createDefault(TOO_LONG);
    }
    CheckUtils.mustBeTrueAtThisPoint(isTooLarge == false, "At this point, the password cannot be too large");
    // Nbvcxz is a tool that tests entropy on passwords
    // See github.com/GoSimpleLLC/nbvcxz
    final Nbvcxz nbvcxz = new Nbvcxz();
    final Result result = nbvcxz.estimate(password);
    final String suggestions = String.join(";", result.getFeedback().getSuggestion());
    final Double entropy = result.getEntropy();
    CheckUtils.mustBeTrueAtThisPoint(entropy > 0d, "There must be *some* entropy at this point, more than 0");
    String timeToCrackOff = TimeEstimate.getTimeToCrackFormatted(result, "OFFLINE_BCRYPT_12");
    String timeToCrackOn = TimeEstimate.getTimeToCrackFormatted(result, "ONLINE_THROTTLED");
    if (!result.isMinimumEntropyMet()) {
        logger.info("minimum entropy for password was not met");
        return new PasswordResult(INSUFFICIENT_ENTROPY, entropy, timeToCrackOff, timeToCrackOn, suggestions);
    } else {
        logger.info("password met required entropy");
        return new PasswordResult(SUCCESS, entropy, timeToCrackOff, timeToCrackOn, result.getFeedback().getResult());
    }
}


public boolean isEmpty(){
    return persistenceLayer.isEmpty();
}


public boolean isUserInDatabase(String username){
    return persistenceLayer.searchForUserByName(username).isPresent();
}


public void saveToDatabase(String username,String password){
    final long userId = persistenceLayer.saveNewUser(username);
    persistenceLayer.updateUserWithPassword(userId, password);
}


}