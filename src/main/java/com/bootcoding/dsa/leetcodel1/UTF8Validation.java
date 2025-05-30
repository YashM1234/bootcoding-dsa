package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-393 WAP for UTF-8 Validation
Given an integer array data representing the data, return whether it is a valid UTF-8 encoding
(i.e. it translates to a sequence of valid UTF-8 encoded characters).
A character in UTF8 can be from 1 to 4 bytes long, subjected to the following rules:
For a 1-byte character, the first bit is a 0, followed by its Unicode code.
For an n-bytes character, the first n bits are all one's, the n + 1 bit is 0, followed by n - 1 bytes
with the most significant 2 bits being 10.
This is how the UTF-8 encoding would work:

     Number of Bytes   |        UTF-8 Octet Sequence
                       |              (binary)
   --------------------+-----------------------------------------
            1          |   0xxxxxxx
            2          |   110xxxxx 10xxxxxx
            3          |   1110xxxx 10xxxxxx 10xxxxxx
            4          |   11110xxx 10xxxxxx 10xxxxxx 10xxxxxx
x denotes a bit in the binary form of a byte that may be either 0 or 1.
Note: The input is an array of integers. Only the least significant 8 bits of each integer is used
to store the data. This means each integer represents only 1 byte of data.
 */
public class UTF8Validation {
    public static void main(String[] args) {
        int[] data = {197, 130, 1};
        //Method Calling
        boolean result = validUtf8(data);
        System.out.println(result);
    }

    //Method Definition
    public static boolean validUtf8(int[] data) {
        int i = 0;

        while(i < data.length){
            int byteVal = data[i];

            int count = 0;
            int mask = 1 << 7;
            while((byteVal & mask) != 0){
                count++;
                mask >>= 1;
            }

            if(count == 1 || count > 4) return false;

            if(count == 0){
                i++;
                continue;
            }

            if(i + count > data.length) return false;

            for(int j = 1; j < count; j++){
                if((data[i + j] & 0b11000000) != 0b10000000){
                    return false;
                }
            }
            i += count;
        }

        return true;
    }
}
