package com.genericTest.genericsInClass.genericsClassTestPart2;

/**
 * Created by Ruzal on 5/30/2017.
 */
public class Model1 {
    private int num1;
    private int num2;

    public Model1() {
    }

    public Model1(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "Model1{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }
}
