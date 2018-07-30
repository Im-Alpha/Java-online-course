package com.jdelg;

public class Main {

    public static void main(String[] args) {
        // The normal way of calling a method
        // calculateScore("Jacob", 500);

        // New way of calling the method and adding the returned value
        int newScore = calculateScore("Jacob", 500);
        System.out.println("New score is " + newScore);

        // Using the overloaded method
        // Simply using the same name and only putting a valid int number
        // WILL NOT WORK WITH STRING DATA TYPE
        calculateScore(75);

        // This method will not work because 3 parameters have yet to be created
        // calculateScore(100,100, 23);

        // This no parameter overloaded method will work
        // It needs the data types to match in order to run
        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    // Overloading the original method
    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    // Creating a third overloaded method with no parameters
    public static int calculateScore() {
        System.out.println("No player, no player score.");
        return 0;
    }

    // Making the method 'void' will not change the signature and will not work
    /*
    public static void calculateScore() {
        System.out.println("No player, no player score.");
    }
    */


}
