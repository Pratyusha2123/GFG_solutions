import java.util.HashMap;
import java.util.Map;

class CountPairsWithZeroXOR {
    
    public static long countPairs(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        long count = 0;
        
        for (int num : arr) {
            count += map.getOrDefault(num, 0);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 1, 4};
        System.out.println(countPairs(arr)); 
    }
}