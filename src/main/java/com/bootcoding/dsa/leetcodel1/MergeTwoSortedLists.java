package com.bootcoding.dsa.leetcodel1;
/* Leetcode Q-21 WAP to merge two sorted list
You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists into one sorted list. The list should be made by
splicing together the nodes of the first two lists.
Return the head of the merged linked list.
 */
public class MergeTwoSortedLists {
    //Creating Node class to create nodes
    //main() method
    public static void main(String[] args) {
        //creating object nodes and assigning value l1 as head list 1
        ListNode l1 = new ListNode(1);
        ListNode node2l1 = new ListNode(2);
        ListNode node3l1 = new ListNode(5);

        //connecting nodes
        l1.next = node2l1;
        node2l1.next = node3l1;
        node3l1.next = null;

        //creating object nodes and assigning value l2 as head list 2
        ListNode l2 = new ListNode(1);
        ListNode node2l2 = new ListNode(3);
        ListNode node3l2 = new ListNode(4);

        //connecting nodes
        l2.next = node2l2;
        node2l2.next = node3l2;
        node3l2.next = null;

        MergeTwoListsSolution mergeTwoListsSolution = new MergeTwoListsSolution();
        ListNode mergedList = mergeTwoListsSolution.mergeTwoLists(l1, l2);
        //Display result
        display(mergedList);
    }
    //Method to print linked list element
    public static void display(ListNode mergedList) {
        ListNode current = mergedList;
        //Traverse linked list and print its element
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }
}
//Class representing single node in linked list
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}

//class containing logic to merge two sorted list
class MergeTwoListsSolution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null){
            return null;
        }
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }

        ListNode newHead = new ListNode();
        ListNode current = newHead;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                current.next = list1;
                list1 = list1.next;
            }
            else{
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        current.next = list1 != null ? list1: list2;
        return newHead.next;
    }

    //OR

//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        if(list1 == null && list2 == null){
//            return null;
//        }
//        if(list1 == null){
//            return list2;
//        }
//        if(list2 == null){
//            return list1;
//        }
//
//        if(list1.val <= list2.val){
//            list1.next = mergeTwoLists(list1.next, list2);
//            return list1;
//        }
//        else{
//            list2.next = mergeTwoLists(list1, list2.next);
//            return list2;
//        }
//    }
}