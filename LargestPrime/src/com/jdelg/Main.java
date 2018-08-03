package com.jdelg;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(16));
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        int x = 2;
        int store = 0;
        int product = 0;
        int num = 0;

        while (x <= number) {
            // initialize first values
            num = number;
            num %= x;

            // Set if statement for a quick answer
            if (num == 0) {
                // Reset and assign new values
                num = number;// 45 // 16
                num /= x; // 45/2 = 22 // 45 /3 = 15 // 16 / 2 = 8
                product = num;// 22 // 15 // 8

                // Create a dummy value
                // This is to catch the prime numbers of 45
                // which is 3 * 3 * 5
                store = product; // 22 // 15 // 8
                store /= x; // 8 / 2 = 4

                // 22 * 2 =44 != 45
                if (((x * product) == number) || (x * store * product) == number) {
                    // Catch the 3 * 3 * 5
                    if ((store * x * x) == number) {
                        // Check if store is not a prime number
                        if (((store % 2) == 0)) {
                            return (store / 2);
                        }
                        return store;
                    } else if (product > x) {
                        return product;
                    }
                    return x;
                } else {
                    x++;
                }
            } else {
                x++;
            }
        }
        return -1;
    }
}
