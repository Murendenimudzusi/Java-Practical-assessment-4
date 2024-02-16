package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        Person person = new Person("Ryuk",     35,     "male", new String[] {"being a hardarse", "agile", "SSD hard drives"});


        System.out.println(person.getName()  + person.getAge() + Arrays.toString(person.getInterests()) + person.getGender());

    }
}
