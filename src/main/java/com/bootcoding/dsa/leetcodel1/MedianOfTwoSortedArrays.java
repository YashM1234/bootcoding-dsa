package com.bootcoding.dsa.leetcodel1;
/* Leetcode Q-4 WAP to find the median of two sorted arrays
Constraints:
nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106
 */
public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] num1 = {1 , 3};
        int[] num2 = {2, 4};
        //Method Calling
        double median = findMedianSortedArrays(num1, num2);
        System.out.println(median);
    }

    //Method Definition
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0.0;
        int m = nums1.length;
        int n = nums2.length;
        int[] mergeSortedArr = new int[m + n];
        int length = mergeSortedArr.length;

        for(int i = 0, j = 0, k = 0; k < mergeSortedArr.length; k++){
            if(i == m){
                mergeSortedArr[k] = nums2[j];
                j++;
            }else if(j == n){
                mergeSortedArr[k] = nums1[i];
                i++;
            }else if(nums1[i] < nums2[j]){
                mergeSortedArr[k] = nums1[i];
                i++;
            }else{
                mergeSortedArr[k] = nums2[j];
                j++;
            }
        }

        if(length % 2 != 0){
            median = mergeSortedArr[length/2];
        }else {
            median = (mergeSortedArr[(length-1)/2]+mergeSortedArr[(length/2)])/2.0;
        }
        return median;
    }
}
