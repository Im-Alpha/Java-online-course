package com.jdelg;

public class Main {

    public static void main(String[] args) {
//        int value = 3;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        // Switch works with all primitive types
        // byte, short, char, int
        int switchValue = 3;

        // The break is needed in order to cut off the code and not move onto the other cases.
        // This stops the default reply from triggering when a case should've been used.
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
            // If all the break lines were gone it would print
            // the switch case and anything after it.

        }

        // Challenge
        // Create a new switch statement using char instead of int
        // Create a new char variable
        // Create a switch statement testing for A, B, C, D or E
        // display a message if any of these are found and then break
        // Add a default which displays a message saying " not found"
        char newChar = 'D';

        switch (newChar) {
            case 'A':
                System.out.println("A was found");
                break;

            case 'B':
                System.out.println("B was found");
                break;

            case 'C':
            case 'D':
            case 'E':
                System.out.println(newChar + " was found");
                break;

            default:
                System.out.println("not found");
                break;
        }

        // String example
        String month = "JANUARy";
        // Can also do switch (month.toUpperCase()) to test in all caps
        switch (month.toLowerCase()) {
            // Must be lower case since tested input is being converted to lower case
            case "january":
                System.out.println("Jan");
                break;

            case "june":
                System.out.println("Jun");
                break;

            default:
                System.out.println("Not sure");
        }
    }

}
