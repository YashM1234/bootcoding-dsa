package com.bootcoding.dsa.leetcodel1;
import java.util.HashMap;
import java.util.Map;
//Leetcode Q-2325. WAP to decode the message
public class DecodeTheMessage {
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";

        String decodeMsg = decodeMessage(key, message);
        System.out.println(decodeMsg);
    }
    public static String decodeMessage(String key, String message) {
        //Create key value pair such that key - key and value - alphabet[a-z]
        Map<Character, Character> keyValMap = new HashMap<>();
        int index = 0;
        //for loop to generate key value pair
        for(char ch: key.toCharArray()){
            //if character is not space or not already present in map then put it into a map
            if(!(ch == ' ' || keyValMap.containsKey(ch))) {
                keyValMap.put(ch, (char) ('a' + (index++)));//type casting ASCII value
            }
        }
        //Create string builder to build/store decode message
        StringBuilder dMsg = new StringBuilder();
        for(char ch: message.toCharArray()){
            //if character in a message is space then append space otherwise append the value of key(ch) from map
            dMsg.append((ch == ' ')? ' ': keyValMap.get(ch));
        }
        return dMsg.toString();
    }
}
