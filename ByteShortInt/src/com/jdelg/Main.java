package com.jdelg;

public class Main {
    public static void main(String[] args) {
        //Int is used for most numbers
        //Using underscore to make numbers more legible only for java 7 and up
        //stores value from -2_147_483_648 to 2_147_483_647
        //int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("Total = " + myTotal );

        //byte should be used for a large quantity of small computations
        //range is from -128 to 127
        //byte has a width of 8
        byte myByteValue = 10;
        byte myNewByteValue = (byte)(myByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        //stores value from -32768 to 32767
        //short has a width of 16
        short myShortValue = 30000;
        short myNewShortValue = (short) (myShortValue/2);
        System.out.println(myNewShortValue);

        //Use captial L for more legibility
        //stores value from -2^63 to (2^63 - 1)
        //long has a width of 64
        long myLongValue = 100L;

    }
}
