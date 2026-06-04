package com.coveros.training.persistence;
 import com.coveros.training.helpers.CheckUtils;
import com.coveros.training.helpers.StringUtils;
import com.coveros.training.authentication.domainobjects.User;
import org.flywaydb.core.Flyway;
import org.h2.jdbcx.JdbcConnectionPool;
import javax.sql.DataSource;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
public class PersistenceLayer implements IPersistenceLayer{

 private  DataSource dataSource;

public PersistenceLayer() {
    this(obtainConnectionPool());

}PersistenceLayer(DataSource ds) {

    dataSource = ds;

}
@Override
public void deleteBorrower(long id){

    CheckUtils.IntParameterMustBePositive(id);

    executeUpdateTemplate("Deletes a borrower from the database", "DELETE FROM library.borrower WHERE id = ?;", id);

}





public <T> void executeUpdateOnPreparedStatement(SqlData<T> sqlData,PreparedStatement st) throws SQLException{

    sqlData.applyParametersToPreparedStatement(st);

    st.executeUpdate();

}





public <T> PreparedStatement prepareStatementWithKeys(SqlData<T> sqlData,Connection connection) throws SQLException{

    return connection.prepareStatement(sqlData.preparedStatement, Statement.RETURN_GENERATED_KEYS);

}


public <T> Function<ResultSet,Optional<T>> createExtractor(ThrowingFunction<Optional<T>,Exception> extractorFunction){

    return throwingFunctionWrapper(rs -> {

        if (rs.next()) {

            return extractorFunction.apply(rs);

        } else {

            return Optional.empty();

        }

    });

}


@Override
public void deleteBook(long id){

    CheckUtils.IntParameterMustBePositive(id);

    executeUpdateTemplate("Deletes a book from the database", "DELETE FROM library.book WHERE id = ?;", id);

}


public String bytesToHex(byte[] bytes){

    StringBuilder hexString = new StringBuilder();

    for (byte b : bytes) {

        String hex = Integer.toHexString(0xff & b);

        if (hex.length() == 1)

            hexString.append('0');

        hexString.append(hex);

    }

    return hexString.toString();

}


public Flyway configureFlyway(){

    return Flyway.configure().schemas("ADMINISTRATIVE", "LIBRARY", "AUTH").dataSource(this.dataSource).load();

}


public static IPersistenceLayer createEmpty(){

    return new PersistenceLayer(new EmptyDataSource());

}


@Override
public long saveNewBorrower(String borrowerName){

    CheckUtils.StringMustNotBeNullOrEmpty(borrowerName);

    return executeInsertTemplate("adds a new library borrower", "INSERT INTO library.borrower (name) VALUES (?);", borrowerName);

}



public <R> Function<ResultSet,R> throwingFunctionWrapper(ThrowingFunction<R,Exception> throwingFunction){

    return resultSet -> {

        try {

            return throwingFunction.apply(resultSet);

        } catch (Exception ex) {

            throw new SqlRuntimeException(ex);

        }

    };

}


@Override
public void runBackup(String backupFileName){

    try (Connection connection = dataSource.getConnection()) {

        try (PreparedStatement st = connection.prepareStatement("SCRIPT TO ?")) {

            st.setString(1, backupFileName);

            st.execute();

        }

    } catch (SQLException ex) {

        throw new SqlRuntimeException(ex);

    }

}





@Override
public void runRestore(String backupFileName){

    String dbScriptsDirectory = "src/integration_test/resources/db_sample_files/";

    String fullPathToBackup = dbScriptsDirectory + backupFileName;

    try (Connection connection = dataSource.getConnection()) {

        try (PreparedStatement st = connection.prepareStatement("DROP SCHEMA IF EXISTS ADMINISTRATIVE CASCADE;" + "DROP SCHEMA IF EXISTS AUTH CASCADE;" + "DROP SCHEMA IF EXISTS LIBRARY CASCADE;")) {

            st.execute();

        }

        try (PreparedStatement st = connection.prepareStatement("RUNSCRIPT FROM ?")) {

            st.setString(1, fullPathToBackup);

            st.execute();

        }

    } catch (SQLException ex) {

        throw new SqlRuntimeException(ex);

    }

}


public <R> Optional<R> runQuery(SqlData<R> sqlData){

    try (Connection connection = dataSource.getConnection()) {

        try (PreparedStatement st = connection.prepareStatement(sqlData.preparedStatement)) {

            sqlData.applyParametersToPreparedStatement(st);

            try (ResultSet resultSet = st.executeQuery()) {

                return sqlData.extractor.apply(resultSet);

            }

        }

    } catch (SQLException ex) {

        throw new SqlRuntimeException(ex);

    }

}





@Override
public void cleanAndMigrateDatabase(){

    cleanDatabase();

    migrateDatabase();

}





