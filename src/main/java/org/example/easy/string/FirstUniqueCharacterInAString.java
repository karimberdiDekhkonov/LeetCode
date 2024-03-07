package org.example.easy.string;

//07.03.2024
//LINK: https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/881/

public class FirstUniqueCharacterInAString {
    public int firstUniqueChar(String s) {
        //CLASSICAL SOLUTION BY SAVING CHARACTERS IN A HASHMAP.
        //TIME COMPLEXITY: O(n)
        //SPACE COMPLEXITY: O(n)

//         Map<Character, Integer> map = new LinkedHashMap<>();

//         for(int i = 0; i < s.length(); i++){
//             char c = s.charAt(i);
//             if (!map.containsKey(c)) {
//                 map.put(c, i); // If the character is not present, store its index.
//             } else {
//                 map.put(c, -1); // If the character is already present, set its index to -1.
//             }
//         }

//         for(Integer value : map.values()){
//             if(value != -1) return value;
//         }

//         return -1;

        //ITERATING ALL LOWERCASE ALPHABET CHARACTERS FROM A TO Z AND MAKING SURE IS THAT CHARACTER INCLUDED IN THE INPUT STRING IF SO WITH THE LAST_INDEX_OF METHOD WE CAN CLARIFY AS IT IS UNIQUE OR NOT
        //TIME COMPLEXITY: O(n)
        //SPACE COMPLEXITY: O(1)

        int result = Integer.MAX_VALUE;

        for (char c = 'a'; c <= 'z'; c++) {

            int index = s.indexOf(c);

            if (index != -1 && index == s.lastIndexOf(c)) {
                result = Math.min(result, index);
            }
        }

        return result == Integer.MAX_VALUE ? -1 : result;
    }
}
