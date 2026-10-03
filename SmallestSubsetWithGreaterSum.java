import java.util.Arrays;

public class SmallestSubsetWithGreaterSum {
    public static int minSubset(int[] arr) {
        int n = arr.length;
        long totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        Arrays.sort(arr);
        long currentSum = 0;
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            currentSum += arr[i];
            count++;
            if (currentSum > totalSum - currentSum) {
                return count;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr1 = {2, 17, 7, 3};
        System.out.println("Output 1: " + minSubset(arr1));
        int[] arr2 = {20, 12, 18, 4};
        System.out.println("Output 2: " + minSubset(arr2));
        int[] arr3 = {1, 1, 1, 1, 10};
        System.out.println("Output 3: " + minSubset(arr3));
    }
}
