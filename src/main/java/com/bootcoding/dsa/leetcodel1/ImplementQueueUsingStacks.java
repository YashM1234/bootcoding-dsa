package com.bootcoding.dsa.leetcodel1;
import java.util.Stack;
//Leetcode Q-232 WAP to implement queue using stacks (two stack)
public class ImplementQueueUsingStacks {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        int x = myQueue.peek(); // return 1
        int y = myQueue.pop(); // return 1, queue is [2]
        boolean bool = myQueue.empty(); // return false
        System.out.println(x + " " + y + " " + bool);
    }
}

class MyQueue {
    private final Stack<Integer> s1;
    private final Stack<Integer> s2;

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        while(!s1.isEmpty()){
            s2.push(s1.pop());

        }

        s1.push(x);

        while(!s2.isEmpty()){
            s1.push(s2.pop());

        }
    }

    public int pop() {
        return s1.pop();
    }

    public int peek() {
        return s1.peek();
    }

    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}