    @FunctionalInterface
    private interface ThrowingFunction<R, E extends Exception> {
        R apply(ResultSet resultSet) throws E;
    }


@Override
public long saveNewUser(String username){

    CheckUtils.StringMustNotBeNullOrEmpty(username);

    return executeInsertTemplate("Creates a new user in the database", "INSERT INTO auth.user (name) VALUES (?);", username);

}


@Override
public boolean isEmpty(){

    return this.dataSource.getClass().equals(EmptyDataSource.class);

}






public long executeInsertTemplate(String description,String preparedStatement,Object ... params){

    final SqlData<Object> sqlData = new SqlData<>(description, preparedStatement, params);

    try (Connection connection = dataSource.getConnection()) {

        try (PreparedStatement st = prepareStatementWithKeys(sqlData, connection)) {

            return executeInsertOnPreparedStatement(sqlData, st);

        }

    } catch (SQLException ex) {

        throw new SqlRuntimeException(ex);

    }

}





public static JdbcConnectionPool obtainConnectionPool(){

    return JdbcConnectionPool.create("jdbc:h2:mem:training;MODE=PostgreSQL", "", "");

}


@Override
public void updateBorrower(long id,String borrowerName){

    CheckUtils.IntParameterMustBePositive(id);

    CheckUtils.StringMustNotBeNullOrEmpty(borrowerName);

    executeUpdateTemplate("Updates the borrower's data", "UPDATE library.borrower SET name = ? WHERE id = ?;", borrowerName, id);

}


@Override
public void migrateDatabase(){

    Flyway flyway = configureFlyway();

    flyway.migrate();

}


public <T> long executeInsertOnPreparedStatement(SqlData<T> sqlData,PreparedStatement st) throws SQLException{

    sqlData.applyParametersToPreparedStatement(st);

    st.executeUpdate();

    try (ResultSet generatedKeys = st.getGeneratedKeys()) {

        long newId;

        if (generatedKeys.next()) {

            newId = generatedKeys.getLong(1);

            assert (newId > 0);

        } else {

            throw new SqlRuntimeException("failed Sql.  Description: " + sqlData.description + " SQL code: " + sqlData.preparedStatement);

        }

        return newId;

    }

}


@Override
public long saveNewBook(String bookTitle){

    CheckUtils.StringMustNotBeNullOrEmpty(bookTitle);

    return executeInsertTemplate("Creates a new book in the database", "INSERT INTO library.book (title) VALUES (?);", bookTitle);

}


@Override
public void cleanDatabase(){

    Flyway flyway = configureFlyway();

    flyway.clean();

}




@Override
public Optional<User> searchForUserByName(String username){

    CheckUtils.StringMustNotBeNullOrEmpty(username);

    Function<ResultSet, Optional<User>> extractor = createExtractor(rs -> {

        final long id = rs.getLong(1);

        return Optional.of(new User(username, id));

    });

    return runQuery(new SqlData<>("search for a user by id, return that user if found, otherwise return an empty user", "SELECT id  FROM auth.user WHERE name = ?;", extractor, username));

}


@Override
public void updateUserWithPassword(long id,String password){

    CheckUtils.IntParameterMustBePositive(id);

    String hashedPassword = createHashedValueFromPassword(password);

    executeUpdateTemplate("Updates the user's password field with a new hash", "UPDATE auth.user SET password_hash = ? WHERE id = ?;", hashedPassword, id);

}





public String createHashedValueFromPassword(String password){

    CheckUtils.StringMustNotBeNullOrEmpty(password);

    try {

        MessageDigest digest = MessageDigest.getInstance("SHA-256");

        byte[] encodedhash = digest.digest(password.getBytes(StandardCharsets.UTF_8));

        return bytesToHex(encodedhash);

    } catch (NoSuchAlgorithmException e) {

        throw new SqlRuntimeException(e);

    }

}


public void executeUpdateTemplate(String description,String preparedStatement,Object ... params){

    final SqlData<Object> sqlData = new SqlData<>(description, preparedStatement, params);

    try (Connection connection = dataSource.getConnection()) {

        try (PreparedStatement st = prepareStatementWithKeys(sqlData, connection)) {

            executeUpdateOnPreparedStatement(sqlData, st);

        }

    } catch (SQLException ex) {

        throw new SqlRuntimeException(ex);

    }

}


@Override
public Optional<String> getBorrowerName(long id){

    CheckUtils.IntParameterMustBePositive(id);

    Function<ResultSet, Optional<String>> extractor = createExtractor(rs -> Optional.of(StringUtils.makeNotNullable(rs.getString(1))));

    return runQuery(new SqlData<>("get a borrower's name by their id", "SELECT name FROM library.borrower WHERE id = ?;", extractor, id));

}


@Override
public Optional<Boolean> areCredentialsValid(String username,String password){

    Function<ResultSet, Optional<Boolean>> extractor = createExtractor(rs -> {

        final long id = rs.getLong(1);

        assert (id > 0);

        return Optional.of(true);

    });

    final String hexHash = createHashedValueFromPassword(password);

    return runQuery(new SqlData<>("check to see if the credentials for a user are valid", "SELECT id FROM auth.user WHERE name = ? AND password_hash = ?;", extractor, username, hexHash));

}


}
