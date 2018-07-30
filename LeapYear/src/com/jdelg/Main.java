package com.jdelg;

public class Main {

    public static void main(String[] args) {
        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);

    }

    public static boolean isLeapYear(int year) {
        int yearDivFour = year % 4;
        int yearDivHund = year % 100;
        int yearDivFoHund = year % 400;

        if ((year < 1) || (year > 9999)) {
            System.out.println("Is not a leap year");
            return false;
        } else {
            if ((yearDivFour == 0) && (yearDivHund != 0) || (yearDivFoHund == 0)) {
                System.out.println("Is a leap year.");
                return true;
            } else {
                System.out.println("Is not a leap year");
                return false;
            }
        }
    }
}
