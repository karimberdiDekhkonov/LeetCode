package org.example.easy;

import java.util.HashSet;
import java.util.Set;

//01.03.2024
//LINK: https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/769/
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        //APPROACH ONE: SORTING NUMBERS BASED ON THEIR LOCATIONS(INDEXES) AND CHECKING ARE THERE ANY SIMILAR NUMBERS SET.
        //TIME-COMPLEXITY: O(n^2)
        //SPACE-COMPLEXITY: O(1)
//         Set<String> seen = new HashSet<>();

//         for (int i = 0; i < 9; i++) {
//             for (int j = 0; j < 9; j++) {
//                 char currentVal = board[i][j];
//                 if (currentVal != '.') {
//                     if (!seen.add(currentVal + " found in columns " + i) ||
//                         !seen.add(currentVal + " found in rows " + j) ||
//                         !seen.add(currentVal + " found in subgrid " + i / 3 + "-" + j / 3)) {
//                         return false;
//                     }
//                 }
//             }
//         }

//         return true;

        //APPROACH TWO: OPTIMIZING FIRST APPROACH BY CHANGING SET TO TWO-DIMENSIONAL ARRAY.
        //TIME-COMPLEXITY: O(n^2)
        //SPACE-COMPLEXITY: O(n)

        int[][] rows = new int[9][9];
        int[][] columns = new int[9][9];
        int[][] square = new int[9][9];

        for (int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if (board[i][j]!='.'){
                    int pos = board[i][j] - '0' - 1;
                    int posSquare = (i/3)+(j/3)*3;
                    if (++rows[i][pos]>1 || ++columns[pos][j]>1 || ++square[posSquare][pos]>1) return false;
                }

            }
        }
        return true;
    }
}