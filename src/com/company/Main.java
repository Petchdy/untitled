package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();
        float number4 = scan.nextFloat();
        float number5 = scan.nextFloat();
        System.out.printf("%f",(number1+number2+number3)/(number4+number5));
    }
}
