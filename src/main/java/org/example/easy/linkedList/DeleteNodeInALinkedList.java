package org.example.easy.linkedList;

//19.03.2024
//LINK: https://leetcode.com/explore/featured/card/top-interview-questions-easy/93/linked-list/553/

public class DeleteNodeInALinkedList {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
