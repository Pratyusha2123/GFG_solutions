import java.util.Arrays;
import java.util.Collections;

class PermuteArraysForSumThreshold {
    
    public static boolean isPossible(int k, Integer[] a, Integer[] b) {
        int n = a.length;
        if (b.length != n) return false;
        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            if (a[i] + b[i] < k) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        int k = 10;
        Integer[] a = {2, 1, 3};
        Integer[] b = {7, 8, 9};
        System.out.println(isPossible(k, a, b)); 
    }
}
