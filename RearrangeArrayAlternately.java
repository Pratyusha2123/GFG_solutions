import java.util.Arrays;

public class RearrangeArrayAlternately {
    public void rearrange(int[] arr) {
        int n = arr.length;
        if (n <= 1) return;
        
        int minIdx = 0;
        int maxIdx = n - 1;
        int maxElem = arr[n - 1] + 1;
        
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] += (arr[maxIdx] % maxElem) * maxElem;
                maxIdx--;
            } else {
                arr[i] += (arr[minIdx] % maxElem) * maxElem;
                minIdx++;
            }
        }
        
        for (int i = 0; i < n; i++) {
            arr[i] /= maxElem;
        }
    }

    public static void main(String[] args) {
        RearrangeArrayAlternately solver = new RearrangeArrayAlternately();
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        solver.rearrange(arr1);
        System.out.println("Example 1 Output: " + Arrays.toString(arr1)); 
        int[] arr2 = {1, 2};
        solver.rearrange(arr2);
        System.out.println("Example 2 Output: " + Arrays.toString(arr2)); 
    }
}
