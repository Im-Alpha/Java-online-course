package com.jdelg;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	Random rand = new Random();
	int x = 1;

	do{
	int n = rand.nextInt(70)+1;
        System.out.println(n);
        x++;
	}while (x <6);

	int z = rand.nextInt(25)+1;

        System.out.println(z);
    }
}
