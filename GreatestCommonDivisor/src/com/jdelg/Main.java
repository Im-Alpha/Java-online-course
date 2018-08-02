package com.jdelg;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        // 25 - 15 = 10 < 15 -> 15 - 10 = 5 < 10 -> 10 - 5 = 5 -> 5 == 5
        System.out.println("**************");
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println("**************");
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println("**************");
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if ((first < 10) || (second < 10)) {
            return -1;
        }
        // How do you find the divisor?
        // By subtracting both numbers until one hits zero
        // through integer subtraction
        while (second != 0) {
            if (first > second) {
                first -= second;
            } else {
                second -= first;
            }
            // Used to check each pass of the loop
            // System.out.println("x " + first);
            // System.out.println("y " + second);
        }
        return first;
    }
}
