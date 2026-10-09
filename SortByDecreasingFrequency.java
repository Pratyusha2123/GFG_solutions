import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortByDecreasingFrequency  {
    public List<Integer> sortByFreq(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        
        Collections.sort(list, (a, b) -> {
            int freqA = freqMap.get(a);
            int freqB = freqMap.get(b);
            if (freqA != freqB) {
                return freqB - freqA;
            }
            return a - b;
        });
        
        return new ArrayList<>(list);
    }
    public static void main(String[] args) {
        SortByDecreasingFrequency solver = new SortByDecreasingFrequency();
        int[] arr1 = {5, 5, 4, 6, 4};
        System.out.println("Example 1 Output: " + solver.sortByFreq(arr1)); 
        int[] arr2 = {9, 9, 9, 2, 5};
        System.out.println("Example 2 Output: " + solver.sortByFreq(arr2)); 
    }
}
