import java.util.HashMap;
import java.util.Map;
public class MaxFrequencyWord {
    public static String maximumFrequency(String s) {
        String[] words = s.trim().split("\\s+");
        Map<String, Integer> freqMap = new HashMap<>();
        int maxFreq = 0;
        
        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
            maxFreq = Math.max(maxFreq, freqMap.get(word));
        }
        
        for (String word : words) {
            if (freqMap.get(word) == maxFreq) {
                return word + " " + maxFreq;
            }
        }
        
        return "";
    }
    public static void main(String[] args) {
        String s = "the devil in the sky";
        String result = maximumFrequency(s);
        System.out.println("Output: " + result);
    }
}

