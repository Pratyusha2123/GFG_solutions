import java.util.Arrays;

public class MinimizeSumOfProduct {
    
    public static int minProductSum(int[] a, int[] b) {
        int n = a.length;
        Arrays.sort(a);
        Arrays.sort(b);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i] * b[n - 1 - i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] a1 = {3, 1, 1};
        int[] b1 = {6, 5, 4};

        int[] a2 = {6, 1, 9, 5, 4};
        int[] b2 = {3, 4, 8, 2, 4};

        System.out.println("Minimum sum of product for example 1: " + minProductSum(a1, b1)); 
        System.out.println("Minimum sum of product for example 2: " + minProductSum(a2, b2)); 
    }
}

