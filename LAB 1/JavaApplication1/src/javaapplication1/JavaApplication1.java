package javaapplication1;

import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;

public class JavaApplication1 {

    public static void main (String arg[]) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("How much money is in the account?: ");
    double startingBalance = keyboard.nextDouble();

    System.out.print("Enter the annual interest rate:");
    double annualInterestRate = keyboard.nextDouble();

    SavingsAccount savingsAccount = new SavingsAccount(startingBalance, annualInterestRate);

    System.out.print("How long has the account been opened? ");
    double months = keyboard.nextInt();

    double montlyDeposit;
    double monthlyWithdrawl;
    double interestEarned = 0.0;
    double totalDeposits = 0;
    double totalWithdrawn = 0;

    for (int i = 1; i <= months; i++) {
        System.out.print("Enter amount deposited for month: " + i + ": ");
        montlyDeposit = keyboard.nextDouble();
        totalDeposits += montlyDeposit;

        savingsAccount.deposit(montlyDeposit);

        System.out.print("Enter amount withdrawn for " + i + ": ");
        monthlyWithdrawl = keyboard.nextDouble();
        totalWithdrawn += monthlyWithdrawl;

        savingsAccount.withdraw(monthlyWithdrawl);

        savingsAccount.addInterest();

        interestEarned += savingsAccount.getLastAmountOfInterestEarned();
    }
    keyboard.close();

    DecimalFormat dollar = new DecimalFormat("#,##0.00");

    System.out.println("Total deposited: $" + dollar.format(totalDeposits));
    System.out.println("Total withdrawn: $" + dollar.format(totalWithdrawn));
    System.out.println("Interest earned: $" + dollar.format(interestEarned));
    System.out.println("Ending balance: $" + dollar.format(savingsAccount.getAccountBalance()));
}
    
}
