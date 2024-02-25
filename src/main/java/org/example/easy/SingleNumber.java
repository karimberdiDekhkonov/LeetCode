package org.example.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//25.02.2024

public class SingleNumber {
    public int singleNumber(int[] nums){

        //APPROACH 1: WE USE SET TO ADD ELEMENT IF SET DOES NOT CONTAIN IF IT CONTAINS REMOVE IT. AT THE END ONLY THAT SINGLE ELEMENT WILL BE STORED IN OUR SET.
        //SPACE COMPLEXITY: O(n)
        //TIME COMPLEXITY: O(n)
//        Set<Integer> set = new HashSet<>();
//
//        for (int num : nums) {
//            if (set.contains(num)) {
//                set.remove(num);
//            } else {
//                set.add(num);
//            }
//        }
//
//        // At this point, the set should contain only the single number.
//        // Assuming there is always exactly one single number.
//        return set.iterator().next();



        //APPROACH 2: USING BITWISE XOR OPERATION WE CAN XOR NUMBERS BY LOOP IN THIS CASE IF WE XOR TWO SAME NUMBER RESULT IS GOING TO BE 0. SO AT THE END WE WILL HAVE THAT SINGLE NUMBER IN OUR RESULT INTEGER.
        //SPACE COMPLEXITY: O(1)
        //TIME COMPLEXITY: O(n)

        int result = 0;

        for(int  num: nums) result ^= num;

        return result;
    }
}
