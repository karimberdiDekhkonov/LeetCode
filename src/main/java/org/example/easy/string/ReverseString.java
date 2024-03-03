package org.example.easy.string;

//03.03.2024
//REVERSING CHARACTERS BY FOE LOOP
//TIME COMPLEXITY: O(n)
//SPACE COMPLEXITY: O(1)
//LINK: https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/879/

public class ReverseString {
    public void reverse(char[] s){
        int n = s.length-1;
        for(int i = 0; i < s.length/2; i++){
            char temp = s[i];
            s[i] = s[n-i];
            s[n-i] = temp;
        }
    }
}
