package com.trungtamjava.euqals_and_equalequal;

public class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        super();
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

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person person = (Person) obj;

            if (person.getId() == this.id) return true;
            return false;
        }

        return false;
    }
}
