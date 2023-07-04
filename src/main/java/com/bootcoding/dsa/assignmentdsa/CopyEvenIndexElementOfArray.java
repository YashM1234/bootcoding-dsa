package com.bootcoding.dsa.assignmentdsa;
//WAP to copy even index element of an array into another array
public class CopyEvenIndexElementOfArray {
    public static void main(String[] args) {
        //Declare and Initialise input array
        int[] arr = {5, 9, 7, -6, 3};
        //Count even index in an array
        int countEvenIndex = 0;
        for(int i = 0; i < arr.length; i++){
            if(i%2 == 0){
                countEvenIndex++;
            }
        }
        //Declare a new array to copy element
        int[] newArr = new int[countEvenIndex];
        //Copy even index element of array into new array
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if(i%2 == 0){
                newArr[index++] = arr[i];
            }
        }
        //print new array
        for (int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i] + " ");
        }
    }
}
