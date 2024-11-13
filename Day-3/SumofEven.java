import java.util.Scanner;

public class SumofEven
{
    public static void main(String[] args)
 {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0,i=2;

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        while (i <= n) 
{
            sum += i;
            i += 2;
        }

        System.out.println("Sum of even numbers from 1 to " + n + " is: " + sum);

    }
}