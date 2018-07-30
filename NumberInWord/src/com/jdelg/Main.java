package com.jdelg;

public class Main {

    public static void main(String[] args) {
        printNumberInWord(0);
        printNumberInWord(1);
        printNumberInWord(2);
        printNumberInWord(3);
        printNumberInWord(4);
        printNumberInWord(5);
        printNumberInWord(6);
        printNumberInWord(7);
        printNumberInWord(8);
        printNumberInWord(9);


    }

    public static void printNumberInWord(int val){
        if(val == 0){
            System.out.println("ZERO");
        } else if(val == 1){
            System.out.println("ONE");
        } else if(val == 2){
            System.out.println("TWO");
        } else if(val == 3){
            System.out.println("THREE");
        } else if(val == 4){
            System.out.println("FOUR");
        } else if(val == 5){
            System.out.println("FIVE");
        } else if(val == 6){
            System.out.println("SIX");
        } else if(val == 7){
            System.out.println("SEVEN");
        } else if(val == 8){
            System.out.println("EIGHT");
        } else if(val == 9){
            System.out.println("NINE");
        }else {
            System.out.println("OTHER");
        }
    }
}
