package com.genericTest.genericsInClass;

/**
 * Created by Ruzal on 5/21/2017.
 */
public class Employee {
    private String name;
    private String post;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", post='" + post + '\'' +
                '}';
    }
}
