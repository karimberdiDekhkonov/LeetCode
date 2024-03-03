package org.example;


import org.example.easy.array.RotateImage;
import org.example.easy.array.ValidSudoku;

public class Main {
    public static void main(String[] args) {

        RotateImage rotateImage = new RotateImage();
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        rotateImage.rotate(matrix);

        // Printing the rotated matrix
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}