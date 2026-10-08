public class MaxSubarraySumLimitedByK {
public int maxSum(int[] arr, int k) {
        int maxAccumulatedSum = 0;
        int currentContinuousSum = 0;
        
        for (int num : arr) {
            if (num <= k) {
                currentContinuousSum += num;
                maxAccumulatedSum = Math.max(maxAccumulatedSum, currentContinuousSum);
            } else {
                currentContinuousSum = 0;
            }
        }
        
        return maxAccumulatedSum;
    }
    public static void main(String[] args) {
        MaxSubarraySumLimitedByK solver = new MaxSubarraySumLimitedByK();
        int k1 = 1;
        int[] arr1 = {3, 2, 2, 3, 1, 1, 1, 3};
        System.out.println("Example 1 Output: " + solver.maxSum(arr1, k1)); 
        int k2 = 2;
        int[] arr2 = {3, 2, 2, 3, 1, 1, 1, 3};
        System.out.println("Example 2 Output: " + solver.maxSum(arr2, k2)); 

    }
}
