import java.util.Arrays;

public class ReplaceWithXOROfAdjacent {
    public static void replaceElements(int[] arr) {
        int n = arr.length;
        if (n <= 1) return;

        int prev = arr[0];
        arr[0] = arr[0] ^ arr[1];

        for (int i = 1; i < n - 1; i++) {
            int current = arr[i];
            arr[i] = prev ^ arr[i + 1];
            prev = current;
        }

        arr[n - 1] = prev ^ arr[n - 1];
    }
    public static void main(String[] args) {
        int[] arr1 = {2, 1, 4, 7};
        replaceElements(arr1);
        System.out.println("Output 1: " + Arrays.toString(arr1)); 
        int[] arr2 = {5, 9, 2, 6, 7};
        replaceElements(arr2);
        System.out.println("Output 2: " + Arrays.toString(arr2)); 
    }
}
