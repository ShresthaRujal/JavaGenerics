package com.genericTest.genericsInClass.genericsClassTestPart2;

/**
 * Created by Ruzal on 5/30/2017.
 */
public class DaoImpl implements Dao<Model1,Model2> {

    @Override
    public void addition(Model1 entity1, Model2 entity2) {
        System.out.println("addititon of Model1 ="+entity1.getNum1()+ entity1.getNum2());
        System.out.println("addition of 1st number of Model1 and model2 ="+ (entity1.getNum1()+entity2.getNumber1()));
    }

    @Override
    public void subtract(Model1 entity1, Model2 entity2) {
        System.out.println("substraction of Model 2 ="+(entity2.getNumber1()-entity2.getNumber2()));
        System.out.println("substraction of 2nd number of Model 1 and 2 ="+(entity1.getNum2()-entity2.getNumber2()));
    }


}
