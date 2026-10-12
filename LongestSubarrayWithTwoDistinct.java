import java.util.HashMap;

class LongestSubarrayWithTwoDistinct {
    
    public static int totalElements(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int maxLength = 0;
        
        for (int right = 0; right < arr.length; right++) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            while (map.size() > 2) {
                map.put(arr[left], map.get(arr[left]) - 1);
                if (map.get(arr[left]) == 0) {
                    map.remove(arr[left]);
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 2};
        System.out.println("Test 1 Output: " + totalElements(arr1)); 
        int[] arr2 = {3, 1, 2, 2, 2, 2};
        System.out.println("Test 2 Output: " + totalElements(arr2)); 
    }
}
