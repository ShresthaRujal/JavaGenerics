package com.genericTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Ruzal on 5/17/2017.
 */
public class GenericBoundWildCards {

    public static void main(String[] args) {

        List<Integer> li = Arrays.asList(1,2,3,4,5);
        System.out.println("sum= " +add(li));

        List<Double> ld = Arrays.asList(5.1,6.2,7.3,8.4,9.5);
        System.out.println("sum= " +add(ld));

        printOnlyIntegersOrSuperClasses(new ArrayList<Integer>());
        printOnlyIntegersOrSuperClasses(new ArrayList<Number>());

        /**
        //Since we are allowing only super type of integer, Double is not a super type
        //of type Integer. so un-Commenting below code will generate complie time error.
        printOnlyIntegersOrSuperClasses(new ArrayList<Double>());
        */

    }

    private static double add(List<? extends Number> list) {

        double s=0.0;
        for(Number n:list)
            s +=n.doubleValue();
        return s;
        }

        private static void printOnlyIntegersOrSuperClasses(List<? super Integer> list){
            System.out.println(list);



    }
}
