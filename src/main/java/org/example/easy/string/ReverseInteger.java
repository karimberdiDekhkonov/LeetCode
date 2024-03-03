package org.example.easy.string;

//03.03.2024
//USING LONG TO HANDLE BIG NUMBERS, REVERSING THEM IN WHILE LOOP AND CHECKING DIGITS.
//TIME COMPLEXITY: O(n)
//SPACE COMPLEXITY: O(1)
//LINK: https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/880/

public class ReverseInteger {
    public int reserveInt(int x){
        long reserved = 0;

        while (x != 0){
            int digit = x % 10;
            reserved = reserved * 10 +digit;
            x /=10;
        }

        if (reserved > Integer.MAX_VALUE || reserved < Integer.MIN_VALUE) return 0;

        return (int) reserved;
    }
}
