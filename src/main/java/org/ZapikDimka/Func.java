package org.ZapikDimka;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Func {
    public static String concat(String a, String b){
        String result = a;
        if (a.toLowerCase().charAt(a.length()-1) == b.toLowerCase().charAt(0))
            result += b.substring(1);
        else
            result += " " + b;

        return result;
    }

    public static int mode(int[] arr){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int a : arr){
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}