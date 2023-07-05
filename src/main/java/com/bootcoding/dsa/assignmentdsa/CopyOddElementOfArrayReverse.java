package com.bootcoding.dsa.assignmentdsa;
//WAP to copy an odd element of an array into another in a reverse order
public class CopyOddElementOfArrayReverse {
    public static void main(String[] args) {
        //Declare and Initialise input array
        int[] arr = {5, 9, 7, -6, 3};
        //Count an odd element in an array
        int countOddIndex = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%2 != 0){
                countOddIndex++;
            }
        }
        //Declare a new array to copy element
        int[] newArr = new int[countOddIndex];

        //Store value of array countOddIndex-1 in index variable
        int index = countOddIndex-1;
        //Copy element of arr into newArr in reverse order
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%2 != 0) {
                newArr[index--] = arr[i];
            }
        }
        //Print new array
        for (int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i] + " ");
        }
    }
}
