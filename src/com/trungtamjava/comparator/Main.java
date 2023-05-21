package com.trungtamjava.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();

        list.add(new Person(1, "A"));
        list.add(new Person(5, "D"));
        list.add(new Person(3, "C"));
        list.add(new Person(2, "B"));
        list.add(new Person(7, "E"));

        System.out.println("Truoc khi sap xep: ");
        for (Person p : list) {
            System.out.println(p.getId() + " " + p.getName());
        }

//        Collections.sort(list, new Comparator<Person>() { // anonymous class
//            @Override
//            public int compare(Person o1, Person o2) {
//                if (o1.getId() > o2.getId()) return 1;
//                if (o1.getId() < o2.getId()) return -1;
//                return 0;
//            }
//        });

        Collections.sort(list, new MyCompare());

        System.out.println("Sau khi sap xep: ");
        for (Person p : list) {
            System.out.println(p.getId() + " " + p.getName());
        }
    }
}

class MyCompare implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getId() > o2.getId()) return 1;
        if (o1.getId() < o2.getId()) return -1;
        return 0;
    }
}
