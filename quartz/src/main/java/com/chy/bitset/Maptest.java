package com.chy.bitset;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maptest {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("1", "d1");
        map.put("2", "d2");
        Set set = map.entrySet();
        System.out.println(set);
    }
}
