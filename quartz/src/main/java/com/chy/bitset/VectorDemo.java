package com.chy.bitset;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector v1 = new Vector(3, 2);
        System.out.println("111111111111111111111111111111");
        System.out.println(v1.size());
        System.out.println(v1.capacity());
        v1.add(12);
        v1.addElement(new Integer(10));
        System.out.println("222222222222222222222222222222");
        System.out.println(v1.size());
        System.out.println(v1.capacity());
    }
}
