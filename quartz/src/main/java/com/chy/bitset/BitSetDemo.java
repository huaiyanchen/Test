package com.chy.bitset;

import java.util.BitSet;

public class BitSetDemo {
    public static void main(String[] args) {
        BitSet bitSet1 = new BitSet(16);
        BitSet bitSet2 = new BitSet(16);
        for (int i = 0; i < 16; i++) {
            if (i % 2 == 0) {
                bitSet1.set(i);
            }
            if (i % 5 != 0) {
                bitSet2.set(i);
            }
        }
        System.out.println(bitSet1);
        System.out.println(bitSet2);


        bitSet1.and(bitSet2);
        System.out.println("=============================");
        System.out.println(bitSet1);

        bitSet1.or(bitSet2);
        System.out.println("22222=============================");
        System.out.println(bitSet1);

        bitSet1.xor(bitSet2);
        System.out.println("3333333333333=============================");
        System.out.println(bitSet1);







    }
}
