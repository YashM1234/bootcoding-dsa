package com.bootcoding.dsa.leetcodel1;
/*
Leetcode Q-345 WAP to Reverse vowels of a string
 */
public class ReverseVowels {
    public static void main(String[] args) {
        String s = "leetcode";
        //Method Calling
        String resultantString = reverseVowels(s);
        System.out.println(resultantString);
    }

    //Method Definition
    public static String reverseVowels(String s) {
        char[] charStr = s.toCharArray();
        int left = 0;
        int right = s.length()-1;

        while (left < right) {
            boolean leftChar = isVowels(charStr[left]);
            boolean rightChar = isVowels(charStr[right]);

            if(leftChar && rightChar){
                char temp = charStr[left];
                charStr[left++] = charStr[right];
                charStr[right--] = temp;
            }else if(leftChar && !rightChar){
                right--;
            }else if(rightChar && !leftChar){
                left++;
            }else {
                left++;
                right--;
            }
        }
        return new String(charStr);
    }

    private static boolean isVowels(char ch){
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                || (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
    }
}
