package org.example.easy.string;

//17.03.2024
//LINK: https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/885/
//WE HAVE TWO APPROACHES HERE. FIRST IS CLASSICAL SOLUTION BY ITERATING AND MATCHING EACH CHARACTER AND SECOND ONE MAKES IT EASY WITH SUBSTRING.
//FIRST APPROACH:
//TIME COMPLEXITY: O(n^2)
//SPACE COMPLEXITY: O(1)
//SECOND APPROACH:
//TIME COMPLEXITY: O(n)
//SPACE COMPLEXITY: O(1)

public class ImplementStrStr {
    public int strStr(String haystack, String needle) {

//         for (int i = 0; i <= haystack.length() - needle.length(); i++) {
//             int balance = needle.length();
//             for (int j = 0; j < needle.length(); j++) {
//                 if (haystack.charAt(i + j) == needle.charAt(j)) {
//                     balance--;
//                 } else {
//                     break; // Break if there's a mismatch
//                 }
//             }
//             if (balance == 0) {
//                 return i; // All characters of needle matched
//             }
//         }
//         return -1;

        for(int i = 0, j = needle.length(); j <= haystack.length(); i++, j++){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
        }

        return -1;
    }
}
