package org.example.hard;

public class AddStrings {
    public static String solution(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = a.length()-1;
        int j = b.length()-1;

        while (i >= 0 || j >= 0){

            int digitA = i >= 0 ? a.charAt(i) - '0' : 0;
            int digitB = j >= 0 ? b.charAt(j) - '0' : 0;

            int sum = digitA + digitB;

            result.insert(0, sum);
            i--;
            j--;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String solution = solution("99", "1");
        System.out.println(solution);  // Output should be "110"
    }
}
