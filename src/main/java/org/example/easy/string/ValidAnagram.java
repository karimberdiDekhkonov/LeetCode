package org.example.easy.string;

import java.lang.reflect.Array;
import java.util.Arrays;

//07.03.2024
//LINK: https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/882/
//CONVERTING THEM TO THE ARRAY, SORTING AND COMPARING.
//TIME COMPLEXITY: O(n)
//SPACE COMPLEXITY: O(n)

public class ValidAnagram {
    public boolean ValidAnagram(String s, String t){
        if(s.length() != t.length()) return false;

        char[] first = s.toCharArray();
        char[] second = t.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        return Arrays.equals(first, second);
    }
}
