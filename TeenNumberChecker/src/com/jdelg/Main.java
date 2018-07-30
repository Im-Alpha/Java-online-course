package com.jdelg;

public class Main {

    public static void main(String[] args) {
	hasTeen(9,99,19);
	hasTeen(23,15,42);
	hasTeen(22,23,34);
    }
    public static boolean hasTeen(int val1, int val2, int val3){

        if(val1 >= 13 && val1 <= 19 || val2 >= 13 && val2 <= 19 ||
                val3 >= 13 && val3 <= 19){
            System.out.println("True");
            return true;
        }else {
            System.out.println("False");
            return false;
        }
    }
}
