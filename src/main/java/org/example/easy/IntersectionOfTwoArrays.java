package org.example.easy;

import java.util.*;

//26.02.2024
//FIRST BY ARRAYS WE SORT NUMS1 AND NUMS2. THEN WE USE TWO POINTER TO FIND THE EQUALS VALUES IN BOTH ARRAYS.
//SPACE COMPLEXITY: O(n)
//TIME COMPLEXITY: O(n)
//LINK: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/

public class IntersectionOfTwoArrays {
    public int[] intersectionOfTwoArrays(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int k = 0;

        while(i<nums1.length && k<nums2.length){
            if(nums1[i]>nums2[k]) k++;
            else if(nums1[i]<nums2[k]) i++;
            else {
                list.add(nums1[i]);
                i++;
                k++;
            }
        }

        int[] result = new int[list.size()];
        for(int j = 0; j< list.size(); j++) result[j] = list.get(j);

        return result;
    }
}
