package org.example.easy.dynamicProgramming;

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
