import java.util.Scanner;
 class Duplicate
 {
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++)
 {
            arr[i] = scanner.nextInt();
        }
        int duplicateCount = countDuplicates(arr);
        
        System.out.println("Total number of duplicate elements: " + duplicateCount);
    }
    
    public static int countDuplicates(int[] arr)
 {
        HashMap<Integer, Integer> elementCount = new HashMap<>();
        for (int num : arr)
 {
            elementCount.put(num, elementCount.getOrDefault(num, 0) + 1);
        }
        
        int duplicateCount = 0;
        for (int count : elementCount.values())
 {
            if (count > 1)
 {
                duplicateCount++;
            }
        }
    }
}
