package com.bootcoding.dsa.assignmentdsa;
//WAP to copy elements of an array into another array in a reverse order
public class CopyArrayToNewArrayReverse {
    public static void main(String[] args) {
        //Declare and Initialise input array
        int[] arr = {5, 9, 7, -6, 3};
        //Declare a new array to copy element
        int[] newArr = new int[arr.length];
        //Store value of array length-1 in index variable
        int index = arr.length-1;
        //Copy element of arr into newArr in reverse order
        for(int i = 0; i < arr.length; i++){
            newArr[index--] = arr[i];
        }
        //Print new array
        for (int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i] + " ");
        }
    }
}
