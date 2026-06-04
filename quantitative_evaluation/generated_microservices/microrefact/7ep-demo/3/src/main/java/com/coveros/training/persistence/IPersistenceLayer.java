package com.coveros.training.persistence;
import java.sql.Date;
import java.util.List;
import java.util.Optional;
public interface IPersistenceLayer {


public void deleteBorrower(long id)
;



public void deleteBook(long id)
;

public long saveNewBorrower(String borrowerName)
;



public void runBackup(String backupFileName)
;


public void runRestore(String backupFileName)
;



public void cleanAndMigrateDatabase()
;

public long saveNewUser(String username)
;

public boolean isEmpty()
;




public void updateBorrower(long id,String borrowerName)
;

public void migrateDatabase()
;

public long saveNewBook(String bookTitle)
;

public void cleanDatabase()
;





public void updateUserWithPassword(long id,String password)
;



public Optional<String> getBorrowerName(long id)
;

public Optional<Boolean> areCredentialsValid(String username,String password)
;

}
