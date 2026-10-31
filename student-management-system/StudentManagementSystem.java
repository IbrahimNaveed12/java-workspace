import java.util.Scanner;

public class StudentManagementSystem {

    static Scanner sc = new Scanner(System.in);

    // Method 1: Check Marks
    static void checkMarks() {
        System.out.print("Enter marks out of 100: ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Marks!");
        } else {
            System.out.println("Your Marks: " + marks);
        }
    }

    // Method 2: Check Attendance
    static void checkAttendance() {
        System.out.print("Enter total classes: ");
        int total = sc.nextInt();

        System.out.print("Enter attended classes: ");
        int attended = sc.nextInt();

        if (total <= 0 || attended < 0 || attended > total) {
            System.out.println("Invalid Attendance Data!");
        } else {
            double percentage = (attended * 100.0) / total;
            System.out.println("Attendance: " + percentage + "%");
        }
    }

    // Method 3: Calculate Grade
    static void calculateGrade() {
        System.out.print("Enter marks out of 100: ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Marks!");
        } else if (marks >= 80) {
            System.out.println("Grade A");
        } else if (marks >= 70) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else if (marks >= 50) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }
    }

    // Method 4: Display Pattern
    static void displayPattern() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Login System
        int password = 1234;
        int attempts = 0;
        boolean login = false;

        while (attempts < 3) {
            System.out.print("Enter Password: ");
            int input = sc.nextInt();

            if (input == password) {
                login = true;
                System.out.println("Login Successful!");
                break;
            } else {
                attempts++;
                System.out.println("Wrong Password!");
            }
        }

        if (login == false) {
            System.out.println("Access Denied!");
            return;
        }

        // Main Menu
        int choice;

        do {
            System.out.println("\n===== UNIVERSITY SYSTEM =====");
            System.out.println("1. Check Marks");
            System.out.println("2. Check Attendance");
            System.out.println("3. Calculate Grade");
            System.out.println("4. Display Pattern");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                checkMarks();
            } else if (choice == 2) {
                checkAttendance();
            } else if (choice == 3) {
                calculateGrade();
            } else if (choice == 4) {
                displayPattern();
            } else if (choice == 5) {
                System.out.println("Thank you for using University System!");
            } else {
                System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}