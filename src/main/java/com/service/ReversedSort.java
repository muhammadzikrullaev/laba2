package com.service;

import java.util.Arrays;
import java.util.Collections;

import static com.util.ArrayUtil.*;

public class ReversedSort {

    public void countTimeForReverseSort(int n) {
        var array = generateArray(n);
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));
    }

}
