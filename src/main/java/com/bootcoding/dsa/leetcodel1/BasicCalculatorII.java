package com.bootcoding.dsa.leetcodel1;

import java.util.ArrayDeque;
import java.util.Deque;

/*
Leetcode Q-227 WAP for Basic Calculator II
Given a string s which represents an expression, evaluate this expression and return its value.
The integer division should truncate toward zero.
You may assume that the given expression is always valid. All intermediate results will be in
the range of [-231, 231 - 1].
Note: You are not allowed to use any built-in function which evaluates strings as mathematical
expressions, such as eval().
Constraints:
1 <= s.length <= 3 * 105
s consists of integers and operators ('+', '-', '*', '/') separated by some number of spaces.
s represents a valid expression.
All the integers in the expression are non-negative integers in the range [0, 231 - 1].
The answer is guaranteed to fit in a 32-bit integer.
 */
public class BasicCalculatorII {
    public static void main(String[] args) {
        String s = "3+5 / 2 ";
        //Method Calling
        int result = calculate(s);
        System.out.println(result);
    }

    //Method Definition
    public static int calculate(String s) {
        if(s == null || s.isEmpty()) return 0;

        Deque<Integer> stack = new ArrayDeque<>();
        int num = 0;
        char sign = '+';

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }

            if ((!Character.isDigit(c) && !Character.isWhitespace(c)) || i == s.length() - 1) {
                if (sign == '-') {
                    stack.push(-num);
                } else if (sign == '+') {
                    stack.push(num);
                } else if (sign == '*') {
                    stack.push(stack.pop() * num);
                } else if (sign == '/') {
                    stack.push(stack.pop() / num);
                }
                sign = c;
                num = 0;
            }
        }

            int result = 0;
            while(!stack.isEmpty()){
                result += stack.pop();
            }

        return result;
    }
}
