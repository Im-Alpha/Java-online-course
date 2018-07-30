package com.jdelg;

public class Main {

    public static void main(String[] args) {
        //int holds whole value not decimal
        //width of 32 ( 4 bytes)
	    int myIntValue = 5 / 2;
	    //float can be 5.25f
        //float can use whole do arithmetic with whole numbers 5f/2
        //width of 32 (4 bytes)
	    float myFloatValue = 5f / 3f;
	    //double for decimal is just 5.25
        //decimals are automatically counted as double
        //double also has more precision is terms of how many decimal points there are
        //double can use whole do arithmetic with whole numbers 5d/2
        //width of 64 (8 bytes)
	    double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        //Challenge
        //convert a given number of pounds to kilograms

        //1 create a variable to store the number of pounds
        //1 pound is equal to 0.4535937 Kilograms
        double pounds = 200d;
        double kilo = 0.4535937d;

        //2 Calculate the number Kilograms for the number above and store in a varible
        double Total = pounds * kilo;


        //3 Print the result
        System.out.println("myTotal = " + Total);
        //90.71874
        double pi = 3.141_592_7d;


    }
}
