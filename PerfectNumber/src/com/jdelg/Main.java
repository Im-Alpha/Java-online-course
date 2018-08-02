package com.jdelg;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println(isPerfectNumber(10));
    }

    public static boolean isPerfectNumber(int number) {
        // Initialize variabels
        int x = 1;
        int sum = 0;
        // check for negative
        if (number < 1) {
            return false;
        }

        // setup while loop so that the increasing number never passes the original
        while (x <= number) {
            // initialize a variable that will constantly reset to the
            // original number
            int test = number;
            // modulo division
            test %= x;
            // store the dividing number into a sum
            sum += x;
            x++;
            if (test != 0) {
                continue;
            }
            // Check what the number is prior to the finished loop
            // System.out.println(sum);

            // If statement to stop the loop is the sum of the divided numbers
            // is equal to the original number
            if (sum == number) {
                // check the final number
                // System.out.println(sum);
                return true;
            }
        }
        return false;
    }
}
