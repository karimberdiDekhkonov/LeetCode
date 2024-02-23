package org.example.easy;

//WE CAN THINK OF USING TEO POINTERS I AND J. WE COMPARE IN A LOOP NUMS[I] AND NUMS[I-1] EVERY TIME WHEN THEY ARE DIFFERENT WE INCREASE J AND SET THAT DIFFERENT NUMBER TO NUMS[J]. AT THE END OF OUR PROGRAM WE RETURN J.
//LINK - https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/discuss/3496619/Simplest-4-line-sol.-with-proper-explanation

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
