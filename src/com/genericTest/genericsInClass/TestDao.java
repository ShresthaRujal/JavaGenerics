package com.genericTest.genericsInClass;

import java.util.List;

/**
 * Created by Ruzal on 5/21/2017.
 */
public interface TestDao<T> {

    void insert(T entity);
    List<T> display();
    void update(T entity);
    void delete(T entity);

}
