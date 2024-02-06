package com.bootcoding.dsa.leetcodel1;
import java.util.LinkedList;
/* Leetcode Q-933 WAP for number of recent calls
ou have a RecentCounter class which counts the number of recent requests
within a certain time frame.
Implement the RecentCounter class:
RecentCounter() Initializes the counter with zero recent requests.
int ping(int t) Adds a new request at time t, where t represents some
time in milliseconds, and returns the number of requests that has happened
in the past 3000 milliseconds (including the new request). Specifically, return
the number of requests that have happened in the inclusive range [t - 3000, t].
It is guaranteed that every call to ping uses a strictly larger value of t than
the previous call.
 */
public class NumberOfRecentCalls {
    public static void main(String[] args) {
        RecentCounter recentCounter = new RecentCounter();
        int c1 = recentCounter.ping(1);     // requests = [1], range is [-2999,1], return 1
        int c2 = recentCounter.ping(100);   // requests = [1, 100], range is [-2900,100], return 2
        int c3 = recentCounter.ping(3001);  // requests = [1, 100, 3001], range is [1,3001], return 3
        int c4 = recentCounter.ping(3002);  // requests = [1, 100, 3001, 3002], range is [2,3002], return 3
        System.out.println(c1 + " " + c2 + " " + c3 + " " + c4);
    }
}

class RecentCounter {
    private final LinkedList<Integer> request;
    private int count;

    public RecentCounter() {
        request = new LinkedList<>();
        count = 0;
    }

    public int ping(int t) {
        while(!request.isEmpty() && request.peek()+3000 < t){
            request.pop();
            count--;
        }
        request.add(t);
        count++;
        return count;

        //OR

//    private final LinkedList<Integer> request;
//    public RecentCounter() {
//        request = new LinkedList<>();
//    }
//    public int ping(int t) {
//        int count = 0;
//        request.add(t);
//        int limit = t-3000;
//        int[] range = {limit, t};
//        for(Integer req: request){
//            if(req >= range[0] && req <= range[1]){
//                count++;
//            }
//        }
//        return count;
    }
}