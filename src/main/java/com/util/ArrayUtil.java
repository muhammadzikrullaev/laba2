package com.util;

import java.util.Random;

public class ArrayUtil {

    public static Double[] generateArray(Integer n) {
        Random ran = new Random();
        Double[] array = new Double[n];
        for (int i = 0; i < n; i++) {
            array[i] = ran.nextDouble(1, 100);
        }
        return array;
    }
}
