package com.trungtamjava.list;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        Person p1 = new Person(1);
        Person p2 = new Person(2);
        Person p3 = new Person(3);

        // khai báo list
        List<Person> listPerson = new java.util.ArrayList<Person>();

        // thêm phần tử
        listPerson.add(p1);
        listPerson.add(p2);
        listPerson.add(p3);
        listPerson.add(p3);

        // lấy phần tử
        Person p = listPerson.get(0);

        System.out.println(p.getId());

        // duyệt list
        for (Person person : listPerson) {
            System.out.println(person.getId());
        }

        for (int i = 0; i < listPerson.size(); i++) {
            System.out.println(listPerson.get(i).getId());
        }

        System.out.println("--------------");

        // xoá phần tử
        listPerson.remove(3);
        listPerson.remove(p1);
        listPerson.remove(new Person(2)); // không work, cần viết hàm equals trong class Person

        for (Person person : listPerson) {
            System.out.println(person.getId());
        }
    }
}
