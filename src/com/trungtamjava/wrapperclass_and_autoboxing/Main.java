package com.trungtamjava.wrapperclass_and_autoboxing;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        Integer y = new Integer(10);

        int z = x + y; // autoboxing, cụ thể là unboxing, chuyển từ đối tượng về cơ bản Integer -> int
        System.out.println(z);

        int z1 = Integer.valueOf("123");
        int z2 = Integer.parseInt("234");
        Long l = Long.valueOf("45");
        Boolean b = Boolean.valueOf("true");

        Integer k = 10; // boxing, chuyển từ cơ bản về đối tượng
        k = new Integer(10);

        int x1 = 10, x2 = 10;
        Integer x3 = 10;

        System.out.println(x1 == x2); // true
        System.out.println(x1 == x3); // true

        Integer k1 = new Integer(10);
        Integer k2 = new Integer(10);
        int k3 = 10;

        System.out.println(k1 == k2); // false: so sánh địa chỉ bộ nhớ
        System.out.println(k1 == k3); // true
        System.out.println(k1.equals(k2)); // true
    }
}
