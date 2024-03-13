package org.example;


import org.example.easy.array.RotateImage;
import org.example.easy.array.ValidSudoku;
import org.example.easy.string.ReverseInteger;
import org.example.easy.string.ValidPalindrome;

public class Main {
    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        boolean result = validPalindrome.isValidPalindrome("aol.32l.o.a");
        System.out.println(result);
    }
}