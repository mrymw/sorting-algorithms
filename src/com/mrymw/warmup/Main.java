package com.mrymw.warmup;

import static com.mrymw.warmup.FindingTarget.findTarget;

public class Main {
    public static void main(String[] args) {
        int[] array = {4,6,7,2,3};
        int target = 2;
        System.out.println(findTarget(array, target));
    }
}
