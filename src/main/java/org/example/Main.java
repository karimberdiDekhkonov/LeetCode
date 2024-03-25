package org.example;

import org.example.easy.linkedList.ListNode;
import org.example.easy.linkedList.RemoveNthNodeFromEndOfTheList;
import org.example.easy.linkedList.ReverseLinkedList;

public class Main {
    public static void main(String[] args) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode fifth = new ListNode(5, null);
        ListNode fourth = new ListNode(4, fifth);
        ListNode third = new ListNode(3, fourth);
        ListNode second = new ListNode(2, third);
        ListNode first = new ListNode(1, second);


        ListNode listNode = reverseLinkedList.reverseLinkedList(first);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
