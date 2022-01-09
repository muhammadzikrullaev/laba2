package com.service;

import java.util.*;

import static com.util.ArrayUtil.*;

public class SimpleSort {

    public void countTimeForSimpleSort(int n) {
        var array = generateArray(n);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }


}
