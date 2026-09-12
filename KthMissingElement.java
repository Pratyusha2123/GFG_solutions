public class KthMissingElement {
    public static int kthMissing(int[] arr, int k) {
        int n = arr.length;
        int missingCount = 0;
        
        for (int i = 0; i < n - 1; i++) {
            int diff = arr[i + 1] - arr[i] - 1;
            
            if (missingCount + diff >= k) {
                return arr[i] + (k - missingCount);
            }
            
            missingCount += diff;
        }
        
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 7};
        int k = 2;
        int result = kthMissing(arr, k);
        System.out.println("Output: " + result);
    }
}
