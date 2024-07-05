package com.bootcoding.dsa.leetcodel1;
/* Leetcode Q-24 WAP to swap nodes in pairs
Given a linked list, swap every two adjacent nodes and return its head.
You must solve the problem without modifying the values in the list's nodes
(i.e., only nodes themselves may be changed.)
 */
public class SwapNodesInPairs {
    public static void main(String[] args) {
        //creating object nodes and assigning value node1 as head
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
//        ListNode node5 = new ListNode(5);
//        ListNode node6 = new ListNode(6);
//        ListNode node7 = new ListNode(7);
//        ListNode node8 = new ListNode(8);
//        ListNode node9 = new ListNode(9);

        //connecting nodes
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;// node5;
//        node5.next = node6;
//        node6.next = node7;
//        node7.next = node8;
//        node8.next = node9;
//        node9.next = null;

        SwapPairsSolution swapPairsSolution = new SwapPairsSolution();
        ListNode newHead = swapPairsSolution.swapPairs(node1);
        display(newHead);
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

//Class containing all logic to swap nodes in pairs
class SwapPairsSolution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = new ListNode();
        newHead.next = head;
        ListNode current;
        current = newHead;

        while(head != null && head.next != null){
            current.next = head.next;
            head.next = head.next.next;
            current.next.next = head;
            current = current.next.next;
            head = head.next;
        }
        return newHead.next;
    }
}
