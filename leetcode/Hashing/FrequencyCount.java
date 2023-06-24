package leetcode.Hashing;

import java.util.*;

public class FrequencyCount {
    public static List<Integer> findFrequencies(int[] A, int[] B) {
        // Create a HashMap to store the frequency of elements in array A
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Count the frequency of elements in array A
        for (int num : A) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Create a list to store the frequencies of elements in array B
        List<Integer> frequencies = new ArrayList<>();
        
        // Find the frequencies of elements in array B
        for (int num : B) {
            frequencies.add(frequencyMap.getOrDefault(num, 0));
        }
        
        return frequencies;
    }
    
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 2, 1, 3, 4, 5,5,5,5};
        int[] B = {1, 2, 3,4,5};
        
        List<Integer> result = findFrequencies(A, B);
        
        System.out.println("Frequencies: " + result);
    }
}
