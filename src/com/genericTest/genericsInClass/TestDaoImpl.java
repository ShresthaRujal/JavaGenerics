package com.genericTest.genericsInClass;

import java.util.ArrayList;
import java.util.List;
import com.genericTest.genericsInClass.Employee;

/**
 * Created by Ruzal on 5/21/2017.
 */
public class TestDaoImpl implements TestDao {


    @Override
    public void insert(Object entity) {
        System.out.println(entity.toString());
    }

    @Override
    public List display() {
        return null;
    }

    @Override
    public void update(Object entity) {
        System.out.println("I am" );
                System.out.println(entity instanceof Employee);
    }

    @Override
    public void delete(Object entity) {
        System.out.println(entity.toString());
    }
}
