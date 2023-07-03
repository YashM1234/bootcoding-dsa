package com.bootcoding.dsa.assignmentdsa;
//WAP to copy the elements of one array into another array and print the array
public class CopyArrayToNewArray {
    public static void main(String[] args) {
        //Declare and initialise an array of name arr
        int[] arr = {7, 24, 19, 44, 45, 22, 17};
        //Declare newArr to copy input array i.e arr
        int[] newArr = new int[arr.length];
        //Copy arr into newArr
        for(int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        //Print newArr
        for (int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i]+ " ");
        }
    }

}
