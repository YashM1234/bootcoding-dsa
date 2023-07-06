package com.bootcoding.dsa.assignmentdsa;
//WAP to reverse array without using second array
public class ReverseArrayWithoutSecondArray {
    public static void main(String[] args) {
        //Declare and initialise an array
        int[] arr = {2, 8, 9, 7, 3};
        //Initialise start index
        int sIndex = 0;
        //Find and initialise last index
        int lIndex = arr.length-1;
        //Find and initialise middle index of array
        int half = arr.length/2;
        //Declare temp variable in which we store value temporary while swapping
        int temp;
        //We use swapping concept to reverse array
        for (int i = 0; i < half; i++){
                temp = arr[lIndex];
                arr[lIndex] = arr[sIndex];
                arr[sIndex] = temp;
                lIndex--;
                sIndex++;
        }
        //Print array after reversing
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
