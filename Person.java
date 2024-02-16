package com.company;

import java.util.ArrayList;

public class Person {
    String name;
    int age;
    String gender;
    private String[] interests;


    public Person(String name, int age, String gender, String[] interests) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.interests = interests;
    }

    public String getName() {
        return "\"Hello, my name is" + name;
    }

    public int getAge() {
        return +age;
    }

    public String getGender() {
        return "my gender is " + gender;
    }

    public String[] getInterests() {
        return interests;

    }

    String message() {
        return String.format(" My interests are.",interests);
    }
}




