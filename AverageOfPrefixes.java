import java.util.Arrays;

class AverageOfPrefixes {
    
    public static int[] prefixAvg(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            result[i] = (int) (sum / (i + 1));
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        System.out.println("Test 1 Output: " + Arrays.toString(prefixAvg(arr1))); 
        int[] arr2 = {12, 1};
        System.out.println("Test 2 Output: " + Arrays.toString(prefixAvg(arr2))); 
    }
}