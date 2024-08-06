package com.mrymw.warmup;

import static com.mrymw.warmup.FindingTarget.findTarget;
import static com.mrymw.warmup.FindingTarget.finding;

public class Main {
    public static void main(String[] args) {
        int[] array = {4,6,7,2,3};
        int target = 7;
        System.out.println(findTarget(array, target));
        System.out.println(finding(array, target));
    }
}
