package org.example.easy.dynamicProgramming;
//15.04.2024
//LINK: https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/dynamic-programming/576/
//OUR APPROACH IS DYNAMIC PROGRAMMING: MAXIMIZE ROBBED MONEY BY CHOOSING BETWEEN CURRENT AND PREVIOUS HOUSE'S LOOT AT EACH STEP

//TIME COMPLEXITY: O(n)
//SPACE COMPLEXITY: O(n)

class HouseRobber {
    public int rob(int[] nums) {
        int n = nums.length;

        if(n == 0) return 0;
        if(n == 1) return nums[0];

        int[] arr = new int[n];
        arr[0] = nums[0];
        arr[1] = Math.max(nums[0], nums[1]);

        for(int i = 2; i < n; i++){
            arr[i] = Math.max(arr[i-1], arr[i-2] + nums[i]);
        }

        return arr[n-1];
    }
}
