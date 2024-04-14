package org.example.easy.sortingAndSearching;

import java.util.Random;

//14.04.2024
//LINK: https://leetcode.com/explore/interview/card/top-interview-questions-easy/96/sorting-and-searching/774/
//OUR APPROACH IS LIKE BINARY SEARCH ALGORITHM THAT DIVIDE THE ARRAY ITERATIVELY UNTIL FINDING THE CORRECT NUMBER THAT WE NEED
//TIME COMPLEXITY: O(log n)
//SPACE COMPLEXITY: O(1)

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while(left < right){
            int middle = left + (right - left) / 2;

            if(isBadVersion(middle)){
                right = middle;
            }
            else{
                left = middle + 1;
            }
        }

        return left;
    }

    private boolean isBadVersion(int middle) {
        Random random = new Random();
        return random.nextBoolean();
    }
}
