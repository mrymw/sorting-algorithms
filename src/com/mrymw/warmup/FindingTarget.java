package com.mrymw.warmup;

import java.util.ArrayList;
import java.util.List;


public class FindingTarget {
    public static int findTarget(int[] array, int target) {
        List<Integer> list = new ArrayList<>();
        for (int s : array) {
            list.add(s);
        }
        return list.indexOf(target);
    }
    public static  int finding(int[] array, int target) {
        for (int i = 0; i<array.length; i++) {
            if(target==array[i]) {
                return i;
            }
        }
        return -1;
    }
}
