import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DistinctWithInsertionsAndDeletions {
    public static List<Integer> getDistinct(int[] arr) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        for (int num : arr) {
            if (num > 0) {
                freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            } else if (num < 0) {
                int target = Math.abs(num);
                if (freqMap.containsKey(target)) {
                    int count = freqMap.get(target);
                    if (count == 1) {
                        freqMap.remove(target);
                    } else {
                        freqMap.put(target, count - 1);
                    }
                }
            }
            result.add(freqMap.size());
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {5, 5, 7, -5, -7, 1, 2, -2}; 
        
        List<Integer> result = getDistinct(arr);
        System.out.println("Output: " + result);
    }
}
