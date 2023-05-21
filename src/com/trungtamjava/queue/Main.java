package com.trungtamjava.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        queue.add("A");
        queue.add("C");
        queue.add("B");
        queue.add("D");
        queue.add("G");
        queue.add("E");
        queue.add("A");

        for (String s : queue) {
            System.out.println(s);
        }

        queue.remove(); // delete top element, first in first out
        queue.remove("C"); // delete specific element
    }
}
