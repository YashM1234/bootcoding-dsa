package com.bootcoding.dsa.leetcodel1;
/*Leetcode Q-1122 WAP for relative sort array
Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2.
Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.
 */
public class RelativeSortArray {
    public static void main(String[] args) {
        //Declare and initialize the array
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        //Method Calling
        int[] arr = relativeSortArray(arr1,arr2);

        for(int x : arr){
            System.out.println(x);
        }
    }

    //Method definition
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int count = 0;
        int key = 0;
        int k = 0;
        int[] newArr = new int[arr1.length];
        int x = newArr.length-1;
        //Sort array and store sorted array in new array
        for(int i = 0; i < arr2.length; i++){
            for (int j = 0; j < arr1.length; j++){
                if(arr2[i]==arr1[j]){
                    newArr[k++] = arr1[j];
                    count++;
                }
            }
        }
        //Find numbers which is not present in arr2 and store it at the end of new array
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i]==arr2[j]){
                    key++;
                }
            }
            if(key == 0){
                newArr[x--] = arr1[i];
            }
            key = 0;
        }
        //Sort array for numbers which is not present in arr2
        for(int i = count; i < newArr.length-1; i++) {
            for (int j = i; j < newArr.length-1 ; j++) {
                if (newArr[i] > newArr[j + 1]) {
                    int temp = newArr[i];
                    newArr[i] = newArr[j + 1];
                    newArr[j + 1] = temp;
                }
            }
            newArr[k++] = newArr[i];
        }
        return newArr;
    }
}
