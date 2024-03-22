package org.example.easy.linkedList;

//22.03.2024
//LINK: https://leetcode.com/explore/featured/card/top-interview-questions-easy/93/linked-list/603/
//FINDING THE LENGTH THEN BASED ON IT FIND THE NODE THAT WE NEED TO DELETE THEN DELETE IT.
//TIME COMPLEXITY: O(n)
//SPACE COMPLEXITY: O(1)

public class RemoveNthNodeFromEndOfTheList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;

        // Move the first pointer ahead by n+1 steps
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        // Move both pointers simultaneously until the first pointer reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Remove the nth node from the end
        second.next = second.next.next;

        return dummy.next;

//        if (head.next==null) return null;
//        int size = 0;
//        ListNode temp = head;
//
//        while(temp != null){
//            size++;
//            temp = temp.next;
//        }
//
//        size -= n;
//        temp = head;
//
//        if(size == 0) return head.next;
//
//        for(int i = size; i > 1; i--){
//            temp = temp.next;
//        }
//
//        if(temp.next.next != null){
//            temp.next = temp.next.next;
//        }
//        else{
//            temp.next = null;
//        }
//
//        return head;
    }
}
