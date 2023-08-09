package com.bootcoding.dsa.leetcodel1;
/* Leetcode Q-832 WAP for flipping an image
Given an n x n binary matrix image, flip the image horizontally,
then invert it, and return the resulting image.
To flip an image horizontally means that each row of the image is reversed.
For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
For example, inverting [0,1,1] results in [1,0,0].
 */
public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        //Method Calling
        int[][] flipImage = flipAndInvertImage(image);
        for(int[] row: flipImage){
            for (int col : row) {
                System.out.print(col + " ");
            }
        }
    }

    //Method Definition
    public static int[][] flipAndInvertImage(int[][] image) {
        int col = image[0].length;
        for(int[] row : image){
            for(int i = 0; i < (col + 1)/2; i++){
                int temp = row[i] ^ 1; //XOR (^) if both are same then result is 0 else 1
                row[i] = row[col - 1 - i] ^ 1;
                row[col -1 - i] = temp;
            }
        }
        return image;
    }
}
