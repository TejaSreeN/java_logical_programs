import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {
        // Sample array
        int[] array = {1, 2, 3, 2, 4, 1, 5, 3, 2, 1};
        
        // Create a HashMap to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Traverse the array and count frequencies
        for (int num : array) {
            // If the number is already in the map, increment its count, otherwise add it with a count of 1
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Display the frequency of each element
        System.out.println("Element Frequencies:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

