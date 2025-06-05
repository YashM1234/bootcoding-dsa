package com.bootcoding.dsa.leetcodel1;

import java.util.ArrayList;
import java.util.List;

/*
Leetcode Q-282 WAP for Expression Add Operators
Given a string num that contains only digits and an integer target, return all possibilities to insert the binary
operators '+', '-', and/or '*' between the digits of num so that the resultant expression evaluates to the target value.
Note that operands in the returned expressions should not contain leading zeros.
 */
public class ExpressionAddOperators {
    public static void main(String[] args) {
        String num = "232";
        int target = 8;
        //Method Calling
        List<String> result = addOperators(num, target);
        System.out.println(result);
    }

    //Method Definition
    public static List<String> addOperators(String num, int target) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", num, target, 0, 0, 0);
        return result;
    }

    private static void backtrack(List<String> result, String path, String num, int target,
                                  int index, long eval, long prevOperand){
        if(index == num.length()){
            if(eval == target){
                result.add(path);
            }
            return;
        }

        for(int i = index; i < num.length(); i++){
            if(i != index && num.charAt(index) == '0') break;

            String part = num.substring(index, i + 1);
            long curr = Long.parseLong(part);

            if(index == 0){
                backtrack(result, path + part, num, target, i + 1, curr, curr);
            }else{
                backtrack(result, path + "+" + part, num, target, i + 1, eval + curr, curr);
                backtrack(result, path + "-" + part, num, target, i + 1, eval - curr, -curr);
                backtrack(result, path + "*" + part, num, target, i + 1,
                        eval - prevOperand + prevOperand * curr, prevOperand * curr);
            }
        }
    }
}
