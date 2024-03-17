package org.example;

import org.example.easy.string.StringToInteger;

public class Main {
    public static void main(String[] args) {
        StringToInteger string = new StringToInteger();
        int result = string.stringToInteger("   -42");
        System.out.println(result);
    }
}