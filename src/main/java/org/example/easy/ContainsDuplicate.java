package org.example.easy;

import java.util.HashSet;
import java.util.Set;

//24.02.2024
//IN ORDER TO STORE SEEN NUMBERS WE USE HASHMAP AND ONCE WE TRY TO ADD A NUMBER THAT OUR HASHMAP CONTAINS WE RETURN TRUE. IF THERE IS NO DUPLICATED NUMBERS OUR METHOD RETURNS FALSE AT THE END.
//TIME COMPLEXITY: O(n)
//SPACE COMPLEXITY: O(n) IN THE WORST-CASE SCENARIO, O(1) IN THE BEST-CASE SCENARIO.
//LINK: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) if (!set.add(num)) return true;
        return false;
    }
}
