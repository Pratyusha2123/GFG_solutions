import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class TopKFrequentArray {
    
    public static ArrayList<Integer> topKFreq(int[] arr, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> {
            int freqA = freqMap.get(a);
            int freqB = freqMap.get(b);
            if (freqA != freqB) {
                return freqB - freqA; 
            }
            return b - a; 
        });
        maxHeap.addAll(freqMap.keySet());
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(maxHeap.poll());
        }
        
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {3, 1, 4, 4, 5, 2, 6, 1};
        int k1 = 2;
        System.out.println("Test 1 Output: " + topKFreq(arr1, k1)); 
        int[] arr2 = {7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9};
        int k2 = 4;
        System.out.println("Test 2 Output: " + topKFreq(arr2, k2)); 
    }
}
