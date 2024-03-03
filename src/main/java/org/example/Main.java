package org.example;


import org.example.easy.array.RotateImage;
import org.example.easy.array.ValidSudoku;
import org.example.easy.string.ReverseInteger;

public class Main {
    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();

        int i = reverseInteger.reserveInt(321);
        System.out.println(i);
    }
}