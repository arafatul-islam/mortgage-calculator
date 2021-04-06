package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final  byte MONTH_IN_YEAR = 12;
        final  byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.print("Interest Rate: ");
        double interestRate = scanner.nextDouble();
        System.out.print("Year: ");
        int year = scanner.nextInt();
        year *= 12;
        interestRate /= PERCENT;

        double monthlyPayment = ((principal*interestRate) * (Math.pow(1+interestRate,year)))/
                (Math.pow(1+interestRate,year)-1);

        String monthlyMortgagePayment = NumberFormat.getCurrencyInstance().format(monthlyPayment);

        System.out.println(monthlyMortgagePayment);


    }
}
