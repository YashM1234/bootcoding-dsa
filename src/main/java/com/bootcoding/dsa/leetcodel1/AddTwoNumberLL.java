package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-2 WAP to add two numbers in linked list
public class AddTwoNumberLL {
    //Creating Node class to create nodes
    //main() method
    public static void main(String[] args) {
        //creating object nodes and assigning value l1 as head list 1
        ListNode l1 = new ListNode(2);
        ListNode node2l1 = new ListNode(4);
        ListNode node3l1 = new ListNode(3);

        //connecting nodes
        l1.next = node2l1;
        node2l1.next = node3l1;
        node3l1.next = null;

        //creating object nodes and assigning value l2 as head list 2
        ListNode l2 = new ListNode(5);
        ListNode node2l2 = new ListNode(6);
        ListNode node3l2 = new ListNode(4);

        //connecting nodes
        l2.next = node2l2;
        node2l2.next = node3l2;
        node3l2.next = null;

        AddTwoNumberLLSolution addTwoNumberLLSolution = new AddTwoNumberLLSolution();
        ListNode sum = addTwoNumberLLSolution.addTwoNumbers(l1, l2);
        //Display result
        while (sum != null){
            System.out.println(sum.val);
            sum = sum.next;
        }
    }
}
//Class representing single node in linked list
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

//Class containing logic to add two linked list numbers
class AddTwoNumberLLSolution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode current = head;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int val1 = (l1 != null)? l1.val : 0;
            int val2 = (l2 != null)? l2.val : 0;
            int sum = val1 + val2 + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        return head.next;
    }
}
