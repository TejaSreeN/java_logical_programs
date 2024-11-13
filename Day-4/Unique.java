import java.util.HashMap;

 class Unique
 {
    public static void main(String[] args) 
{
        int[] a = {1, 2, 3, 2, 4, 5, 1, 6, 7, 8, 5};

        printUniqueElements(a);
    }

    public static void printUniqueElements(int[] a)
 {
        HashMap<Integer, Integer> elementCount = new HashMap<>();
        for (int num : a)
 {
            elementCount.put(num, elementCount.getOrDefault(num, 0) + 1);
        }

        System.out.println("Unique elements in the array:");
        for (int num : elementCount.keySet()) 
{
            if (elementCount.get(num) == 1) 
{
                System.out.print(num + " ");
            }
        }
    }
}
