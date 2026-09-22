public class SubarrayFinder {
    public static void main(String[] args) {
        int x1 = 51;
        int[] arr1 = {1, 4, 45, 6, 0, 19};
        System.out.println("Output for Example 1: " + smallestSubWithSum(arr1, x1));
        int x2 = 100;
        int[] arr2 = {1, 10, 5, 2, 7};
        System.out.println("Output for Example 2: " + smallestSubWithSum(arr2, x2));
    }

    public static int smallestSubWithSum(int[] arr, int x) {
        int n = arr.length;
        int minLength = Integer.MAX_VALUE;
        int currentSum = 0;
        int start = 0;

        for (int end = 0; end < n; end++) {
            currentSum += arr[end];
            while (currentSum > x) {
                minLength = Math.min(minLength, end - start + 1);
                currentSum -= arr[start];
                start++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}