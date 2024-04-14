package org.example.easy.sortingAndSearching;
//14.04.2024
//LINK: https://leetcode.com/explore/interview/card/top-interview-questions-easy/96/sorting-and-searching/587/

//WE CAN NOT SOLVE THIS PROBLEM BY RECREATING NUMS1 AS INCREASING ORDER ISTEAD WE CAN DO IT BY DECRESING ORDER FROM STARTING IT IS LAST INDEX
//TIME COMPLEXITY: O(n)
//SPACE COMPLEXITY: O(n)

class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=nums1.length-1;
        m--;
        n--;

        while(k>=0){

            if(m >= 0 && n>= 0 && nums1[m] <= nums2[n]){
                nums1[k--] = nums2[n--];
            }
            else if(m>=0){
                nums1[k--] = nums1[m--];
            }
            else{
                nums1[k--] = nums2[n--];
            }
        }
    }
}