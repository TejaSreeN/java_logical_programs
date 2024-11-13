import java.util.Scanner;

public class SumofOdd
 {
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int sum = 0;

        int i = 1; // Start from the first odd number
        while (i <= n) {
            sum += i;
            i += 2;
        }

        System.out.println("Sum of odd numbers from 1 to " + n + " is: " + sum);

    }
}