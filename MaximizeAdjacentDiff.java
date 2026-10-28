import java.util.Arrays;
public class MaximizeAdjacentDiff {
    public static long maxSum(Long[] arr) {
        int n = arr.length;
        if (n == 0) return 0;
        Arrays.sort(arr);
        Long[] rearranged = new Long[n];
        int left = 0;
        int right = n - 1;
        int idx = 0;

        while (left <= right) {
            if (idx % 2 == 0) {
                rearranged[idx++] = arr[left++];
            } else {
                rearranged[idx++] = arr[right--];
            }
        }     
        long totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += Math.abs(rearranged[i] - rearranged[(i + 1) % n]);
        }

        return totalSum;
    }
    public static void main(String[] args) {
        Long[] arr = {4L, 2L, 1L, 8L};
        long maxDiffSum = maxSum(arr);
        System.out.println("Output: " + maxDiffSum);
    }
}

