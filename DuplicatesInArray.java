import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class DuplicatesInArray {
    
    public static List<Integer> findDuplicates(int[] arr) {
        Map<Integer, Integer> counts = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int num : arr) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        for (int num : arr) {
            if (counts.containsKey(num) && counts.get(num) > 1) {
                result.add(num);
                counts.remove(num); 
            }
        }
        if (result.isEmpty()) {
            result.add(-1);
        }
        
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2};
        System.out.println(findDuplicates(arr)); 
    }
}
