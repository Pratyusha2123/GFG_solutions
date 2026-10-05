import java.util.Arrays;

public class MinSumPairs {
    public static long findMinSum(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        
        long sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += Math.abs((long) a[i] - (long) b[i]);
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] a1 = {4, 1, 8, 7};
        int[] b1 = {2, 3, 6, 5};
        System.out.println("Output 1: " + findMinSum(a1, b1)); 
        int[] a2 = {4, 1, 2};
        int[] b2 = {2, 4, 1};
        System.out.println("Output 2: " + findMinSum(a2, b2)); 
    }
}
