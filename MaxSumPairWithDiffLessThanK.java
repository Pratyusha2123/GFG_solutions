import java.util.Arrays;

public class MaxSumPairWithDiffLessThanK {
    public static int sumDiffPairs(int[] arr, int k) {
        Arrays.sort(arr);
        int maxSum = 0;
        int i = arr.length - 1;
        while (i > 0) {
            if (arr[i] - arr[i - 1] < k) {
                maxSum += arr[i] + arr[i - 1];
                i -= 2; 
            } else {
                i--;
            }
        }
        return maxSum;
    }
 public static void main(String[] args) {
        int[] arr1 = {3, 5, 10, 15, 17, 12, 9};
        int k1 = 4;
        System.out.println("Output 1: " + sumDiffPairs(arr1, k1));
        int[] arr2 = {5, 15, 10, 300};
        int k2 = 12;
        System.out.println("Output 2: " + sumDiffPairs(arr2, k2));
    }
}
