import java.util.HashMap;

public class LargestSubarrayZeroSum {
    public int maxLen(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            
            if (sum == 0) {
                maxLen = i + 1;
            }
            
            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        
        return maxLen;
    }
    public static void main(String[] args) {
        LargestSubarrayZeroSum solver = new LargestSubarrayZeroSum();
        int[] arr1 = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println("Example 1 Output: " + solver.maxLen(arr1)); 
        int[] arr2 = {2, 10, 4};
        System.out.println("Example 2 Output: " + solver.maxLen(arr2)); 
        int[] arr3 = {1, 0, -4, 3, 1, 0};
        System.out.println("Example 3 Output: " + solver.maxLen(arr3)); 
    }
}
