package org.example.easy.string;

//17.03.2024
//LINK: https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/884/
//FIRST WE INCREASE AN INDEX UNTIL THE END OF FREE SPACES THEN WE FIND A SIGN THEN CONVERTING NUMBERS TO THE INTEGER. IF RANGE IS OUT OF MAX OR MIN INTEGER CAPACITY WE WILL RETURN INTEGER MAX OR INTEGER MIN
//TIME COMPLEXITY: O(n)
//SPACE COMPLEXITY: O(1)
public class StringToInteger {
    public int stringToInteger(String s){
        int index = 0;
        int sign = 1;
        int result = 0;

        while (index < s.length() && s.charAt(index)==' '){
            index++;
        }

        if (index < s.length() && (s.charAt(index)=='+' || s.charAt(index)=='-') ){
            sign = s.charAt(index)=='+' ? 1 : -1;
            index++;
        }

        while (index < s.length() && Character.isDigit(s.charAt(index))){
            int digit = s.charAt(index) - '0';

            if (result > Integer.MAX_VALUE / 10 ||
                    (result == Integer.MAX_VALUE / 10 && digit > 7)){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            index++;
        }

        return result * sign;
    }
}
