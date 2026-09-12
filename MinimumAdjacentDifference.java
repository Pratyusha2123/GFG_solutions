public class MinimumAdjacentDifference {
    public static int minAdjDiff(int[] arr) {
        int n = arr.length;
        int minDiff = Math.abs(arr[0] - arr[n - 1]);
        
        for (int i = 0; i < n - 1; i++) {
            int diff = Math.abs(arr[i] - arr[i + 1]);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        
        return minDiff;
    }

    public static void main(String[] args) {
        int[] arr = {8, -8, 9, -9, 10, -11, 12};
        int result = minAdjDiff(arr);
        System.out.println("Output: " + result);
    }
}
