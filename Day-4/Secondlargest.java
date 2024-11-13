import java.util.Arrays;
 class Secondlargest
 {
    public static void main(String[] args)
 {
        int[] array = {10, 20, 4, 45, 99, 99, 78};
        System.out.println("Second largest element is: " + findSecondLargest(array));
    }
      public static int findSecondLargest(int[] array) 
{
        Arrays.sort(array);
        int largest = array[array.length - 1];
        for (int i = array.length - 2; i >= 0; i--) 
{
            if (array[i] != largest)
 {
                return array[i];
            }
        }
    }
}
