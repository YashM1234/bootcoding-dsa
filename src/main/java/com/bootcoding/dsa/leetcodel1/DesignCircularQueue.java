package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-622 WAP to design circular queue
public class DesignCircularQueue {
    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
        System.out.println(myCircularQueue.enQueue(1)); // return True
        System.out.println(myCircularQueue.enQueue(2)); // return True
        System.out.println(myCircularQueue.enQueue(3)); // return True
        System.out.println(myCircularQueue.enQueue(4)); // return False
        System.out.println(myCircularQueue.Rear());     // return 3
        System.out.println(myCircularQueue.isFull());   // return True
        System.out.println(myCircularQueue.deQueue());  // return True
        System.out.println(myCircularQueue.enQueue(4)); // return True
        System.out.println(myCircularQueue.Rear());     // return 4
    }
}

class MyCircularQueue {
    int[] queue;
    int front;
    int rear;
    int k;
    public MyCircularQueue(int k) {
        this.k = k;
        queue = new int[k];
        front = -1;
        rear = -1;
    }

    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }else{
            if(front == -1 && rear == -1){
                front = 0;
            }
            rear = (rear + 1) % k;
            queue[rear] = value;
        }
        return true;
    }

    public boolean deQueue() {
        //int temp = 0;
        if(isEmpty()){
            return false;
        }else{
            //temp = queue[front];
            if(front == rear){
                front = rear = -1;
            }else {
                front = (front + 1) % k;
            }
        }
        return true;
    }

    public int Front() {
        return isEmpty() ? -1 : queue[front];
    }

    public int Rear() {
        return isEmpty() ? -1 : queue[rear];
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        if(front == 0 && rear == k-1){
            return true;
        }
        return front == rear + 1;
    }
}