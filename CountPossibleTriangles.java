import java.util.Arrays;

class CountPossibleTriangles {
    public static int countTriangles(int[] arr) {
        int n = arr.length;
        if (n < 3) return 0;
        Arrays.sort(arr);
        int count = 0;
        for (int i = n - 1; i >= 2; i--) {
            int left = 0;
            int right = i - 1;
            while (left < right) {
                if (arr[left] + arr[right] > arr[i]) {
                    count += (right - left);
                    right--;
                } else {
                    left++;
                }
            }
        }
        
        return count;
    }
    public static void main(String[] args) {
        int[] arr1 = {4, 6, 3, 7};
        System.out.println("Test 1 Output: " + countTriangles(arr1)); 
        int[] arr2 = {10, 21, 22, 100, 101, 200, 300};
        System.out.println("Test 2 Output: " + countTriangles(arr2)); 
        int[] arr3 = {1, 2, 3};
        System.out.println("Test 3 Output: " + countTriangles(arr3)); 
    }
}