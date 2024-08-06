package com.mrymw.warmup;

import java.util.ArrayList;
import java.util.List;

public class FindingTarget {
    public static int findTarget(int[] array, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int s : array) {
            list.add(s);
        }
        return list.indexOf(target);
    }
}
