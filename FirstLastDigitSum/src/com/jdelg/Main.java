package com.jdelg;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(10));
        System.out.println(sumFirstAndLastDigit(-10));
        System.out.println(sumFirstAndLastDigit(10));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        // initialize variables
        int z = number;
        int y = number % 10; // finding the last digit on the number
        int sum; // setting up the sum variable

        // Check if y has the correct last digit
        //System.out.println(y);

        // Set up while loop
        // continue until first digit is found
        while (z >= 10) {
            z /= 10;

        }

        // Check if z is the correct first number
        //System.out.println(z);

        // set sum equal to the first and last digits added
        sum = y + z;
        // print out sum  as a test before initializing print in main arg
        // System.out.println(sum);
        return sum; // return sum
    }
}
