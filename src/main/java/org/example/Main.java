package org.example;


import org.example.easy.TwoSum;
import org.example.easy.ValidSudoku;

public class Main {
    public static void main(String[] args) {
        ValidSudoku validSudoku = new ValidSudoku();
        char[][] input = {
                {'8','3','.','.','7','.','.','.','.'},
                {'6','4','.','1','9','5','.','.','.'},
                {'.','9','1','.','.','.','.','6','.'},
                {'1','.','.','.','6','2','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'2','.','.','.','8','.','.','7','9'}
        };


        boolean response = validSudoku.isValidSudoku(input);

        System.out.println(response);
    }
}