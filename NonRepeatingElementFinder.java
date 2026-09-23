import java.util.HashMap;
import java.util.Map;

public class NonRepeatingElementFinder {
    public static int firstNonRepeating(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : arr) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return 0;
    }
    public static void main(String[] args) {

        int[] arr1 = {-1, 2, -1, 3, 2};
        System.out.println("Output for Example 1: " + firstNonRepeating(arr1)); 
        int[] arr2 = {1, 1, 1};
        System.out.println("Output for Example 2: " + firstNonRepeating(arr2)); 
    }
}
