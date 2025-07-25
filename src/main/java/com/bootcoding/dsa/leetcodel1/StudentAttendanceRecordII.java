package com.bootcoding.dsa.leetcodel1;

/*
Leetcode Q-551 WAP to find Student Attendance Record II
An attendance record for a student can be represented as a string where each character signifies whether
the student was absent, late, or present on that day. The record only contains the following three characters:
'A': Absent.
'L': Late.
'P': Present.
Any student is eligible for an attendance award if they meet both of the following criteria:
The student was absent ('A') for strictly fewer than 2 days total.
The student was never late ('L') for 3 or more consecutive days.
Given an integer n, return the number of possible attendance records of length n that make a student eligible for
an attendance award. The answer may be very large, so return it modulo 109 + 7.
 */
public class StudentAttendanceRecordII {
    public static void main(String[] args) {
        int n = 2;
        //Method Calling
        int result = checkRecord(n);
        System.out.println(result);
    }

    //Method Definition
    public static int checkRecord(int n) {
        int MOD = 1_000_000_007;

        long[] dp = new long[n + 1];
        dp[0] = 1;
        if(n >= 1) dp[1] = 2;
        if(n >= 2) dp[2] = 4;

        for(int i = 3; i <= n; i++){
            dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 3]) % MOD;
        }

        long result = dp[n];

        for(int i = 0; i < n; i++){
            long left = dp[i];
            long right = dp[n - 1 - i];
            result = (result + (left * right) % MOD) % MOD;
        }

        return (int) result;
    }
}
