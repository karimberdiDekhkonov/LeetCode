package org.example.easy.dynamicProgramming;

//WE SOLVE IT WITH KADANE'S ALGORITHM KNOWN AS DYNAMIC PROGRAMING APPROACH. INITIALIZING TWO VARIABLES AND ITERATIVELY SETTING VALUES TO THEM

public class MaximumSubarray {

    public int maxSubArray(int[] nums) {

        int tempMax = nums[0];
        int max = nums[0];

        for(int i = 1; i < nums.length; i++){
            tempMax = Math.max(nums[i], tempMax + nums[i]);
            max = Math.max(tempMax, max);
        }
        return max;
    }
}