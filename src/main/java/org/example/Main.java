package org.example;


import org.example.easy.TwoSum;

public class Main {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] input = {9,9,4,3};

        int[] ints = twoSum.twoSum(input, 18);

        for (int anInt : ints) {
            System.out.print(anInt+", ");
        }
    }
}