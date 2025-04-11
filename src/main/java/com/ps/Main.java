package com.ps;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to my Financial Calculator!");
        System.out.println("Select from the options below:");
        System.out.println("1) Mortgage Calculator");
        System.out.println("2) Car Loan Calculator");
        System.out.println("3) Savings Calculator");
        System.out.print("Please enter your choice (1-3) <3: ");
        int givenCommand = scanner.nextInt();

        switch (givenCommand) {
            case 1:
                // Mortgage Calculator
                System.out.println("~~~ Welcome to the best Mortgage Calculator NA ~~~");
                System.out.print("Enter the principal loan amount: ");
                break;

            case 2:
                // Car Loan Calculator
                System.out.println("~~~ work in progress pookie ~~~");
                break;

            case 3:
                // Savings Calculator
                System.out.println("~~~ work in progress pookie ~~~");
                break;
        }
    }
}