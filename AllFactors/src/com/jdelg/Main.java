package com.jdelg;

public class Main {

    public static void main(String[] args) {
        printFactors(6);
        System.out.println("*********************");
        printFactors(32);
        System.out.println("*********************");
        printFactors(10);
        System.out.println("*********************");
        printFactors(-1);
    }

    public static void printFactors(int number) {
        int x = 1;
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        // 6 % 1 = 0 | 6 % 2 = 0 | 6%3 = 0 | 6 % 4 = 2 | 6% 5 = 1 | 6% 6 = 0 | 6% 7 = -1
        // Setup while loop so that the increasing variable doesn't pass the original number
        while (x <= number) {
            // set up a substitute for the original number
            int num = number;
            // modulo division
            num %= x;
            // if it is a perfect divisor, print
            if (num == 0) {
                System.out.println(x);
            }
            x++;
        }
    }
}
