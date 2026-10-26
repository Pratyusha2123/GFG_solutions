import java.util.HashMap;
public class SubarrayCount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1}; 
        int x = 1; 
        int y = 2; 
        
        int count = 0;
        int diff = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        
        for (int num : arr) {
            if (num == x) {
                diff++;
            } else if (num == y) {
                diff--;
            }
            
            if (map.containsKey(diff)) {
                count += map.get(diff);
            }
            
            map.put(diff, map.getOrDefault(diff, 0) + 1);
        }
        
        System.out.println(count);
    }
}
