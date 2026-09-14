import java.util.Arrays;

public class SortUnsortedSubarray {
    public static int[] findSubarray(int[] arr) {
        int n = arr.length;
        int s = 0, e = n - 1;
        
        for (s = 0; s < n - 1; s++) {
            if (arr[s] > arr[s + 1]) {
                break;
            }
        }
        if (s == n - 1) {
            return new int[]{0, 0};
        }
        
        for (e = n - 1; e > 0; e--) {
            if (arr[e] < arr[e - 1]) {
                break;
            }
        }
        
        int min = arr[s], max = arr[s];
        for (int i = s + 1; i <= e; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        for (int i = 0; i < s; i++) {
            if (arr[i] > min) {
                s = i;
                break;
            }
        }
        
        for (int i = n - 1; i > e; i--) {
            if (arr[i] < max) {
                e = i;
                break;
            }
        }
        
        return new int[]{s, e};
    }

    public static void main(String[] args) {
        int[] arr = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
        int[] result = findSubarray(arr);
        System.out.println(Arrays.toString(result));
    }
}
