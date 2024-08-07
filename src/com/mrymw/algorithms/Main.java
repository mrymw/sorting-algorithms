package com.mrymw.algorithms;

import static com.mrymw.algorithms.BinarySearch.binarySearch;
import static com.mrymw.algorithms.BubbleSort.bubbleSort;
import static com.mrymw.algorithms.BubbleSort.reverseBubbleSort;

public class Main {
    public static void main(String[] args) {
        int[] array = {5,3,4,1,2};
        int[] sortedArray ={1,2,3,6,7,9};
        int target = 7;
         bubbleSort(array);
        reverseBubbleSort(array);
        //System.out.println(binarySearch(sortedArray, target));
        String[] arrays = {"apples", "bananas", "grapes", "pineapple"};
        String targets = "grapes";
        System.out.println(BST.binarySearchString(arrays, targets));
    }
}
