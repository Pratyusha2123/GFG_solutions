import java.util.Arrays;

public class SwapAdjacentArray {
    public static void swapElements(int[] arr) {
        for (int i = 0; i + 2 < arr.length; i++) {
            int temp = arr[i];
            arr[i] = arr[i + 2];
            arr[i + 2] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        swapElements(arr1);
        System.out.println("Output 1: " + Arrays.toString(arr1));
        int[] arr2 = {1, 2, 3, 4, 5};
        swapElements(arr2);
        System.out.println("Output 2: " + Arrays.toString(arr2)); 
    }
}
