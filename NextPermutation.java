import java.util.Arrays;

public class c {
    public static void nextPermutation(int[] arr) {
        int n = arr.length;
        int index = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            reverse(arr, 0, n - 1);
            return;
        }
        for (int i = n - 1; i > index; i--) {
            if (arr[i] > arr[index]) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                break;
            }
        }
        reverse(arr, index + 1, n - 1);
    }
    
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 1, 7, 5, 0};
        nextPermutation(arr1);
        System.out.println("Output 1: " + Arrays.toString(arr1)); 
        int[] arr2 = {3, 2, 1};
        nextPermutation(arr2);
        System.out.println("Output 2: " + Arrays.toString(arr2)); 

        int[] arr3 = {3, 4, 2, 5, 1};
        nextPermutation(arr3);
        System.out.println("Output 3: " + Arrays.toString(arr3)); 
    }
}

