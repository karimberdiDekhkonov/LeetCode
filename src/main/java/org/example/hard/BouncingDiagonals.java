package org.example.hard;

import java.util.ArrayList;
import java.util.List;

public class BouncingDiagonals {
    public static int[] bouncingDiagonals(int[][] matrix) {
        if (matrix.length==0 || matrix[0].length==0) return new int[0];
        int m = matrix.length, n = matrix[0].length;
        int row = 0, col = 0, i = 0, starter = 0;
        boolean up = false;

        int[] arr = new int[m * n];

        n=n-1;
        m=m-1;
        while (row != 0 || col != n) {
            if (up){
                arr[i++] = matrix[row][col];
                row--;
                col++;
                if (row == 0){
                    up=false;
                }
            }else {
                arr[i++] = matrix[row][col];
                row++;
                col++;
                if (col > n){
                    starter++;
                    row = starter;
                    up=true;
                    col=0;
                }
            }
        }


        arr[i] = matrix[0][n];
        return arr;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int[] bouncingDiagonalsOutput1 = bouncingDiagonals(matrix1);
        System.out.println("Output for the first matrix:");
        for (int diagonal : bouncingDiagonalsOutput1) {
            System.out.print(diagonal);
            System.out.print(", ");
        }

        System.out.println();

        int[] bouncingDiagonalsOutput2 = bouncingDiagonals(matrix2);
        System.out.println("\nOutput for the second matrix:");
        for (int diagonal : bouncingDiagonalsOutput2) {
            System.out.print(diagonal);
            System.out.print(", ");
        }
    }
}
