package com.genericTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Ruzal on 5/17/2017.
 */
public class JavaGenerics {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<String>();
        Map<Integer,String> employeeMap =  new HashMap<Integer,String>();
        employeeMap.put(1,"rujal");
        employeeMap.put(2,"shrijana");
        employeeMap.put(3,"usha");

        System.out.println("for loop with Generics");
        for (Map.Entry<Integer,String> entry: employeeMap.entrySet()){
            System.out.println("key= " +entry.getKey() + ",Value= " +entry.getValue());
        }

        //loop without generics

        for (Map.Entry entry:employeeMap.entrySet()){

        }

        for (Integer keys:employeeMap.keySet()){

        }


    }

}
