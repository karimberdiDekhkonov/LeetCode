package org.example.easy;
//23.02.2024
//WE CAN THINK OF USING TEO POINTERS I AND J. WE COMPARE IN A LOOP NUMS[I] AND NUMS[I-1] EVERY TIME WHEN THEY ARE DIFFERENT WE INCREASE J AND SET THAT DIFFERENT NUMBER TO NUMS[J]. AT THE END OF OUR PROGRAM WE RETURN J.
//TIME COMPLEXITY: O(n)
//SPACE COMPLEXITY: O(1)
//LINK: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727

public class RemoveDuplicates {
    public int service(int[] nums){
        int j = 1;
        for(int i = 1; i < nums.length; i++){
            if (nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
