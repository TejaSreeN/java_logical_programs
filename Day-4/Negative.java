import java.util.Scanner;
 class Negative 
{
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) 
{
            arr[i] = sc.nextInt();
        }

        int negativeCount = 0;

        for (int i = 0; i < n; i++)
 {
            if (arr[i] < 0) 
{
                negativeCount++;
            }
        }

        System.out.println("Total negative elements: " + negativeCount);
     }
}
