package com.jdelg;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        //If statements can be executed without brackets
        //but with more than one line for the code
        //only the first line will be bound by the if statement
	    /*if(score == 4000)
            System.out.println("Your score was 5000");
		System.out.println("This was executed");*/

//        if (score < 5000 && score > 1000){
//            System.out.println("Your score was less than 5000 but greater than 1000");
//        } else if (score < 1000) {
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }
        // if (gameOver == true) is the same as if (gameOver)
        //because gameOver is defined at the top
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
        //cannot access finalScore because it is not a global variable
        //It was created in the code block of the if statement
        //int savedFinalScor = finalScore; is not valid


        //Print out a second score on the screen with the following
        //score set to 10000
        score = 10000;
        //levelCompleted set to 8
        levelCompleted = 8;
        //bonus set to 200
        bonus = 200;
        //But make sure the first printout above still displays as well
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        //One way to also make the solution
//        boolean GameOver = true;
//        int newScore = 10000;
//        int newLevelCompleted = 8;
//        int newBonus = 200;
//
//        if(GameOver) {
//            int finalScore = newScore + (newLevelCompleted * newBonus);
//            System.out.println("Your final score was " + finalScore);
//        }






    }
}
