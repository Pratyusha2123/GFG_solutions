import java.util.Map;
import java.util.HashMap;

public class PairsWithDifference {
    public static int countPairs(int[] arr, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();
            if (freqMap.containsKey(num + k)) {
                count += freq * freqMap.get(num + k);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 1, 4, 5};
        int k1 = 3;
        System.out.println("Output 1: " + countPairs(arr1, k1)); 

        int[] arr2 = {8, 16, 12, 16, 4, 0};
        int k2 = 4;
        System.out.println("Output 2: " + countPairs(arr2, k2)); 
    }
}
