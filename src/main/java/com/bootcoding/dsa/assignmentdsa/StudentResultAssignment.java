package com.bootcoding.dsa.assignmentdsa;
/*
Consider student results is published in following format
Marks1,Marks2,Marks3
For Example: "72,65,77"
Calculate its average and percentage and append it to input string and print in following format
72,65,77,XX,XX
 */
public class StudentResultAssignment {
    public static void main(String[] args) {
        String result = "72,65,77";
        int sum = 0;
        double average = 0.0;
        double percentage = 0.0;
        String[] eachSubject = result.split(",");
        int[] numericMark = new int[eachSubject.length];

        for(int i = 0; i < eachSubject.length; i++){
            numericMark[i] = Integer.parseInt(eachSubject[i]);
            sum = sum + numericMark[i];
        }

        average = sum/(numericMark.length+0.0);

        percentage = average;

        String strAverage = Double.toString(average);
        String strPercentage = Double.toString(percentage);

        result = result + "," + strAverage + "," + strPercentage;
        System.out.println(result);
    }
}
