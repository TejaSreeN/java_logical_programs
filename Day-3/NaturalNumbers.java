import java.util.Scanner;

public class NaturalNumbers 
{
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int i = 1;
        while (i <= n) 
{
            System.out.print(i + " ");
            i++;
        }

    }
}