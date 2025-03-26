package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-3304 WAP to Find the K-th Character in String Game I
Alice and Bob are playing a game. Initially, Alice has a string word = "a".
You are given a positive integer k.
Now Bob will ask Alice to perform the following operation forever:
Generate a new string by changing each character in word to its next character in the English alphabet,
and append it to the original word.
For example, performing the operation on "c" generates "cd" and performing the operation on "zb" generates "zbac".
Return the value of the kth character in word, after enough operations have been done for word to
have at least k characters.
Note that the character 'z' can be changed to 'a' in the operation.
 */
public class FindKthCharInStringGameI {
    public static void main(String[] args) {
        int k = 10;

        //Method Calling
        char result = kthCharacter(k);
        System.out.println(result);
    }

    //Method Definition
    public static char kthCharacter(int k) {

        int position = Integer.bitCount(k - 1);
        return (char) ('a' + position);

        //OR

//        StringBuilder current = new StringBuilder();
//        current.append("a");
//        while(current.length() < k){
//            int n = current.length();
//            for(int i = 0; i < n; i++){
//                current.append((char) ('a' + (current.charAt(i) - 'a' + 1) % 26));
//            }
//        }
//        return current.charAt(k-1);
    }
}
