import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public ArrayList<Integer> frequencyCount(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            result.add(freqMap.getOrDefault(i, 0));
        }
        
        return result;
    }
    public static void main(String[] args) {
        FrequencyCounter solver = new FrequencyCounter();
        int[] arr = {2, 3, 2, 3, 5};

        ArrayList<Integer> output = solver.frequencyCount(arr);
        System.out.println("Output: " + output); 
    }
}
