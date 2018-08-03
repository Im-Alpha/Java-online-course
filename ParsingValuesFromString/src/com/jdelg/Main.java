package com.jdelg;

public class Main {

    public static void main(String[] args) {
        // The String cannot contain anything other than numbers in order to parse it
        // Even for Float or Long the l/f at the end will cause an error
        // decimal places can be done with datatypes other than int
        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        // parse is a static variable
        // can be used with any primitive datatype
//        double number = Double.parseDouble(numberAsString);
        int number = Integer.parseInt(numberAsString);
//        long number = Long.parseLong(numberAsString);
        System.out.println("number = " + number);

        // For the string the number is added physically
        // rather than mathematically
        numberAsString += 1; // output is 20181
        // number can be added normally
        number += 1; // output is 2019
        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);
    }
}
