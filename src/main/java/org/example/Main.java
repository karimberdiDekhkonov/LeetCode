package org.example;

import org.example.easy.linkedList.ListNode;
import org.example.easy.linkedList.RemoveNthNodeFromEndOfTheList;
import org.example.easy.linkedList.ReverseLinkedList;
import org.example.test.A;
import org.example.test.B;
import org.example.test.MedianOfTwoSortedArrays;
import org.example.test.SlidingPuzzle;

public class Main {
    public static void main(String[] args) {

        MedianOfTwoSortedArrays solution = new MedianOfTwoSortedArrays();

        // Example inputs for debugging
        int[] nums1 = {1, 2};
        int[] nums2 = {3};

        double median = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println("Median: " + median);

//        SlidingPuzzle solution = new SlidingPuzzle();
//
//        // Example board configurations
//        int[][] board1 = {
//                {1, 2, 3},
//                {4, 0, 5}
//        };
//
//        int[][] board2 = {
//                {1, 2, 3},
//                {5, 4, 0}
//        };
//
//        // Test the solution with the first board
//        int result1 = solution.slidingPuzzle(board1);
//        System.out.println("Minimum moves for board1: " + result1); // Expected output: Minimum moves for board1: 0
//
//        // Test the solution with the second board
//        int result2 = solution.slidingPuzzle(board2);
//        System.out.println("Minimum moves for board2: " + result2); // Expected output: Minimum moves for board2: -1 (If unsolvable)

//        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
//        ListNode fifth = new ListNode(5, null);
//        ListNode fourth = new ListNode(4, fifth);
//        ListNode third = new ListNode(3, fourth);
//        ListNode second = new ListNode(2, third);
//        ListNode first = new ListNode(1, second);
//
//
//        ListNode listNode = reverseLinkedList.reverseLinkedList(first);
//        while (listNode != null) {
//            System.out.println(listNode.val);
//            listNode = listNode.next;
//        }
    }
}
