import java.util.Scanner;
 class Delete
{
    public static void main(String[] args)
 {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5};
        System.out.print("Original Array: ");
        for (int element : array)
 {
            System.out.print(element + " ");
        }

        System.out.print("\nEnter the position to delete (1 to " + array.length + "): ");
        int position = scanner.nextInt();
        if (position < 1 || position > array.length) 
{
            System.out.println("Invalid position!");
        } 
else {
            int[] newArray = new int[array.length - 1];
            for (int i = 0, j = 0; i < array.length; i++) 
{
                if (i != position - 1) 
{
                    newArray[j++] = array[i];
                }
            }
            System.out.print("Array after deletion: ");
            for (int element : newArray) 
{
                System.out.print(element + " ");
            }
        }
    }
}
