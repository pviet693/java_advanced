package com.trungtamjava.comparable;

public class Person implements Comparable<Person> {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public int compareTo(Person p) { // tăng dần
//        int sort = 1;
//        if (this.id > p.getId()) return 1 * sort;
//        if (this.id < p.getId()) return -1 * sort;
//        return 0;
//    }

    @Override
    public int compareTo(Person p) { // tăng dần
        return this.name.compareTo(p.getName());
    }
}
