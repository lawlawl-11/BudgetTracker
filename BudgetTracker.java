package main;

import java.util.Scanner;

import components.Account;
import components.Expenses;
import components.CheckingExpenses;
import components.UserAccounts;

public class BudgetTracker{
    private static final Scanner sc = new Scanner(System.in);
    private static final Bank bank = new Bank();

    public static void main(String[] args) {
        int choice;
        
        do {
            System.out.println("\n=== BUDGET TRACKER SYSTEM ===");
            System.out.println("[1] Add Account");
            System.out.println("[2] Open Account");
            System.out.println("[3] Add Expenses");
            System.out.println("[4] Add Budget");
            System.out.println("[5] View Budget");
            System.out.println("[6] View Expenses");
            System.out.println("[7] View All Accounts");
            System.out.println("[0] Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addAccount();
                    break;

                case 2:
                    openAccount();
                    break;

                case 3:
                    addExpenses();
                    break;

                case 4:
                    addBudget();
                    break;

                case 5:
                    viewBudget();
                    break;

                case 6:
                    viewExpenses();
                    break;

                case 7:
                    bank.showAllAccount();
                    break;

                case 0:
                    System.out.println("Exiting system... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            

