import java.util.HashMap;
import java.util.Map;

class HighestLowestFreq {
    public int findDiff(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        if (freqMap.size() <= 1) {
            return 0;
        }
        
        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;

        for (int count : freqMap.values()) {
            maxFreq = Math.max(maxFreq, count);
            minFreq = Math.min(minFreq, count);
        }
        
        return maxFreq - minFreq;
    }

    public static void main(String[] args) {
        HighestLowestFreq obj = new HighestLowestFreq();
        int[] arr = {7, 8, 4, 5, 4, 1, 1, 7, 7, 2, 5};
        
        int result = obj.findDiff(arr);
        System.out.println("Difference: " + result); 
    }
}