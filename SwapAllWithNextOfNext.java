import java.util.Arrays;

class SwapAllWithNextOfNext {
    public static void swapElements(int[] arr) {
        if (arr == null || arr.length < 3) {
            return;
        }

        for (int i = 0; i < arr.length - 2; i++) {
            int temp = arr[i];
            arr[i] = arr[i + 2];
            arr[i + 2] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        swapElements(arr1);
        System.out.println(Arrays.toString(arr1)); 
        int[] arr2 = {2, 4};
        swapElements(arr2);
        System.out.println(Arrays.toString(arr2)); 
    }
}
