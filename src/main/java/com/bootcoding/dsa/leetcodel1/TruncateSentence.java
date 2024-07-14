package com.bootcoding.dsa.leetcodel1;

import javax.print.attribute.standard.OrientationRequested;

//Leetcode Q-1816.WAP for truncate sentence
public class TruncateSentence {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        //Method calling
        String result = truncateSentence(s, k);
        System.out.println(result);
    }
    //Method definition
    public static String truncateSentence(String s, int k) {
//       //Splitting the string into array string
//       String[] strArr = s.split(" ");
//       //Allocate value at index 0 to newStr
//       String newStr = strArr[0];
//       //For loop to concatenate sting upto value of k
//       for(int i = 1; i < k; i++){
//           newStr = newStr + " " + strArr[i];
//       }
//       //returning newStr which is up to value of k
//       return newStr;

        //OR
        //Splitting the string into array string
        String[] strArr1 = s.split(" ");
        //Declaring new array to store value upto k
        String[] strArr2 = new String[k];
        //Transfer value upto k in new string array i.e. strArr2
        for(int i = 0; i < k; i++){
            strArr2[i] = strArr1[i];
        }
        //join array value and form string and return it
        return String.join(" ", strArr2);
    }
}
