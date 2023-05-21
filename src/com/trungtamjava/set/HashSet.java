package com.trungtamjava.set;

import java.util.Iterator;
import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        Set<String> stringSet = new java.util.HashSet<String>();

        stringSet.add("B");
        stringSet.add("A");
        stringSet.add("E");
        stringSet.add("C");
        stringSet.add("B");

        for (String s : stringSet) {
            System.out.println(s);
        }

        Iterator<String> iterator = stringSet.iterator();

        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.equals("A")) iterator.remove();
            System.out.println(s);
        }

//        stringSet.remove("A");

        for (String s : stringSet) {
            System.out.println(s);
        }
    }
}
