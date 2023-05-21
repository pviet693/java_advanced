package com.trungtamjava.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<String>();

        listString.add("a");
        listString.add("d");
        listString.add("c");
        listString.add("b");

        for (String s : listString) {
            System.out.println(s);
        }

        System.out.println("Sap xep tang dan: ");
        Collections.sort(listString);

        for (String s : listString) {
            System.out.println(s);
        }

        List<Integer> listInteger = new ArrayList<Integer>();

        listInteger.add(10);
        listInteger.add(6);
        listInteger.add(8);
        listInteger.add(9);
        listInteger.add(4);

        for (Integer i : listInteger) {
            System.out.println(i);
        }

        System.out.println("Sap xep tang dan: ");
        Collections.sort(listInteger);

        for (Integer i : listInteger) {
            System.out.println(i);
        }

    }
}
