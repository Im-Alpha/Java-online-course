package com.jdelg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        // boolean is referred to as a flag because it checks if something is true or not
        boolean first = true;

        while (true) {
            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();

                // Used boolean as a flag to check for the first number
                if (first) {
                    first = false; // Checks if valid number
                    min = number; // initially assigns min and max to number
                    max = number; // this allows for the min number to be the first number
                }

                if (number > max) {
                    max = number;
                }

                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }

        System.out.println("min = " + min + ", max = " + max);
        scanner.close();
    }
}
