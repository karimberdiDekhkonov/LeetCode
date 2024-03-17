package org.example.easy.string;

//17.03.2024
//LINK: https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/887/
//THIS CODE IDENTIFIES THE LONGEST COMMON PREFIX AMONG STRINGS BY ITERATIVELY COMPARING AND SHORTENING THE PREFIX UNTIL FOUND.
//TIME COMPLEXITY: O(n)
//SPACE COMPLEXITY: O(1)
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String res = strs[0];

        for(int i = 0; i<strs.length; i++){
            if(!strs[i].startsWith(res)){
                res = res.substring(0,res.length()-1);
                i--;
            }
            if(res.length()==0) return "";
        }

        return res;
    }
}
