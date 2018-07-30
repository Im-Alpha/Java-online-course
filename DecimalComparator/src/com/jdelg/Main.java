package com.jdelg;

public class Main {

    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(-3.1756,-3.175);
        areEqualByThreeDecimalPlaces(3.175,3.176);
        areEqualByThreeDecimalPlaces(3.0,3.0);
    }
    public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum){
        double difference = firstNum * 1000 - secondNum * 1000;

        if(difference > -1 && difference < 1){
            System.out.println("True");
            System.out.println(difference);
            return true;
        }else {
            System.out.println("False");
            System.out.println(difference);
            return false;
        }
    }
}
