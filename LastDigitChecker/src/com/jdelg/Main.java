package com.jdelg;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 99));
    }

    public static boolean hasSameLastDigit(int x, int y, int z) {
        if ((x < 10) || (x > 1000) || (y < 10) || (y > 1000) || (z < 10) || (z > 1000)) {
            return false;
        }
        int lastX = x % 10;
        int lastY = y % 10;
        int lastZ = z % 10;

        if ((lastX == lastY) || (lastY == lastZ) || (lastX == lastZ)) {
            return true;
        }
        return false;
    }
}
