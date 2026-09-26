public class RotateArray {
    public static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d % n; 
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }
    private static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int d1 = 2;
        rotateArr(arr1, d1);
        System.out.print("Rotated arr1: ");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println(); 

        int[] arr2 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int d2 = 3;
        rotateArr(arr2, d2);
        System.out.print("Rotated arr2: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println(); 
    }
}
