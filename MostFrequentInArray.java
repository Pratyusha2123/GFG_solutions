import java.util.HashMap;
import java.util.Map;

class MostFrequentInArray {
    
    public static int mostFreqEle(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        int maxFreq = 0;
        int result = Integer.MIN_VALUE;
        
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            
            if (count > maxFreq) {
                maxFreq = count;
                result = num;
            } else if (count == maxFreq) {
                result = Math.max(result, num);
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 4, 1};
        System.out.println(mostFreqEle(arr)); 
    }
}
