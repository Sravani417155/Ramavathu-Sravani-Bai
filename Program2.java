// Program-2.java
// Problem Statement: Generate a series of odd numbers until 'a' terms.
// Language: Java

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number (a): ");
        int a = sc.nextInt();

        // Generate series
        System.out.print("Output: ");
        for (int i = 1; i <= a; i++) {
            int oddNumber = 2 * i - 1; // Formula for nth odd number
            System.out.print(oddNumber);
            if (i < a) {
                System.out.print(", "); // Add comma except after last number
            }
        }

        sc.close();
    }
}
