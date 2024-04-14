package org.example.easy.dynamicProgramming;

//14.04.2024
//LINK: https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/dynamic-programming/572/
//OUR APPROACH IS BASED FIBONACCI SEQUENCE THAT WE ITERATIVELY FILL UP ARRAY WITH POSSIBLE NUMBER OF WAYS BASED ON IT'S INDEX NUMBER
//TIME COMPLEXITY: O(n)
//SPACE COMPLEXITY: O(n)

public class ClimbingStairs {
    public int climbStairs(int n){
        if (n <= 1){
            return 1;
        }

        int[] arr = new int[n+1];

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[n-1] + arr[n-2];
        }

        return arr[n];
    }
}
