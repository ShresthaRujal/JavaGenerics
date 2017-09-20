package com.genericTest.genericsInClass.genericsClassTestPart2;

/**
 * Created by Ruzal on 5/30/2017.
 */
public class AppMain {

    public static void main(String[] args) {

        Dao dao= new DaoImpl();

        Model1 model1= new Model1(100,200);
        Model2 model2= new Model2(5,15);

        dao.addition(model1,model2);
        dao.subtract(model1,model2);



    }

}
