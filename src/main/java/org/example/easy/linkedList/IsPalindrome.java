package org.example.easy.linkedList;

import java.util.List;
//27.03.2024
//LINK: https://leetcode.com/explore/featured/card/top-interview-questions-easy/93/linked-list/772/
//APPROACH ONE: REVERSING SECOND HALF AND COMPARE IT WITH FIRST HALF
//APPROACH TWO: TAKE IT INTO AN ARRAY AND FIND A LENGTH. THEN COMPARE IT WITH FIRST HALF

public class IsPalindrome {
    public boolean isPalindrome(ListNode head){
        if(head==null || head.next==null) return true;

        ListNode fast = head;
        ListNode slow = head;

        while (fast.next != null && fast.next.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode firstHalf = head;
        ListNode secondHalf = reverse(slow);

        while (secondHalf != null && firstHalf != null){
            if(firstHalf.val != secondHalf.val) return false;
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    private ListNode reverse(ListNode head){
        ListNode next = null;
        ListNode cur = head;
        ListNode prev = null;

        while (cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }
}

///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode() {}
// *     ListNode(int val) { this.val = val; }
// *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// * }
// */
//public class Solution {
//    private static final int[] array = new int[100_000];
//    public boolean isPalindrome(ListNode head) {
//        if(head == null || head.next == null){
//            return true;
//        }
//
//        ListNode curr = head;
//        final int[] arr = array;
//        int size = 0;
//
//        while(curr != null){
//            arr[size++] = curr.val;
//            curr = curr.next;
//        }
//
//        int mid = size/2;
//
//        for(int i = 0; i < mid; i++){
//            if(arr[i] != arr[--size]){
//                return false;
//            }
//        }
//
//        return true;
//    }
//}
//
//
