package com.ps;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to my Financial Calculator!");
        System.out.println("Select from the options below:");
        System.out.println("1) Mortgage Calculator");
        System.out.println("2) Future Value Calculator");
        System.out.println("3) Aunnity Calculator Calculator");
        System.out.println("4) TBA Calculator");
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
                System.out.printf("Monthly Payment: $%.2f%n", monthlyPayment);
                System.out.printf("Total Interest Paid: $%.2f%n", totalInterest);

            case 2:
                // Future Value Calculator
                System.out.println("~~~ Welcome to Future Value Calculator ~~~");

                System.out.print("Enter the initial deposit amount: ");
                double initialDeposit = scanner.nextDouble();

                System.out.print("Enter the annual interest rate (example: 1.50): ");
                double savingsRate = scanner.nextDouble();

                System.out.print("Enter the number of years: ");
                int savingsYears = scanner.nextInt();

                // Convert annual interest rate to decimal
                double ratePerPeriod = savingsRate / 100 / 365;
                int totalPeriods = 365 * savingsYears;

                // Calculate future value using the compound interest formula
                double futureValue = initialDeposit * Math.pow(1 + ratePerPeriod, totalPeriods);

                // Calculate total interest earned
                double totalInterestEarned = futureValue - initialDeposit;

                // Display results
                System.out.printf("Future Value of Savings: $%.2f%n", futureValue);
                System.out.printf("Total Interest Earned: $%.2f%n", totalInterestEarned);
                break;

            case 3:
                // aunnity Calculator
                System.out.println("~~~ Welcome to the Present Value of Annuity Calculator ~~~");

                System.out.print("Enter the monthly payout amount: ");
                double monthlyPayout = scanner.nextDouble();

                System.out.print("Enter the expected annual interest rate (example: 2.5): ");
                annualInterestRate = scanner.nextDouble();

                System.out.print("Enter the number of years to pay out: ");
                years = scanner.nextInt();

                // Convert annual interest rate to monthly rate (decimal)
               monthlyInterestRate = (annualInterestRate / 100) / 12;

                // Calculate total number of payments
                int totalPayments = years * 12;

                // Calculate present value using the annuity formula
                double presentValue = monthlyPayout * (1 - Math.pow(1 + monthlyInterestRate, -totalPayments)) / monthlyInterestRate;

                // Display result
                System.out.printf("Present Value of Annuity: $%.2f%n", presentValue);
                break;

            case 4:
                // Saving Calculator
                System.out.println("~~~ work in progress pookie ~~~");
                break;


            default:
                // Handle invalid menu option
                System.out.println("Invalid choice. Please select a valid option.");
                break;
        }

    }
}