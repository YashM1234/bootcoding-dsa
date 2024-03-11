package com.bootcoding.dsa.leetcodel1;
import java.util.ArrayList;
import java.util.List;
//Leetcode Q-119 WAP for pascals triangle II index start from 0
public class PascalsTriangleII {
    public static void main(String[] args) {
        int rowIndex = 3;
        //Method Calling
        List<Integer> row = getRow(rowIndex);
        System.out.println(row);

    }

    //Method Definition
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> pList = new ArrayList<>();
        if(rowIndex == 0){
            pList.add(1);
            return pList;
        }

        pList.add(1);
        for(int row = 1; row <= rowIndex; row++){
            List<Integer> cList = new ArrayList<>();
            cList.add(1);
            for(int col = 0; col < pList.size()-1; col++){
                cList.add(pList.get(col) + pList.get(col+1));
            }
            cList.add(1);
            pList = cList;
        }
        return pList;
    }
}
