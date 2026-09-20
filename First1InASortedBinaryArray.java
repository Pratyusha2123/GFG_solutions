class First1InASortedBinaryArray {
    public int firstIndex(int arr[]) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == 1) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        First1InASortedBinaryArray obj = new First1InASortedBinaryArray();

        int[] arr1 = {0, 0, 0, 0, 0, 0, 1, 1, 1};
        System.out.println("Output: " + obj.firstIndex(arr1));
        int[] arr2 = {0, 0, 0, 0};
        System.out.println("Output: " + obj.firstIndex(arr2)); 
    }
}
