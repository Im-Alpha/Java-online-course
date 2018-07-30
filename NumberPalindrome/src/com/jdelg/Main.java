package com.jdelg;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        // Check for neg number
        if (number < 0) {
            number = Math.abs(number);
        }

        // initialize variables
        int reverse = 0;
        int lastDigit;
        int n = number;

        // create while statement for increasing the reverse
        while (number > 0) {
            lastDigit = number % 10; // gets last number 707 % 10 = 7
            reverse = (reverse * 10) + lastDigit; // multiplies the lastDigit by 10 each loop
            number /= 10; // number / 10 gets smaller until it hits 0
        }

        // Check if starting number is equal to the reverse
        if (n == reverse) {
            return true;
        }
        return false;
    }
}
