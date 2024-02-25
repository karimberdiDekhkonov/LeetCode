package org.example;

import org.example.easy.ContainsDuplicate;
import org.example.easy.RotateAnArray;
import org.example.easy.SingleNumber;

public class Main {
    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        int[] input = {1,1,2,3,4,5,6,2,3,4,5,6,7};
        int b = singleNumber.singleNumber(input);
        System.out.println(b);
    }
}