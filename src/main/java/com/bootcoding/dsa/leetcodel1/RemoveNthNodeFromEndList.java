package com.bootcoding.dsa.leetcodel1;
/* Leetcode Q-19 WAP to Remove Nth Node From End of List
Given the head of a linked list, remove the nth node from
the end of the list and return its head.
 */
public class RemoveNthNodeFromEndList {
    public static void main(String[] args) {
        //creating object nodes and assigning value node1 as head
        ListNode node1 = new ListNode(16);
        ListNode node2 = new ListNode(19);
        ListNode node3 = new ListNode(17);
        ListNode node4 = new ListNode(11);
        ListNode node5 = new ListNode(2);
        ListNode node6 = new ListNode(27);
        ListNode node7 = new ListNode(7);
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

        RemoveNthFromEndSolution removeNthFromEndSolution = new RemoveNthFromEndSolution();
        ListNode newHead = removeNthFromEndSolution.removeNthFromEnd(node1, 2);
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

//class containing the logic to remove Nth node from the end of the linked list
class RemoveNthFromEndSolution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null){
            head = null;
            return head;
        }
        int count = 0;
        ListNode current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        int fromStart = count-n;
        if(fromStart == 0){
            head = head.next;
            return head;
        }
        current = head;
        count = 1;
        while (count <= fromStart && current.next != null) {
            if (count == fromStart) {
                current.next = current.next.next;
            }
            count++;
            current = current.next;
        }
        return head;
    }
}