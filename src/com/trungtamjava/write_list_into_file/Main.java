package com.trungtamjava.write_list_into_file;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("JMaster.io");
        p1.setAge(6);

        Person p2 = new Person();
        p2.setName("Trungtamjava.com");
        p2.setAge(6);

        List<Person> list = new ArrayList<Person>();

        list.add(p1);
        list.add(p2);

        FileService fileService = new FileService();
        try {
            fileService.writeToFile(list);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            List<Person> pList = fileService.readFromFile();
            for (Person p : pList) {
                System.out.println(p.getName() + " " + p.getAge());
            }

            Person p3 = new Person();
            p3.setName("JMaster Trung tam java");
            p3.setAge(21);

            list.add(p3);

            fileService.writeToFile(list);
            for (Person p : fileService.readFromFile()) {
                System.out.println(p.getName() + " " + p.getAge());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
