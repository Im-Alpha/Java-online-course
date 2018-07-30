package com.jdelg;

public class Main {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2050);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int y = (kiloBytes / 1024);
            int z = (kiloBytes % 1024);
            System.out.println(kiloBytes + "KB = " + y + " MB and " + z + "KB remaining");
        }
    }
}
