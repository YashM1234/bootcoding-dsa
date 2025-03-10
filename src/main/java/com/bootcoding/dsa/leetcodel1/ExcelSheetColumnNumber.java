package com.bootcoding.dsa.leetcodel1;
/*
Leetcode Q-171 WAP to find Excel sheet column number
Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...

Constraints:

1 <= columnTitle.length <= 7
columnTitle consists only of uppercase English letters.
columnTitle is in the range ["A", "FXSHRXW"].
 */
public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        String columnTitle = "ZY";
        //Method Calling
        int columnNumber = titleToNumber(columnTitle);
        System.out.println(columnNumber);
    }

    //Method Definition
    public static int titleToNumber(String columnTitle) {
        int columnNumber = 0;
        for(int ch: columnTitle.toCharArray()){
            columnNumber = (columnNumber * 26) + (ch -'A' + 1);
        }
        return columnNumber;
    }
}
