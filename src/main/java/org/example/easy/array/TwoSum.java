package org.example.easy.array;
import java.util.*;

//29.02.2024
//LINK: https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/546/

public class TwoSum {
    public int[] twoSum(int[] nums, int target){

//APPROACH ONE
        //ITERATING AND CHECKING EVERY POSSIBLE COMBINATIONS BY INNER LOOP
        //TIME COMPLEXITY: O(n^2)
        //SPACE COMPLEXITY: O(1)

//         for(int i=0; i<nums.length-1; i++){
//             for(int j=i+1; j<nums.length; j++){
//                 if((nums[i]+nums[j])==target)return new int[]{i,j};
//             }

//         }


//         return null;

//APPROACH TWO
        //OPTIMIZING FIRST APPROACH BY USING MAP INSTEAD OF INNER LOOP
        //TIME COMPLEXITY: O(n)
        //SPACE COMPLEXITY: O(n)

        Map<Integer, Integer> map = new LinkedHashMap<>();

        for(int i=0; i<nums.length; i++){

            if (map.containsKey(target-nums[i])){
                return new int[]{i, map.get(target-nums[i])};
            }
            else {
                map.put(target-nums[i],i);
            }
        }

        return null;
    }
}
