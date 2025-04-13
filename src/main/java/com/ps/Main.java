package com.ps;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueCalculating = 'y';

        while (continueCalculating == 'y') {
            System.out.println("Welcome to my Financial Calculator!");
            System.out.println("Select from the options below:");
            System.out.println("1) Mortgage Calculator");
            System.out.println("2) Future Value Calculator");
            System.out.println("3) Present Value of Annuity Calculator");
            System.out.println("4) Retirement Savings Calculator");
            System.out.print("Please enter your choice (1-4) <3: ");

            int givenCommand = 0;
            // Validate input for command selection

            if (scanner.hasNextInt())
            {
                givenCommand = scanner.nextInt();
            }
            else
            {
                System.out.println("Invalid input. Please enter an integer between 1 and 4.");
                scanner.next(); // Consume invalid input
                continue;
            }
            switch (givenCommand) {
                case 1:
                    // Mortgage Calculator
                    System.out.println("~~~ Welcome to the Mortgage Calculator ~~~");
                    System.out.print("Enter the principal loan amount: ");
                    double principal = scanner.nextDouble();

                    System.out.print("Enter the annual interest rate (example: 5.62): ");
                    double annualInterestRate = scanner.nextDouble();

                    System.out.print("Enter the loan term in years: ");
                    int years = scanner.nextInt();

                    // Convert annual interest rate to monthly rate
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
                    break;

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
                    // Annuity Calculator
                    System.out.println("~~~ Welcome to the Present Value of Annuity Calculator ~~~");

                    System.out.print("Enter the monthly payout amount: ");
                    double monthlyPayout = scanner.nextDouble();

                    System.out.print("Enter the expected annual interest rate (example: 2.56): ");
                    annualInterestRate = scanner.nextDouble();

                    System.out.print("Enter the number of years to pay out: ");
                    years = scanner.nextInt();

                    // Convert annual interest rate to monthly rate
                    monthlyInterestRate = (annualInterestRate / 100) / 12;

                    // Calculate total number of payments
                    int totalPayments = years * 12;

                    // Calculate present value using the annuity formula
                    double presentValue = monthlyPayout * (1 - Math.pow(1 + monthlyInterestRate, -totalPayments)) / monthlyInterestRate;

                    // Display result
                    System.out.printf("Present Value of Annuity: $%.2f%n", presentValue);
                    break;

                case 4:
                    // Retirement Savings Calculator
                    System.out.println("~~~ Welcome to the Retirement Savings Calculator ~~~");

                    System.out.print("Enter your retirement goal amount: ");
                    double retirementGoal = scanner.nextDouble();

                    System.out.print("Enter your current savings: ");
                    double currentSavings = scanner.nextDouble();

                    System.out.print("Enter the expected annual return rate (example: 5.0): ");
                    double annualReturnRate = scanner.nextDouble();

                    System.out.print("Enter the number of years until retirement: ");
                    int retirementYears = scanner.nextInt();

                    System.out.print("Enter the expected annual increase in contributions (example: 2.0): ");
                    double annualIncreaseRate = scanner.nextDouble();

                    // Convert annual return rate to monthly rate
                    double monthlyReturnRate = (annualReturnRate / 100) / 12;

                    // Calculate total number of payments
                    int retirementPayments = retirementYears * 12;

                    // Calculate monthly savings needed
                    double monthlySavings = (retirementGoal - currentSavings * Math.pow(1 + monthlyReturnRate, retirementPayments)) * monthlyReturnRate / (Math.pow(1 + monthlyReturnRate, retirementPayments) - 1);

                    // Adjust for annual increase in contributions
                    double adjustedMonthlySavings = monthlySavings / (1 + (annualIncreaseRate / 100));

                    // Calculate total contributions and interest earned
                    double totalContributions = adjustedMonthlySavings * retirementPayments;
                    double totalInterestEarnedRetirement = retirementGoal - totalContributions - currentSavings;

                    // Display results
                    System.out.printf("Monthly Savings Needed: $%.2f%n", adjustedMonthlySavings);
                    System.out.printf("Total Contributions: $%.2f%n", totalContributions);
                    System.out.printf("Total Interest Earned: $%.2f%n", totalInterestEarnedRetirement);
                    break;

                default:
                    // Handle invalid option
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
            // Ask if the user wants to perform another calculation :D
            System.out.print("Would you like to perform another calculation? (y/n): ");
            continueCalculating = scanner.next().charAt(0);

            if (continueCalculating != 'y' && continueCalculating != 'n')
            {
                System.out.println("Invalid choice. Please select 'y' or 'n'.");
            }
        }

        System.out.println("Thank you for using my Financial Calculator!");
        // Close the scanner cant leave the facet running
        scanner.close();
    }
}