public class MaximumProductSubarray {
    public static int maxProduct(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;
        int maxSoFar = arr[0];
        int minSoFar = arr[0];
        int result = arr[0];

        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            if (curr < 0) {
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }
            maxSoFar = Math.max(curr, maxSoFar * curr);
            minSoFar = Math.min(curr, minSoFar * curr);
            result = Math.max(result, maxSoFar);
        }

        return result;
    }
    public static void main(String[] args) {
        int[] arr = {-2, 6, -3, -10, 0, 2};
        int maxProd = maxProduct(arr);
        System.out.println("Output: " + maxProd);
    }
}
