/*
 * UCF COP3330 Summer 2021 Assignment 1 Solution
 * Copyright 2021 Ursula Shaw
 */

package base;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What is the principal amount? ");
        double p = Double.parseDouble(in.nextLine());
        System.out.println("What is the rate? (as a percentage) ");
        double r = Double.parseDouble(in.nextLine());
        System.out.println("What is the number of years? ");
        double t = Double.parseDouble(in.nextLine());
        System.out.println("What is the number of times the interest in compounded per year? ");
        int n = in.nextInt();

        double a = p* (Math.pow(1 + (r/100)/n, (n*t)));

        System.out.printf("$%.2f invested at %f%% for %.0f years compounded %d times per year is $%.2f.", p, r, t, n, a);

    }
}
