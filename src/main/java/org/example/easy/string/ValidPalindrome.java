package org.example.easy.string;

//13.03.2024
//LINK: https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/883/
public class ValidPalindrome {
    public boolean isValidPalindrome(String s){
        //WE CREATE A NEW CLEANED STRING WITH REGAX, REVERSE IT AND COMPARE WITH CLEANED STRING.
        //TIME COMPLEXITY: O(n)
        //SPACE COMPLEXITY: O(1)
//        String cleanedS = s.replaceAll("a-zA-Z0-9","").toLowerCase();
//
//        return cleanedS.equals(new StringBuilder(cleanedS).reverse().toString());

        //APPROACH WITH TWO POINTERS
        //TIME COMPLEXITY: O(n)
        //SPACE COMPLEXITY: O(1)
        if (s.isEmpty()) {
            return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);
            if (!Character.isLetterOrDigit(currFirst )) {
                start++;
            } else if(!Character.isLetterOrDigit(currLast)) {
                last--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }
}
