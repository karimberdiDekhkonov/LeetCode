package org.example.easy.array;

//24.02.2024
//TO SOLVE THIS PROBLEM WE CAN USE A SIMPLE APPROACH LIKE FOR IN THE FOR BUT IT TAKES MORE TIME. TO OPTIMIZE IT WE CAN MINIMIZE K AS K %= LENGTH. IT HELPS US TO REDUCE EXTRA UNIMPORTANT CYCLES. THEN AT THE SAME TIME INSTEAD OF CHANGING A SINGLE INTEGER WE CAN REPLACE IT WITH OTHER INTEGER THAT HELPS TO WORK OUR METHOD TWO TIMES FASTER.
//TIME COMPLEXITY: O(1)
//SPACE COMPLEXITY: O(n)
//LINK: https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/646/

public class RotateAnArray {
    public void rotate(int[] nums, int k){
        int length = nums.length;
        k%=length;

        showAnArray(nums);
        System.out.println();

        service(nums, 0, length-1);

        showAnArray(nums);
        System.out.println();

        service(nums, 0, k-1);

        showAnArray(nums);
        System.out.println();

        service(nums, k, length-1);

        showAnArray(nums);
    }
    public void service(int[] nums, int start, int end){
        if (start >= end) return;

        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;

        service(nums, start+1, end-1);
    }
    public void showAnArray(int[] nums){
        for(int num : nums){
            System.out.print(num + ", ");
        }
    }
}
