package org.example;

import org.example.easy.ContainsDuplicate;
import org.example.easy.RotateAnArray;

public class Main {
    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int input [] = {1,2,3,4,5,6,7};
        boolean b = containsDuplicate.containsDuplicate(input);
        System.out.println(b);
    }
}