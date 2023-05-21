package com.trungtamjava.map;

import java.util.Map;
import java.util.Set;

public class HashMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new java.util.HashMap<Integer, String>();

        map.put(1, "A");
        map.put(2, "B");
        map.put(2, "C"); // override -> map.get(2) -> "C"
        map.put(null, "D");

        System.out.println(map.get(null));

        Set<Integer> keySet = map.keySet();

        System.out.println("map before removing:");
        for (Integer i : keySet) {
            System.out.println(i + " " + map.get(i));
        }

        map.remove(1);

        keySet = map.keySet();

        System.out.println("map after removing:");
        for (Integer i : keySet) {
            System.out.println(i + " " + map.get(i));
        }

        System.out.println("-------------");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        map.clear(); // remove all elements

        Map<String, Person> personMap = new java.util.HashMap<String, Person>();

        personMap.put("A", new Person(1));

        Person p = personMap.get("A");
    }
}
