class SplitArrayLargestSum {
    
    public static int splitArray(int[] arr, int k) {
        int low = 0, high = 0;
        for (int num : arr) {
            low = Math.max(low, num);
            high += num;
        }
        
        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isValid(arr, k, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    
    private static boolean isValid(int[] arr, int k, int maxSum) {
        int subarrays = 1;
        int currentSum = 0;
        
        for (int num : arr) {
            if (currentSum + num > maxSum) {
                subarrays++;
                currentSum = num;
            } else {
                currentSum += num;
            }
        }
        return subarrays <= k;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int k1 = 3;
        System.out.println("Test 1 Output: " + splitArray(arr1, k1)); 
        int[] arr2 = {1, 1, 2};
        int k2 = 2;
        System.out.println("Test 2 Output: " + splitArray(arr2, k2)); 
    }
}
