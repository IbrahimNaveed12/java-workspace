import java.util.Scanner;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a Starting range:");
        int start = obj.nextInt();

        System.out.println("Enter a Ending range:");
        int end = obj.nextInt();

        if (start < 0 || end < 0 || start >= end) {
            System.out.println("Invalid input! Numbers cannot be negative, and starting number must be less than ending number.");
            return;
        }

        int totalPrimes = 0;

        System.out.println("Prime Numbers:");

        for (int i = start; i <= end; i++) {
            if (i <= 1) {
                continue;
            }

            int count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(i);
                totalPrimes++;
            }
        }

        System.out.println("The no of Prime Numbers in this Range are " + totalPrimes);
    }
}