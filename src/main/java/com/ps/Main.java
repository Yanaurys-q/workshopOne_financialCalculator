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
                double principal = scanner.nextDouble();

                System.out.print("Enter the annual interest rate (example: 5.62): ");
                double annualInterestRate = scanner.nextDouble();

                System.out.print("Enter the loan term in years: ");
                int years = scanner.nextInt();

                // Convert annual interest rate to monthly rate (decimal)
                double monthlyInterestRate = (annualInterestRate / 100) / 12;

                // Calculate total number of monthly payments
                int numberOfPayments = years * 12;

                // Calculate monthly payment using the mortgage formula
                double monthlyPayment = principal *
                        (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) /
                        (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

                // Calculate total amount paid and total interest
                double totalPaid = monthlyPayment * numberOfPayments;
                double totalInterest = totalPaid - principal;

                // Display results
                System.out.printf("Monthly Payment: $%.3f%n", monthlyPayment);
                System.out.printf("Total Interest Paid: $%.3f%n", totalInterest);

            default:
                // Handle invalid menu option
                System.out.println("Invalid choice. Please select a valid option.");
                break;

            case 2:
                // CD Calculator
                System.out.println("~~~ work in progress pookie ~~~");
                break;

            case 3:
                // aunnity Calculator
                System.out.println("~~~ work in progress pookie ~~~");

            case 4:
                // Saving Calculator
                System.out.println("~~~ work in progress pookie ~~~");
                break;


        }
    }
}