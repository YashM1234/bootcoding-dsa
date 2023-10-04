package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-876 WAP to return the middle element of linked list
public class MiddleOfLinkedList {
    public static void main(String[] args) {
        //creating object nodes and assigning value node1 as head
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(5);
        ListNode node4 = new ListNode(7);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(9);
        ListNode node7 = new ListNode(11);
        ListNode node8 = new ListNode(6);
        ListNode node9 = new ListNode(4);

        //connecting nodes
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = null;

        MiddleNodeSolution middleNodeSolution = new MiddleNodeSolution();
        ListNode fromMiddle = middleNodeSolution.middleNode(node1);
        display(fromMiddle);
    }
    //Method to print linked list element
    public static void display(ListNode newHead) {
        ListNode current = newHead;
        //Traverse linked list and print its element
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }
}

//Node class
//class ListNode {
//      int val;
//      ListNode next;
//      ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }

//class containing logic to get list from middle of the linked list
class MiddleNodeSolution {
    public ListNode middleNode(ListNode head) {

        ListNode left1 = head;
        ListNode right2 = head;

        while(right2 != null && right2.next != null){
            left1 = left1.next;
            right2 = right2.next.next;
        }
        return left1;
    }

    //OR

//    public ListNode middleNode(ListNode head) {
//        int count = 0;
//        ListNode current = head;
//        while(current != null){
//            count++;
//            current = current.next;
//        }
//
//        int mid = count/2;
//
//        current = head;
//        for(int i = 0; i < mid; i++){
//            current = current.next;
//        }
//        return current;
//    }
}