package org.example.easy.array;


//28.02.2024
//BY USING TWO POINTERS WE SOLVE THE PROBLEM WITH 100% EFFICIENTLY ON LEETCODE PLATFORM.
//TIME COMPLEXITY: O(n).
//SPACE COMPLEXITY: O(1).

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;

        for(int num : nums) if(num!=0) nums[nonZeroIndex++] = num;

        while(nonZeroIndex < nums.length) nums[nonZeroIndex++]=0;
    }
}
