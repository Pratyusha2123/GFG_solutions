import java.util.Arrays;

class ReverseArrayInGroups {
    public void reverseInGroups(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i < n; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        ReverseArrayInGroups obj = new ReverseArrayInGroups();

        // Test Case 1
        int[] arr1 = {1, 2, 3, 4, 5};
        int k1 = 3;
        obj.reverseInGroups(arr1, k1);
        System.out.println("Output: " + Arrays.toString(arr1)); 
        int[] arr2 = {5, 6, 8, 9};
        int k2 = 5;
        obj.reverseInGroups(arr2, k2);
        System.out.println("Output: " + Arrays.toString(arr2)); 
    }
}
