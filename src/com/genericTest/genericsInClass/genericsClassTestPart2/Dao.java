package com.genericTest.genericsInClass.genericsClassTestPart2;

/**
 * Created by Ruzal on 5/30/2017.
 */
public interface Dao<T extends Model1,U extends Model2> {

    void addition(T entity1,U entity2);
    void subtract(T entity1,U entity2);




}
