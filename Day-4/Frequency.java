import java.util.*;
 class Frequency
 {
    public static void main(String[] args) 
{
        int[] array = {4, 5, 6, 4, 3, 4, 6, 7, 7, 8};
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array)
 {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
            for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet())
 {
            System.out.println("Element " + entry.getKey() + " appears " + entry.getValue() + " times.");
        }
    }
}
