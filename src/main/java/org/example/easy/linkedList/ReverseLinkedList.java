package org.example.easy.linkedList;

import java.util.List;

//25.03.2024
//LINK: https://leetcode.com/explore/featured/card/top-interview-questions-easy/93/linked-list/560/
//THE IDEA IS BY USING THREE POINTERS WE TAKE THREE NODES STEP BY STEP AND MAKE THEM REVERSED. AT THE END WE CAN SEE THAT WHOLE NODES WILL BE RESERVED.
//TIME COMPLEXITY: O(n)
//SPACE COMPLEXITY: O(1)
public class ReverseLinkedList {
    public ListNode reverseLinkedList(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        ListNode nextNode = null;

        while(current != null){
            nextNode = current.next;

            current.next = prev;

            prev = current;
            current = nextNode;


            System.out.println("prev: " + prev.val);
            System.out.println("current: " + current.val);
            System.out.println("nextNode: " + nextNode.val);
            System.out.println("-----------------------------");
        }

        return prev;
    }
}
