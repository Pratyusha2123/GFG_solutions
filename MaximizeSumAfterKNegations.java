import java.util.Arrays;

public class MaximizeSumAfterKNegations {
    public static int maximizeSum(int[] arr, int k) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length && k > 0; i++) {
            if (arr[i] < 0) {
                arr[i] = -arr[i];
                k--;
            }
        }
        int sum = 0;
        int minElem = Integer.MAX_VALUE;
        for (int num : arr) {
            sum += num;
            minElem = Math.min(minElem, num);
        }
        if (k % 2 != 0) {
            sum -= 2 * minElem;
        }

        return sum;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, -3, 4, 5};
        System.out.println("Output 1: " + maximizeSum(arr1, 1)); 
        int[] arr2 = {5, -2, 5, -4, 5, -12, 5, 5, 5, 20};
        System.out.println("Output 2: " + maximizeSum(arr2, 5)); 
    }
}
