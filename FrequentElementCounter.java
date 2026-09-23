import java.util.HashMap;
import java.util.Map;

public class FrequentElementCounter { 
    public static int countOccurence(int[] arr, int k) {
        int n = arr.length;
        int threshold = n / k;
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        for (int freq : freqMap.values()) {
            if (freq > threshold) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr1 = {3, 1, 2, 2, 1, 2, 3, 3};
        int k1 = 4;
        System.out.println("Output for Example 1: " + countOccurence(arr1, k1)); 
        int[] arr2 = {2, 3, 3, 2};
        int k2 = 3;
        System.out.println("Output for Example 2: " + countOccurence(arr2, k2)); 
    }
}
