package com.jdelg;

public class Main {

    public static void main(String[] args) {
	    int myVariable = 50;
	    //indenting also makes reading the flow of the code easier
	    if(myVariable == 50){
            System.out.println("Printed");
        }

	    myVariable++;
	    myVariable--;
        System.out.println("This is a test");
        //Java reads this as
        // ("This is" + " another" + " still more.");
        //The white space in between doesn't matter
        System.out.println("This is"
                + " another" + " still more.");

        //Code can be put on the same line, but for more legibility
        //it's separated
        //int anotherVariable = 50;myVariable--;System.out.println("This is another one");




    }
}
