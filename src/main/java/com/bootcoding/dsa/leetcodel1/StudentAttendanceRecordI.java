package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-551 WAP for Student Attendance Record I
You are given a string s representing an attendance record for a student where each character signifies whether
the student was absent, late, or present on that day. The record only contains the following three characters:
'A': Absent.
'L': Late.
'P': Present.
The student is eligible for an attendance award if they meet both of the following criteria:

The student was absent ('A') for strictly fewer than 2 days total.
The student was never late ('L') for 3 or more consecutive days.
Return true if the student is eligible for an attendance award, or false otherwise.
 */
public class StudentAttendanceRecordI {
    public static void main(String[] args) {
        String s = "PPALLP";
        //Method Calling
        boolean result = checkRecord(s);
        System.out.println(result);
    }

    //Method Definition
    public static boolean checkRecord(String s) {
        int countA = 0;
        int countL = 0;

        for(char ch: s.toCharArray()){
            if(ch == 'L'){
                countL++;
                if(countL >= 3) return false;
            }else if(ch == 'A'){
                countA++;
                if(countA >= 2) return false;
                countL = 0;
            }else{
                countL = 0;
            }
        }

        return true;
    }
}
