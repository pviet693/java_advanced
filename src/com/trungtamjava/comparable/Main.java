package com.trungtamjava.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();

        list.add(new Person(1, "N"));
        list.add(new Person(5, "A"));
        list.add(new Person(3, "C"));
        list.add(new Person(2, "B"));
        list.add(new Person(6, "D"));

        System.out.println("Truoc khi sap xep theo id:");

        for (Person person : list) {
            System.out.println(person.getId() + " " + person.getName());
        }

        Collections.sort(list);

        System.out.println("Sau khi sap xep theo id:");

        for (Person person : list) {
            System.out.println(person.getId() + " " + person.getName());
        }
    }
}
