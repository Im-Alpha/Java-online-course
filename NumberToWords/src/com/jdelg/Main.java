package com.jdelg;

public class Main {

    public static void main(String[] args) {
        System.out.println("Get digit count method test output");
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));
        System.out.println("*************************");
        System.out.println("Reverse digit test output");
        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));
        System.out.println("*************************");
        System.out.println("Number to words test output");
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }

    public static void numberToWords(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        int count = getDigitCount(number);
        number = reverse(number);

        // Setup while loop so that it continues so long as the
        // count or original number doesn't hit zero
        while ((number > 0) || (count > 0)) {
            // Initialize dummy number variable to extract the last digit
            int lastDigit = number % 10;
            // Set switch to print the name of the number extracted
            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            // Divide original number by 10 to remove the last digit
            number /= 10;
            // Subtract the count so that it doesn't stay the same or continuously go up
            // it also stop the program from print zero after the main numbers are finished.
            count--;
        }
    }

    public static int reverse(int number) {
        // Initialize a variable
        int reversed = 0;
        // setup a while loop to reverse the number
        while (number != 0) {
            // store the last number in reversed through each pass
            // Pass 1: (0*10)+ (234 % 10) = 0 + 4 -> 234 / 10 = 23
            // Pass 2: (4 * 10) + (23 %10) = 43 -> 23 / 10 = 2
            // Pass 3: (43 * 10) + (2 % 10) -> number == 0 -> output is 432
            reversed = (reversed * 10) + (number % 10);
//            Check each pass
//            System.out.println(reversed);
            // Divide number by 10 to remove last digit for next pass
            number /= 10;
            // output is 4 / 43 / 432
        }
        return reversed;
    }

    public static int getDigitCount(int number) {
        // Check for negative
        if (number < 0) {
            return -1;
        }
        // Initialize counter variable
        int count = 0;
        // do while loop
        do {
            count++;
            number /= 10;
        } while (number > 0);
        return count;
    }
}
