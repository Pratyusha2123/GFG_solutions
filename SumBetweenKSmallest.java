import java.util.Arrays;

class SumBetweenKSmallest {
    
    public static int sumBetweenK1K2(int[] arr, int k1, int k2) {
        Arrays.sort(arr);
        
        int sum = 0;
        for (int i = k1; i < k2 - 1; i++) {
            sum += arr[i];
        }
        
        return sum;
    }

    public static void main(String[] args) {
        int[] arr1 = {20, 8, 22, 4, 12, 10, 14};
        int k1_1 = 3, k2_1 = 6;
        System.out.println("Test 1 Output: " + sumBetweenK1K2(arr1, k1_1, k2_1)); 
        int[] arr2 = {1, 2, 3, 4, 5};
        int k1_2 = 1, k2_2 = 5;
        System.out.println("Test 2 Output: " + sumBetweenK1K2(arr2, k1_2, k2_2)); 
        int[] arr3 = {5, 6, 7};
        int k1_3 = 2, k2_3 = 3;
        System.out.println("Test 3 Output: " + sumBetweenK1K2(arr3, k1_3, k2_3)); 
    }
}