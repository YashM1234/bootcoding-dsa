package com.bootcoding.dsa.leetcodel1;
import java.util.ArrayList;
import java.util.List;

//Leetcode Q-118 WAP for Pascals Triangle row start from 1
public class PascalsTriangle {
    public static void main(String[] args) {
        int numRow = 5;
        //Method Definition
        List<List<Integer>> pTriangle = generate(numRow);
        for (List<Integer> triangle: pTriangle){
            System.out.println(triangle);
        }
    }

    //Method Definition
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pTriangle = new ArrayList<>();
        if(numRows == 0){
            return pTriangle;
        }
        List<Integer> pList = new ArrayList<>();
        pList.add(1);
        pTriangle.add(pList);
        for(int row = 2; row <= numRows; row++){
            List<Integer> cList = new ArrayList<>();
            cList.add(1);
            for(int col = 0; col < pList.size()-1; col++){
                cList.add(pList.get(col) + pList.get(col+1));
            }
            cList.add(1);
            pTriangle.add(cList);
            pList = cList;
        }
        return pTriangle;
    }
}
