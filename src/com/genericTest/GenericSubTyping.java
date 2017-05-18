package com.genericTest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ruzal on 5/17/2017.
 */
public class GenericSubTyping {

    public static void main(String[] args) {

        List<Number> numbers= new ArrayList<Number>();

        numbers.add(5);
        numbers.add(7.1);

        System.out.println("number= "+numbers.toString());


//        List<Integer> integers = new ArrayList<Integer>();
//        integers.add(5);
//        integers.add(3);
//        numbers=integers;
//        numbers.add(7.1);

    }

}
