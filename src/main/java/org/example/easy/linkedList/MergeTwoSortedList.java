package org.example.easy.linkedList;

import java.util.List;
//25.03.2024
//LINK: https://leetcode.com/explore/featured/card/top-interview-questions-easy/93/linked-list/771/

public class MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode node = new ListNode();
        ListNode res = node;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                node.next = list1;
                list1 = list1.next;
            }else{
                node.next = list2;
                list2 = list2.next;
            }

            node = node.next;
        }

        if (list1 != null) {
            node.next = list1;
        } else {
            node.next = list2;
        }

        return res.next;
    }
}
