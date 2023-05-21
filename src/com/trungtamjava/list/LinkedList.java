package com.trungtamjava.list;

import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        Person person = new Person(1);

        List<Person> list = new java.util.LinkedList<Person>();

        list.add(person);

        for (Person p : list) {
            System.out.println(p.getId());
        }

        list.remove(0);
    }
}
