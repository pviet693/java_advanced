package com.trungtamjava.set;

import java.util.Set;

public class TreeSet {
    public static void main(String[] args) {
        Set<String> set = new java.util.TreeSet<String>();

        set.add("B");
        set.add("A");

        for (String s : set) {
            System.out.println(s);
        }

        set.remove("A");

        System.out.println("--------");
        for (String s : set) {
            System.out.println(s);
        }
    }
}
