package com.bootcoding.dsa.leetcodel1;
/* Leetcode Q-168 WAP to solve Excel sheet column title problem
Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
 */
public class ExcelSCTitle {
    public static void main(String[] args) {
        int num = 701;
        //Method calling
        String str = convertToTitle(num);
        System.out.println(str);
    }

    //Method definition
    public static String convertToTitle(int columnNumber) {
        StringBuilder newString = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            char ch = (char)((columnNumber%26)+'A');
            newString.append(ch);
            columnNumber = columnNumber/26;
        }
        newString.reverse();
        return newString.toString();

        //OR

//        String result="";
//        while(columnNumber > 0){
//            columnNumber--;
//            result = (char)('A'+(columnNumber%26))+result;
//            columnNumber = columnNumber/26;
//        }
//        return result;
    }
}
