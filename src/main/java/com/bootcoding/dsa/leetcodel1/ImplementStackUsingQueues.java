package com.bootcoding.dsa.leetcodel1;
import java.util.LinkedList;
import java.util.Queue;
//Leetcode Q-225 WAP to implement Stack using queues (two queues)
public class ImplementStackUsingQueues {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        int x = myStack.top(); // return 2
        int y = myStack.pop(); // return 2
        boolean bool = myStack.empty(); // return False
        System.out.println(x + " " + y + " " + bool);
    }
}
//Stack Class
class MyStack {
    private final Queue<Integer> q1;
    private final Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q2.add(x);
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }

    }

    public int pop() {
        return q1.remove();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}
