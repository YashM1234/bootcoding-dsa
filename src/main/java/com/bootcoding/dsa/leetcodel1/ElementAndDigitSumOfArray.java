package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-2535. WAP for difference between element sum and digit sum of an array
public class ElementAndDigitSumOfArray {
    public static void main(String[] args) {
        //Declaring and initialising an array
        int[] nums = {1, 25, 125, 3};
        //method calling
        int difference = differenceOfSum(nums);
        System.out.println(difference);
    }
    //Method to calculate difference of sum
    public static int differenceOfSum(int[] nums) {
        //Calling method elementSum()
        int elementSum = elementSum(nums);
        //Calling method digitSum()
        int digitSum = digitSum(nums);
        //returning difference
        return elementSum-digitSum;
    }
    //Method to calculate sum of elements in an array
    public static int elementSum(int[] nums){
        int eSum = 0;
        for(int i = 0; i < nums.length; i++){
            eSum = eSum + nums[i];
        }
        return eSum;
    }
    //Method to calculate sum of digits in an array
    public static int digitSum(int[] nums){
        int dSum = 0;
        for(int i = 0; i < nums.length; i++){
            //If number is less than 10 i.e. if number is single digit
            if(nums[i] < 10){
                dSum = dSum + nums[i];
            }
            //If number is multiDigit
            else{
                //Finding the length of number
                int length = String.valueOf(nums[i]).length();
                //Creating array to store each digit of number
                int[] digits = new int[length];
                int index = 0;
                //Separating each digit of number and store it in array digits
                while (nums[i] > 0){
                    int sepDigit = nums[i]%10;
                    digits[index++] = sepDigit;
                    nums[i] = nums[i]/10;
                }
                //Calculating separated digits sum and store it in dSum variable
                for (int numbers: digits){
                    dSum = dSum + numbers;
                }
            }
        }
        //Returning digits sum of array
        return dSum;
    }
}
