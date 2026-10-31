import java.util.Scanner;

public class ATM {
    static int balance = 5000;
    static Scanner obj = new Scanner(System.in);

    public static void CheckBalance() {
        System.out.println("Your current Bank Balance = " + balance);
    }

    public static void Deposit() {
        int amount;
        System.out.println("Enter Amount to Deposit");
        amount = obj.nextInt();
        while (amount <= 0) {
            System.out.println("Please Enter Amount to Deposit which is greater than 0");
            amount = obj.nextInt();
        }

        balance = balance + amount;
        System.out.println("Amount of Rupees " + amount + " deposited successfully your new balance is " + balance);
    }

    public static void withdraw() {
        int amount;
        System.out.println("Please Enter Amount to Withdraw");
        amount = obj.nextInt();
        while (amount % 500 != 0 || amount <= 0) {
            System.out.println("Please Enter Amount to Withdraw which is a positive multiple of 500");
            amount = obj.nextInt();
        }

        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Amount of Rupees " + amount + " withdrawn successfully your new balance is " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public static void main(String[] args) {
        int choice;
        int correctPin = 1234;
        int attempts = 1;

        System.out.print("Enter your PIN: ");
        int enteredPin = obj.nextInt();

        while (enteredPin != correctPin && attempts < 3) {
            System.out.println("Wrong PIN! Attempts left: " + (3 - attempts));
            System.out.print("Enter again: ");
            enteredPin = obj.nextInt();
            attempts++;
        }

        if (enteredPin != correctPin) {
            System.out.println("Card Blocked! Maximum attempts reached.");
            return;
        }

        System.out.println("PIN Accepted!\n");

        do {
            System.out.println("************** Menu **************");
            System.out.println("1. Check balance");
            System.out.println("2. withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            choice = obj.nextInt();

            if (choice == 1)
                CheckBalance();
            else if (choice == 2)
                withdraw();
            else if (choice == 3)
                Deposit();
            else if (choice == 4)
                System.out.println("Thank you for using the ATM!");
            else
                System.out.println("Invalid");
        } while (choice != 4);
    }
}