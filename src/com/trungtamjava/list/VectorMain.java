package com.trungtamjava.list;

import java.util.List;
import java.util.Vector;

public class VectorMain {
    public static void main(String[] args) {
        Person person = new Person(1);

        List<Person> list = new Vector<Person>();

        // Vector<Person> list = new Vector<Person>();

        list.add(person);
        list.remove(0);

        for (Person p : list) {
            System.out.println(p.getId());
        }
    }
}
