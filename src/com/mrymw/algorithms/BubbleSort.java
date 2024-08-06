package com.mrymw.algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        boolean isSwapped;
        for (int i =0; i<array.length-1; i++) {
            isSwapped = false;
            for (int j = 0; j<array.length-i-1; j++ ){
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
            System.out.println(Arrays.toString(array));
        }}
    public static void reverseBubbleSort(int[] array) {
        boolean isSwapped;
        for (int i =0; i<array.length-1; i++) {
            isSwapped = false;
            for (int j = 0; j<array.length-i-1; j++ ){
                if(array[j] < array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
            System.out.println(Arrays.toString(array));
        }

    }

}
