package com.genericTest.genericsInClass;

/**
 * Created by Ruzal on 5/21/2017.
 */
public class Appmain {

    public static void main(String[] args) {

        User user= new User();
        Employee emp= new Employee();

        TestDao test= new TestDaoImpl();

        user.setName("Rujal");
        user.setAddress("madhyapur thimi");

        emp.setName("rajan");
        emp.setPost("Developer");

        test.delete(user);
        test.insert(user);
        test.delete(emp);
        test.update(emp);
        test.update(user);


    }

}
