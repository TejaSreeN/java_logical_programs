import java.util.Scanner;
 class Arrayneg 
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
        System.out.println("Negative elements in the array:");
        for (int i = 0; i < n; i++) 
{
            if (arr[i] < 0) 
{
                System.out.print(arr[i] + " ");
            }
        }
    }
}
