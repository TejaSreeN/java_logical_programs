import java.util.Scanner;
class Maxminarray 
{
    public static void1 main(String[] args)
 {
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        if (n < 1)
 {
            System.out.println("Array should have at least one element.");
        }
 else 
{
            int[] arr = new int[n];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++)
 {
                arr[i] = sc.nextInt();
            }

            int max = arr[0];
            int min = arr[0];

            for (int i = 1; i < n; i++) 
          {
                if (arr[i] > max) 
              {
                    max = arr[i];
              }
           
     if (arr[i] < min) 
              {
                    min = arr[i];
                }
            }

            System.out.println("The maximum element is: " + max);
            System.out.println("The minimum element is: " + min);
        }

    }
}
