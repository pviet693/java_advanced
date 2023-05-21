package com.trungtamjava.set;

import java.util.Set;

public class LinkedHashSet {
    public static void main(String[] args) {
        Set<Person> set = new java.util.LinkedHashSet<Person>();

        set.add(new Person(1));
        set.add(new Person(3));
        set.add(new Person(2));
        set.add(new Person(1));

        set.remove(new Person(1)); // not working, have to override hashCode() + equals() functions in Person class

        for (Person p : set) {
            System.out.println(p.getId());
        }
    }
}
