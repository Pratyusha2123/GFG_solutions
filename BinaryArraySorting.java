import java.util.Arrays;

class BinaryArraySorting {
    
    public static void binSort(int[] arr) {
        int zeroCount = 0;
        for (int num : arr) {
            if (num == 0) {
                zeroCount++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i < zeroCount) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 0, 1, 1, 0};
        binSort(arr1);
        System.out.println("Test 1 Output: " + Arrays.toString(arr1)); 
        int[] arr2 = {1, 0, 1, 1, 1, 1, 1, 0, 0, 0};
        binSort(arr2);
        System.out.println("Test 2 Output: " + Arrays.toString(arr2)); 
        int[] arr3 = {1, 1, 1, 1};
        binSort(arr3);
        System.out.println("Test 3 Output: " + Arrays.toString(arr3)); 
    }
}
