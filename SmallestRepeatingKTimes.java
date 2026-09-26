import java.util.HashMap;
import java.util.Map;

public class SmallestRepeatingKTimes {
    
    public static int findDuplicate(int[] arr, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        int result = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == k) {
                result = Math.min(result, entry.getKey());
            }
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 2, 1, 3, 1};
        int k1 = 2;
        System.out.println("Output 1: " + findDuplicate(arr1, k1)); 

        int[] arr2 = {3, 5, 3, 2};
        int k2 = 1;
        System.out.println("Output 2: " + findDuplicate(arr2, k2));
    }
}

