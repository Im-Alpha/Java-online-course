package com.jdelg;

public class Main {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));

    }

    public static int getEvenDigitSum(int number) {
        // initialize variables
        int r = 0;
        int sum = 0;

        // check for negative
        if (number < 0) {
            return -1;
        } else {
            // set up while loop
            while (number > 0) {
                // continuously finds the remainder
                r = number % 10;

                // if the remainder is divisible by 2
                // add it to the sum
                if (r % 2 == 0) {
                    sum += r; // sum = sum + r;
                }
                number /= 10; // number = number / 10;
            }
        }
        return sum;
    }
}
