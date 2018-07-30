package com.jdelg;

public class Main {

    public static void main(String[] args) {
        isLeapYear(-1024);
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);
        isLeapYear(1924);
//        System.out.println(getDaysInMonth(1, 2020));
//        System.out.println(getDaysInMonth(2, 2020));
//        System.out.println(getDaysInMonth(2, 2018));
//        System.out.println(getDaysInMonth(-1, 2020));
//        System.out.println(getDaysInMonth(1, -2020));
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

    public static int getDaysInMonth(int month, int year) {
        if ((year < 1) || (year > 9999)) {
            return -1;
        } else {
            int yearDivFour = year % 4;
            int yearDivHund = year % 100;
            int yearDivFoHund = year % 400;

            if (yearDivFour == 0 && yearDivHund != 0 || yearDivFoHund == 0) {
                // System.out.println("Is a leap year.");
                if ((month < 1) || (month > 12)) {
                    return -1;
                } else switch (month) {
                    case 1:
                        return 31;
                    case 2:
                        return 29;
                    case 3:
                        return 31;
                    case 4:
                        return 30;
                    case 5:
                        return 31;
                    case 6:
                        return 30;
                    case 7:
                        return 31;
                    case 8:
                        return 31;
                    case 9:
                        return 30;
                    case 10:
                        return 31;
                    case 11:
                        return 30;
                    case 12:
                        return 31;
                    default:
                        return -1;
                }
            } else {
                // System.out.println("Is not a leap year");
                if ((month < 1) || (month > 12)) {
                    return -1;
                } else switch (month) {
                    case 1:
                        return 31;
                    case 2:
                        return 28;
                    case 3:
                        return 31;
                    case 4:
                        return 30;
                    case 5:
                        return 31;
                    case 6:
                        return 30;
                    case 7:
                        return 31;
                    case 8:
                        return 31;
                    case 9:
                        return 30;
                    case 10:
                        return 31;
                    case 11:
                        return 30;
                    case 12:
                        return 31;
                    default:
                        return -1;
                }
            }
        }
    }
// Other persons solution
//    public static boolean isLeapYear(int year) {
//
//        if (year < 1 || year > 9999) {
//
//            return false;
//
//        } else if ((year % 4 == 0 && year % 100 > 0) || year % 400 == 0) {
//
//            return true;
//
//        } else {
//
//            return false;
//
//        }
//
//    }
//
//    public static int getDaysInMonth(int month, int year) {
//
//        if ((month < 1) || (month > 12)) {
//
//            return -1;
//
//        } else if ((year < 1) || (year > 9999)) {
//
//            return -1;
//
//        }
//
//        switch (month) {
//
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//
//                return 31;
//
//            case 2:
//
//                if (isLeapYear(year) == true) {
//
//                    return 29;
//
//                } else {
//
//                    return 28;
//
//                }
//
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//
//                return 30;
//
//            default:
//
//                return -1;
//
//        }
    }
