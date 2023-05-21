package com.trungtamjava.comparator2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();

        list.add(new Person(3, "A", 20));
        list.add(new Person(1, "A", 18));
        list.add(new Person(2, "B", 25));
        list.add(new Person(4, "B", 30));
        list.add(new Person(7, "S", 21));
        list.add(new Person(6, "S", 21));

        System.out.println("List of Person before sorting:");
        for (Person p : list) {
            System.out.println(p.getId() + " " + p.getName() + " " + p.getAge());
        }

        list.sort((p1, p2) -> { // lamda expression () -> {}
            if (p1.getName().compareTo(p2.getName()) > 0) return 1;
            if (p1.getName().compareTo(p2.getName()) < 0) return -1;
            if (p1.getAge() - p2.getAge() > 0) return 1;
            if (p1.getAge() - p2.getAge() < 0) return -1;
            if (p1.getId() - p2.getId() > 0) return 1;
            if (p1.getId() - p2.getId() < 0) return -1;
            return 0;
        });

        System.out.println("List of Person after sorting:");
        for (Person p : list) {
            System.out.println(p.getId() + " " + p.getName() + " " + p.getAge());
        }
    }
}
