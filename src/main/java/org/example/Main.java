package org.example;


import com.sun.org.apache.xpath.internal.operations.Plus;
import org.example.easy.PlusOne;

public class Main {
    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        int[] input = {9,9};
        int[] ints = plusOne.plusOne(input);

        for (int anInt : ints) {
            System.out.print(anInt+", ");
        }
    }
}