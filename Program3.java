import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (a): ");
        int a = sc.nextInt();

        
        if (a % 2 == 0) {
            a = a - 1;
        }

        // Generate series
        System.out.print("Output: ");
        for (int i = 1; i <= a; i++) {
            int oddNumber = 2 * i - 1; 
            System.out.print(oddNumber);
            if (i < a) {
                System.out.print(", "); 
            }
        }

        sc.close();
    }
}
