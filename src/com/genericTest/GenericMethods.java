package com.genericTest;

/**
 * Created by Ruzal on 5/17/2017.
 */
public class GenericMethods {

    public static void main(String[] args) {

        Integer[] ints ={1,2};
        Character[] chars = {'A','B','C'};

        System.out.println("Array Containing ints:");
        printAnyArry(ints);

        System.out.println("array containing containers");
        printAnyArry(chars);

    }

    public static <E> void printAnyArry(E[] anArray){

        for (E element : anArray){
            System.out.println("Element= "+ element);
        }
    }

}
