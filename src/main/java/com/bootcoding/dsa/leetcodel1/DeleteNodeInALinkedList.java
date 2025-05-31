package com.bootcoding.dsa.leetcodel1;


/* Leetcode Q-203 WAP to Delete Node in a linked list
There is a singly-linked list head and we want to delete a node node in it.
You are given the node to be deleted node. You will not be given access to the first node of head.
All the values of the linked list are unique, and it is guaranteed that the given node node is not
the last node in the linked list.
Delete the given node. Note that by deleting the node, we do not mean removing it from memory. We mean:
The value of the given node should not exist in the linked list.
The number of nodes in the linked list should decrease by one.
All the values before node should be in the same order.
All the values after node should be in the same order.
Custom testing:
For the input, you should provide the entire linked list head and the node to be given node. node should
not be the last node of the list and should be an actual node in the list.
We will build the linked list and pass the node to your function.
The output will be the entire list after calling your function.
 */
public class DeleteNodeInALinkedList {
    public static void main(String[] args) {
        DeleteNodeInALinkedList list = new DeleteNodeInALinkedList();

        int[] values = {4, 5, 1, 9};
        ListNode head = list.createList(values);

        System.out.println("Original List: ");
        list.printList(head);

        ListNode nodeToDelete = list.findNode(head, 5);
        if(nodeToDelete != null && nodeToDelete.next != null){
            list.deleteNode(nodeToDelete);
        }

        System.out.println("After Delete: ");
        list.printList(head);
    }

    //Method to create linked list from an array
    public ListNode createList(int[] values){
        if(values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for(int i = 1; i < values.length; i++){
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    //Method to find a node with a specific value
    public ListNode findNode(ListNode head, int target){
        ListNode current = head;
        while(current != null && current.val != target){
            current = current.next;
        }
        return current;
    }

    //Method to print linked list element
    public void printList(ListNode newHead) {
        ListNode current = newHead;
        //Traverse linked list and print its element
        while (current != null) {
            System.out.print(current.val);
            if(current.next!= null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }

    //Method to delete a node
    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            throw new IllegalArgumentException("Cannot delete the last node or null node.");
        }
        node.val = node.next.val;
        node.next = node.next.next;
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
