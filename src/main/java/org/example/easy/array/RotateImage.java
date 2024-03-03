package org.example.easy.array;


//03.03.2024
//WE TRANSPOSE THE MATRIX FIRST THEN WE REVERSE EACH ROW.
//TIME COMPLEXITY: O(n^2)
//SPACE COMPLEXITY: O(1)
//LINK: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/770/
public class RotateImage {
    public void rotate(int[][] matrix){
        int length = matrix.length;

        // Transpose the matrix
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][length - 1 - j];
                matrix[i][length - 1 - j] = temp;
            }
        }

    }
}
