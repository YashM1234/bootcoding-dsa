package com.bootcoding.dsa.leetcodel1;
/* Leetcode Q-203 WAP to remove linked list element
Given the head of a linked list and an integer val, remove all
the nodes of the linked list that has Node.val == val, and return the new head.
 */
public class RemoveLinkedListElements {
    public static void main(String[] args) {
        //creating object nodes and assigning value node1 as head
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(88);
        ListNode node9 = new ListNode(9);

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

        RemoveElementsSolution removeElementsSolution = new RemoveElementsSolution();
        ListNode newHead = removeElementsSolution.removeElements(node1, 88);
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

//class containing the logic to remove linked list element
class RemoveElementsSolution {
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val){
            head = head.next;
        }

        ListNode current = head;
        while(current != null && current.next != null){
            if(current.next.val != val){
                current = current.next;
            }else{
                current.next = current.next.next;
            }
        }
        return head;
    }
}