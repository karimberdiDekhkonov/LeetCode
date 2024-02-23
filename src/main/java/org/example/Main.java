package org.example;

import org.example.easy.RemoveDuplicates;

public class Main {
    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int input [] = {1,2,3,3,3,3,3,4,4,4,4,4};
        int service = removeDuplicates.service(input);
        System.out.println(service);
    }
}