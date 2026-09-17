import java.util.Arrays;
public class MaxValuePermutationRunner {
    public int maxValue(int arr[]) {
        int mod = 1000000007;
        Arrays.sort(arr);
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = (sum + (long) arr[i] * i) % mod;
        }
        return (int) sum;
    }
    public static void main(String[] args) {
        MaxValuePermutationRunner solver = new MaxValuePermutationRunner();
        int[] arr = {5, 3, 2, 4, 1};

        int result = solver.maxValue(arr);
        System.out.println("Output: " + result); 
    }
}
