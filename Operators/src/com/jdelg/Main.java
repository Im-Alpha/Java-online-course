package com.jdelg;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousresult = result;
        result = result - 1;
        System.out.println(previousresult + " - 1 = " + result);

        previousresult = result;

        result = result * 10;
        System.out.println(previousresult + " * 10 = " + result);

        previousresult = result;

        result = result / 5;
        System.out.println(previousresult + " / 5 = " + result);

        previousresult = result;

        result = result % 3;
        System.out.println(previousresult + " % 3 = " + result);

        previousresult = result;

        //Operators that increment post/pre
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        //Operators with =
        result += 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);

        //Conditional operators if/then
        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is not an alien!");

        int topScore = 80;
        //Operators allowed in if statements
        // > >= != == < <=
        // &&(and)
        // ||(or)
        if (topScore <= 100)
            System.out.println("You got the high score!");

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less than 100");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true");

        //int will come false because the value can't be assigned during the if statement
        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is true");

        //Boolean doesn't give an error
        //the assignment doesn't need ==
        /* boolean isCar = false;
        if(isCar = true)
            System.out.println("This is not supposed to happen");
        */
        //correct syntax
        boolean isCar = false;
        if (isCar == true)
            System.out.println("This is the correct syntax");

        //ternary operator
        //shortcut if isCar is == true, then wasCar == false
        //wasCar is dependant on isCar
        //if isCar is true, then was wasCar is also true
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("wasCar is true");

        //challenge
        //1. Create a double variable with the value 20
        double x = 20;
        //2. Create a second variable of type double with the value 80
        double y = 80;
        //3. Add both numbers up and multiply by 25
        double total = (x + y) * 25;
        System.out.println("Total currently is = " + total);
        //4. Use the remainder operator to figure out the reminder from the sum of #3 divided by 40
        double finTotal = total %40;
        System.out.println("The remainder is = " + finTotal);
        //5. Write an "if" statement that displays a message "Total was over the limit"
        // If the remaining total(#4) is equal to 20 or less.
        if(finTotal <= 20)
            System.out.println("Total was over the limit");



    }
}
