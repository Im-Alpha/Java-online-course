package jdelg;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        // If count is 6 the loop will not start
        // But if count is higher than 7 it will run infinitely
        while (count != 6) {
            System.out.println("Count Value is " + count);
            count++;
        }

        System.out.println("********************************");

        // For Loop that is similar to the while loop from above
//        for(int i=1; i<6; i++){
//            System.out.println("Count value is " + i);
//        }

        // Another for loop that is
        // the full equivalent of the while loop above
//        for(count =1; count !=6; count++){
//            System.out.println("Count Value is " + count);
//        }

        // Resets count for this while loop
        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("********************************");

        // Reset count once more
//        count = 1;
//        // The do while loop is guaranteed to loop once
//        // even if the value starts at 6
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if(count >100){
//                break;
//            }
//        }while(count!=6);

        //Challenge isEvenNumber input
        System.out.println(isEvenNumber(2));
        System.out.println(isEvenNumber(3));
        System.out.println(isEvenNumber(11));

        System.out.println("**********************************");
        System.out.println("Challenge while loop");

        // While loop for challenge
//        int number = 4;
//        int lastNumber = 20;
//
//        while (number <= lastNumber) {
//            number++;
//            // Checks if it's not an even number
//            if (!isEvenNumber(number)) {
//                // Similar to break statement
//                // bypasses print statement and goes back to start of the loop instead
//                continue;
//            }
//            System.out.println("Even number " + number);
//        }

        // Challenge #2
        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found

        int number = 4;
        int lastNumber = 20;
        int whileCount = 0;

        while (number <= lastNumber) {
            number++;
            // Checks if it's not an even number
            if (!isEvenNumber(number)) {
                // Similar to break statement
                // bypasses print statement and goes back to start of the loop instead
                continue;
            }
            whileCount++;

            //System.out.println("Even number " + number);
        }
        System.out.println(whileCount);
    }

    // Challenge
    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // and even number or not
    // return true if an even number, otherwise return false;
    // Hint: use the remainder operator

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        }
        return false;
    }


}
