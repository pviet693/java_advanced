package com.trungtamjava.euqals_and_equalequal;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1, "A");
        Person p2 = new Person(1, "A");

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
    }
}
