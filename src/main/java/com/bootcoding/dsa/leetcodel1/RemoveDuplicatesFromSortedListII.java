package com.bootcoding.dsa.leetcodel1;
//Leetcode Q-82 WAP to remove duplicates from sorted list II
public class RemoveDuplicatesFromSortedListII {
    public static void main(String[] args) {
        //creating object nodes and assigning value node1 as head
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(2);
        ListNode node6 = new ListNode(2);
        ListNode node7 = new ListNode(2);
        ListNode node8 = new ListNode(3);
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

        DeleteDuplicatesIISolution deleteDuplicatesIISolution = new DeleteDuplicatesIISolution();
        ListNode newHead = deleteDuplicatesIISolution.deleteDuplicates(node1);
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

//class containing the logic to remove all duplicate from the linked list
class DeleteDuplicatesIISolution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = new ListNode();
        newHead.next = head;
        ListNode current = newHead;

        while(current.next != null && current.next.next != null){

            if(current.next.val == current.next.next.val){
                int tempVal = current.next.val;
                while(current.next != null && current.next.val == tempVal){
                    current.next = current.next.next;
                }
            }
            else{
                current = current.next;
            }
        }
        return newHead.next;
    }
}
