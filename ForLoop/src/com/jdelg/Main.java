package com.jdelg;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000, 5.0));

        // for(init; termination; increment)
        // init is the code that will be initialized at the start of the loop
        // termination is at what point does the loop exit can also be turned into
        // "false" at a certain point
        // increment is sends expression that is invoked each time the loop goes off
        for (int i = 0; i < 5; i++) {
            // can also use (i + 1) to start from 1
            System.out.println("Loop " + i + " hello!");
        }

        // Challenge # 1
        //Using the for statement, call the calculateInterest method with
        // the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
        // and print the results to the console window.

        for (int z = 2; z < 9; z++) {
            System.out.println("10,000 at " + z + "% interest = " + calculateInterest(10000, z));
            // output for 7% is 700.0000000000001
            // to fix this, you have to add a String.format("%.2f",calculateInterest(10000,z));
            // This is the corrected system out line
            // System.out.println("10,000 at " + z + "% interest = " +String.format("%.2f",calculateInterest(10000,z)));
        }

        System.out.println("**************************************");

        // Challenge #2
        // How would you modify the for loop above to do the same thing as
        // shown but to start from 8% and work back to 2%

        for (int z = 8; z >= 2; z--) {
            System.out.println("10,000 at " + z + "% interest = " + String.format("%.2f", calculateInterest(10000, z)));
        }

        System.out.println("**************************************");
        // Challenge #3
        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using the isPrime method
        // if it is a prime number, print it out AND increment a count of the
        // number of prime numbers found
        // if that count is 3 exit the for loop
        // hint: Use the break; statement to exit

        int count = 0;

        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 10) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }

        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        // instead of using n/2
        // The optimized version is
        // we could use i <= (long) Math.sqrt(n);
        for (int i = 2; i <= n / 2; i++) {
            // This can be used to check the amount of loops done per prime number
            // System.out.println("Looping " + i);
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
