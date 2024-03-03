package org.example.easy.array;

import java.util.*;

//28.02.2024
//LINK: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/559/
public class PlusOne {
    public int[] plusOne(int[] nums) {
//APPROACH ONE
        //ITERATING ELEMENTS AND ADDING THEM TO THE STACK AS WE ADD NUMBERS BY PAPER AND HAND IN REAL LIFE;
        //TIME COMPLEXITY O(n)
        //SPACE COMPLEXITY O(n)
//        Stack<Integer> stack = new Stack<>();
//        boolean add = true;
//
//        for(int i=nums.length-1; i >= 0; i--){
//            if((nums[i]+1) == 10 && add) stack.push(0);
//            else if((nums[i]+1) < 10 && add){
//                stack.push(nums[i]+1);
//                add=false;
//            }
//            else stack.push(nums[i]);
//        }
//        if (add) stack.push(1);
//
//        int[] res = new int[stack.size()];
//        for(int j = 0; j<res.length; j++) res[j] = stack.pop();
//
//        return res;

//APPROACH TWO
        //ITERATING ONLY IMPORTANT PART WITHOUT ANY EXTRA SPACE IN THE BEST CASE;
        //TIME COMPLEXITY O(n)
        //SPACE COMPLEXITY O(1)

        int n = nums.length;
        for (int i = n - 1; i >= 0; --i) {
            ++nums[i];
            nums[i] %= 10;
            if (nums[i] != 0) {
                return nums;
            }
        }
        nums = new int[n + 1];
        nums[0] = 1;
        return nums;
    }
}