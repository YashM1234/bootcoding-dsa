package com.bootcoding.dsa.assignmentdsa;
//WAP to copy only even elements of a given array to another array
public class EvenElementArrayCopy {
    public static void main(String[] args) {
        int[] arr = {2, 8, 7, 9, 6, 10, 50, 7};
        int count = 0;
        //count number of even element
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%2 == 0){
                count++;
            }
        }
        //Declare a new array (newArr) of length even count to store even numbers from input array
        int[] newArr = new int[count];

        //As size of newArr and arr is different, we use nI as new indexing for newArr and copy even number from arr to newArr
        int nI = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%2 == 0){
                newArr[nI++] = arr[i];
            }
        }
        //print newArr
        for(int i = 0; i < newArr.length; i++){
            System.out.println(newArr[i]);
        }
    }
}
