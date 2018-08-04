package com.jdelg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // The keyword "new" creates an instance for the datatype you're going for
        // Create a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Whenever you scan an int, it automatically skips all other scanners
        // This happens because typing "enter" for the input acts as a line separator
        // and then skip the rest of the scanners

//        System.out.println("Enter your year of birth: ");
//        int yearOfBirth = scanner.nextInt();
//        int age = 2018 - yearOfBirth;
//
//        System.out.println("Now enter your name: ");
//        String name = scanner.nextLine();
//
//        this prints
//
//        Enter your year of birth:
//        1995
//        Now enter your name:
//        Your name is , and your age is 23
//        because the enter key is counting as the name input
//        it is skipping the actual input


        // To get around this, you must make a blank scanner line to reset it
        // for the next input
        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt(); // Checks if the input is an int

        // if (hasNextInt) checks if the boolean statement is true or false
        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            int age = 2018 - yearOfBirth;

            // This handles the next line character (enter key)
            scanner.nextLine();

            System.out.println("Now enter your name: ");
            String name = scanner.nextLine();

            // Checks for negative number or absurd input
            if ((age >= 0) && (age <= 100)) {
                System.out.println("Your name is " + name + ", and your age is " + age);

            } else {
                System.out.println(name + " you have entered an invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }
        scanner.close();
    }
}
