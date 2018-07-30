package com.jdelg;

public class Main {

    public static void main(String[] args) {
        bark(true, 1);
        bark(false, 2);
        bark(true, 8);
        bark(true, -1);
    }

    public static boolean bark(boolean barking, int hourOfDay) {

        if (barking == true && ((0 <= hourOfDay && hourOfDay < 8) || hourOfDay == 23)) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }
}
