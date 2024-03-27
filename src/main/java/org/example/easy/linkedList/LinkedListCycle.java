package org.example.easy.linkedList;

//27.03.2024
//LINK:https://leetcode.com/explore/featured/card/top-interview-questions-easy/93/linked-list/773/
//FLOYD'S TORTOISE AND HARE ALGORITHM IS A POINTER ALGORITHM USED TO DETECT CYCLES IN A LINKED LIST OR FIND THE START OF THE CYCLE.

public class LinkedListCycle {
    public boolean linkedListCycle(ListNode head){
        if (head == null || head.next ==null){
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while(slow != fast){
            if (fast == null || fast.next == null){
                return false;
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }
}
