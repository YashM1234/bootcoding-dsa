package com.bootcoding.dsa.leetcodel1;

import java.util.ArrayDeque;
import java.util.Deque;

/*
Leetcode Q-224 WAP for Basic Calculator
Given a string s representing a valid expression, implement a basic calculator to evaluate it,
and return the result of the evaluation.
Note: You are not allowed to use any built-in function which evaluates strings as mathematical
expressions, such as eval().
Constraints:
1 <= s.length <= 3 * 105
s consists of digits, '+', '-', '(', ')', and ' '.
s represents a valid expression.
'+' is not used as a unary operation (i.e., "+1" and "+(2 + 3)" is invalid).
'-' could be used as a unary operation (i.e., "-1" and "-(2 + 3)" is valid).
There will be no two consecutive operators in the input.
Every number and running calculation will fit in a signed 32-bit integer.
 */
public class BasicCalculator {
    public static void main(String[] args) {
        String s = "(1+(4+5+2)-3)+(6+8)";
        //Method calling
        int result = calculate(s);
        System.out.println(result);
    }

    //Method Definition
    public static int calculate(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        int result = 0;
        int sign = 1;
        int i = 0;

        while(i < s.length()){
            char c = s.charAt(i);

            if(Character.isDigit(c)){
                int number = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))){
                    number = number * 10 + (s.charAt(i) - '0');
                    i++;
                }
                result += sign * number;
                continue;
            }else if(c == '+'){
                sign = 1;
            }else if(c == '-'){
                sign = -1;
            }else if(c == '('){
               stack.push(result);
               stack.push(sign);
               result = 0;
               sign = 1;
            }else if(c == ')'){
                int prevSign = stack.pop();
                int prevResult = stack.pop();
                result = prevResult + prevSign * result;
            }
            i++;
        }

        return result;
    }
}
