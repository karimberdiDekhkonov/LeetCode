package org.example;

import org.example.easy.linkedList.ListNode;
import org.example.easy.linkedList.RemoveNthNodeFromEndOfTheList;

public class Main {
    public static void main(String[] args) {
        RemoveNthNodeFromEndOfTheList removeNthNodeFromEndOfTheList = new RemoveNthNodeFromEndOfTheList();
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2, first);
        ListNode third = new ListNode(3, second);
        ListNode fourth = new ListNode(4, third);
        ListNode fifth = new ListNode(5, fourth);

        ListNode listNode = removeNthNodeFromEndOfTheList.removeNthFromEnd(fifth, 2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
