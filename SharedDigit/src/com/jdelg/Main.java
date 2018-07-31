package com.jdelg;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int x, int y) {
        if ((x < 10) || (x > 99) || (y < 10) || (y > 99)) {
            return false;
        }
        // one way to solve
//        String firstNumber = String.valueOf(x);
//        String secondNumber = String.valueOf(y);
//
//        for (int i = 0; i < firstNumber.length(); i++){
//            for (int j = 0; j < secondNumber.length(); j++){
//                if(firstNumber.charAt(i) == secondNumber.charAt(j)){
//                    return true;
//                }
//            }
//        }
        // other way to solve
        // x%10 =
        if ((x % 10 == y % 10) || (x / 10 == y / 10) || (x % 10 == y / 10) || (x / 10 == y % 10)) {
            return true;
        }
        return false;
    }
}
