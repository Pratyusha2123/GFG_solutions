import java.util.Arrays;

public class MinimumProductOfKElements {
    public int minProduct(int[] arr, int k) {
        long MOD = 1000000007L;
        Arrays.sort(arr);
        long product = 1;
        
        for (int i = 0; i < k; i++) {
            product = (product * arr[i]) % MOD;
        }
        
        return (int) product;
    }
    public static void main(String[] args) {
        MinimumProductOfKElements solver = new MinimumProductOfKElements();

        int[] arr1 = {1, 2, 3, 4, 5};
        int k1 = 2;
        System.out.println("Example 1 Output: " + solver.minProduct(arr1, k1)); 
        int[] arr2 = {9, 10, 8};
        int k2 = 3;
        System.out.println("Example 2 Output: " + solver.minProduct(arr2, k2)); 
    }
}
