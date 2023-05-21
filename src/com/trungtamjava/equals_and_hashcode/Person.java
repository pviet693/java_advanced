package com.trungtamjava.equals_and_hashcode;

public class Person {
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 10;
    }
}
