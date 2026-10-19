class SmallestPositiveMissing {
    
    public static int missingNumber(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, -3, 4, 1, 1, 7};
        System.out.println("Test 1 Output: " + missingNumber(arr1)); 
        int[] arr2 = {5, 3, 2, 5, 1};
        System.out.println("Test 2 Output: " + missingNumber(arr2)); 
        int[] arr3 = {-8, 0, -1, -4, -3};
        System.out.println("Test 3 Output: " + missingNumber(arr3)); 
    }
}
