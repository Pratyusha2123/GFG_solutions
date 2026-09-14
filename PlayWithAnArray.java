import java.util.Arrays;

public class PlayWithAnArray {
    public static boolean formatArray(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int[] result = new int[n];
        int smallPtr = 0;
        int largePtr = (n + 1) / 2;
        
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result[i] = arr[smallPtr++];
            } else {
                result[i] = arr[largePtr++];
            }
        }
        
        for (int i = 0; i < n; i++) {
            arr[i] = result[i];
        }
        
        for (int i = 1; i < n; i += 2) {
            if (arr[i] <= arr[i - 1])
                return false;
        }
        
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        boolean result = formatArray(arr);
        System.out.println(result);
    }
}
