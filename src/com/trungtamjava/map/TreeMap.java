package com.trungtamjava.map;

import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new java.util.TreeMap<Integer, String>();

        map.put(1, "A");
        map.put(4, "A");
        map.put(2, "A");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        map.remove(1);
        map.clear();
    }
}
