package com.mrymw.algorithms;
public class BinarySearch {
    public static int binarySearch(int[] array, int target){
        int low = 0, high = array.length-1;
        while (low <= high){
            int mid = low + (high-low)/2;
            if(array[mid] == target) {
                return mid;
            } else if (target < array[mid]) {
                low = mid -1;

            } else {
                high=mid + 1;
            }
        }
        return -1;

    }
}
