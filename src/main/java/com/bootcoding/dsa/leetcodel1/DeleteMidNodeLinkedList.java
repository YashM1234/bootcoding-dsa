package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-2095 WAP to delete the middle node of a linked list
public class DeleteMidNodeLinkedList {
    public static void main(String[] args) {
        //creating object nodes and assigning value node1 as head
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(7);
        ListNode node6 = new ListNode(1);
        ListNode node7 = new ListNode(9);
        ListNode node8 = new ListNode(3);
        ListNode node9 = new ListNode(8);

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

        DeleteMiddleSolution deleteMiddleSolution = new DeleteMiddleSolution();
        ListNode newHead = deleteMiddleSolution.deleteMiddle(node1);
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

//Class containing all logic to delete node from middle
class DeleteMiddleSolution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return null;
        }
        //creating two pointer left1 moves by 1 and right2 moves by 2
        ListNode left1 = head;
        ListNode right2 = head.next.next;
        //loop to find the element we have to remove
        while(right2 != null && right2.next != null){
            left1 = left1.next;
            right2 = right2.next.next;
        }
        //when right2 reaches to last node, we remove node after left1 and return head
        left1.next = left1.next.next;
        return head;
    }

    //OR

//    public ListNode deleteMiddle(ListNode head) {
//        if(head == null || head.next == null){
//            return null;
//        }
//        int count = 0;
//        ListNode current = head;
//        while(current != null){
//            count++;
//            current = current.next;
//        }
//        int mid = count/2;
//        current = head;
//        for(int i = 0; i < mid-1; i++){
//            if(current.next != null){
//                current = current.next;
//            }
//        }
//        current.next = current.next.next;
//        return head;
//    }
}