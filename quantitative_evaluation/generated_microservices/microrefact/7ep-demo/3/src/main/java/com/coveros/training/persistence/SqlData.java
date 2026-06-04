package com.coveros.training.persistence;
 import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.checkerframework.checker.nullness.qual.Nullable;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
public class SqlData<R> {

 final  String description;

 final  String preparedStatement;

 private  List<ParameterObject<?>> params;

 public  Function<ResultSet,Optional<R>> extractor;

SqlData(String description, String preparedStatement, Object... params) {

    this(description, preparedStatement, (resultSet -> Optional.empty()), params);

}/**

 * Creates an object that is used to avoid some of the boilerplate

 * in running database CRUD operations.

 *

 * @param description       A string that describes in plain English what this SQL does.

 * @param preparedStatement The SQL that is run on the database

 * @param extractor         see {@link #extractor} a function that is run to convert the returned {@link ResultSet} into whatever we want

 */

SqlData(String description, String preparedStatement, Function<ResultSet, Optional<R>> extractor, Object... params) {

    this.description = description;

    this.preparedStatement = preparedStatement;

    this.params = new ArrayList<>();

    if (params.length > 0) {

        generateParams(params);

    }

    this.extractor = extractor;

}
public static <T> SqlData<T> createEmpty(){

    return new SqlData<>("", "");

}


public void generateParams(Object[] params){

    for (Object param : params) {

        addParameter(param, param.getClass());

    }

}


public int hashCode(){

    // you pick a hard-coded, randomly chosen, non-zero, odd number

    // ideally different for each class

    return new HashCodeBuilder(53, 97).append(description).append(preparedStatement).append(params).append(extractor).toHashCode();

}


public boolean equals(Object obj){

    if (obj == null) {

        return false;

    }

    if (obj == this) {

        return true;

    }

    if (obj.getClass() != getClass()) {

        return false;

    }

    SqlData<?> rhs = (SqlData<?>) obj;

    return new EqualsBuilder().append(description, rhs.description).append(preparedStatement, rhs.preparedStatement).append(params, rhs.params).append(extractor, rhs.extractor).isEquals();

}


public boolean isEmpty(){

    return this.equals(SqlData.createEmpty());

}


public String toString(){

    StringBuilder paramsString = new StringBuilder();

    for (ParameterObject<?> p : params) {

        paramsString.append(p);

    }

    return new ToStringBuilder(this).append("description", description).append("params", paramsString.toString()).append("prepared statement", preparedStatement).toString();

}


public void applyParametersToPreparedStatement(PreparedStatement st){

    try {

        for (int i = 1; i <= params.size(); i++) {

            ParameterObject<?> p = params.get(i - 1);

            if (p.type == String.class) {

                st.setString(i, (String) p.data);

            } else if (p.type == Integer.class) {

                st.setInt(i, (Integer) p.data);

            } else if (p.type == Long.class) {

                st.setLong(i, (Long) p.data);

            } else if (p.type == Date.class) {

                st.setDate(i, (Date) p.data);

            }

        }

    } catch (SQLException e) {

        throw new SqlRuntimeException(e);

    }

}


public <T> void addParameter(Object data,Class<T> clazz){

    params.add(new ParameterObject<>(data, clazz));

}


}
