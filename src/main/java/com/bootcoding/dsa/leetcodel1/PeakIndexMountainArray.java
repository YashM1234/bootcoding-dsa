package com.bootcoding.dsa.leetcodel1;
/*Leetcode Q-852. WAP to find peak index in a mountain array
Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
> arr[i + 1] > ... > arr[arr.length - 1].
 */
public class PeakIndexMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,1,6,2,1,0};
        //Method calling
        int index = peakIndexInMountainArray(arr);
        System.out.println(index);
    }

    //Method Definition
    public static int peakIndexInMountainArray(int[] arr) {
//        int i = 0;
//        while(arr[i] < arr[i+1]){
//            i++;
//        }
//        return i;

        //OR

        int low = 0, high = arr.length - 1, mid;
        while (low < high) {
            mid = (low + high) / 2;
            if (arr[mid] < arr[mid + 1])
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }
}
