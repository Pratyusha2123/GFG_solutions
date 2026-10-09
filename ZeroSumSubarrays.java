import java.util.HashMap;

public class ZeroSumSubarrays {
    public int findSubarray(int[] arr) {
        int count = 0;
        int prefixSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        
        for (int num : arr) {
            prefixSum += num;
            if (map.containsKey(prefixSum)) {
                count += map.get(prefixSum);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        
        return count;
    }
    public static void main(String[] args) {
        ZeroSumSubarrays solver = new ZeroSumSubarrays();
        int[] arr1 = {0, 0, 5, 5, 0, 0};
        System.out.println("Example 1 Output: " + solver.findSubarray(arr1)); 
        int[] arr2 = {6, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        System.out.println("Example 2 Output: " + solver.findSubarray(arr2)); 
        int[] arr3 = {0};
        System.out.println("Example 3 Output: " + solver.findSubarray(arr3)); 
    }
}
