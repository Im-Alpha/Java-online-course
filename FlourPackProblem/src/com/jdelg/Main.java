/*
        Write a method named canPack with three parameters of type int named bigCount, smallCount and goal.

        The parameter bigCount represents the count of big flour bags (5 kilo each).

        The parameter smallCount represents the count of small flour bags (1 kilo each).

        The parameter goal represents the goal amount of kilos of flour needed to assemble a package.

        Therefore, the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal.
        The method should return true if it is possible to make a package with goal kilos of flour.
        If the sum is greater than goal, ensure that only full bags are used towards the goal amount.
        For example, if goal = 9, bigCount = 2, and smallCount = 0,
        the method should return false because each bigCountbag is 5 kilos and cannot be divided.
        However, if goal = 9, bigCount = 1, and smallCount = 5,
        the method should return true because 1 full bigCount bag and 4 full smallCount bags equal goal,
        and it's okay if there are additional bags left over.
        If any of the parameters are negative, return false.

        EXAMPLE INPUT/OUTPUT:
        canPack (1, 0, 4); should return false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.
        canPack (1, 0, 5); should return true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.
        canPack (0, 5, 4); should return true since smallCount is 5 (small bags of 1 kilo) and goal is 4 kilos.
        canPack (2, 2, 12); should return true since bigCount is 2 (big bags 5 kilos each) and smallCount is 2 (small bags of 1 kilo), makes in total 12 kilos and goal is 12 kilos.
        canPack (-3, 2, 12); should return false since bigCount is negative.

        NOTE: The canPack method should be defined as public static like we have been doing so far in the course.
        NOTE: Do not add a main method to the solution code.
*/
package com.jdelg;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 12));
        System.out.println(canPack(-3, 2, 12));
        System.out.println(canPack(0, 5, 6));
        System.out.println(canPack(2, 1, 5));
        System.out.println(canPack(1, 0, 6));
        System.out.println(canPack(5, 3, 24));
    }

    //    public static boolean canPack(int bigCount, int smallCount, int goal) {
//        // check for negative
//        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
//            return false;
//        }
//        // Initialize variables to their baseline values
//        bigCount *= 5;
//        smallCount *= 1;
//        // create sum variable for storing each pass
//        int sum = 0;
//
//
//        // create while loop to continuously add to the sum until goal is reached
//        do {
//            // find the sum before adding/subtracting
//            sum = bigCount + smallCount;
//            if (smallCount > goal) {
//                return true;
//            } else if (bigCount > goal) {
//                bigCount -= 5;
//                continue;
//            }
//
//            if ((smallCount != 0) && (sum > goal)) {
//                return true;
//            } else if ((smallCount == 0) && (sum > goal)) {
//                return false;
//            } else if ((smallCount == 0) && (sum < goal)) {
//                return false;
//            }
//
//            if ((goal % 5) != 0) {
//                if (sum < goal) {
//                    return false;
//                }
//                smallCount += 1;
//            }
//            bigCount += 5;
//
//            if ((sum == goal)) {
//                return true;
//            }
//
//        } while (sum != goal);
//        return false;
//    }
    // Another solution
    // From Q&A
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0 || goal > bigCount * 5 + smallCount) {
            return false;
        }

        if (smallCount < 5) {
            if (goal % 5 <= smallCount) {
                return true;
            }
        } else {
            if (goal <= bigCount * 5 + smallCount) {
                return true;
            }
        }
        return false;
    }
}
