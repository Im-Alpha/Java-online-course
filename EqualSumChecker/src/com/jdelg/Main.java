package com.jdelg;

public class Main {

    public static void main(String[] args) {
	hasEqualSum(1,1,1);
	hasEqualSum(1,1,2);
	hasEqualSum(1,-1,0);
    }

    public static boolean hasEqualSum(int val1, int val2, int val3) {

        if ((val1 + val2) == val3) {
            System.out.println("True");
            System.out.println(val1 + " + " + val2 + " is equal to " + val3);
            return true;
        } else {
            System.out.println("False");
            System.out.println(val1 + " + " + val2 + " is not equal to " + val3);
            return false;
        }
    }
}
