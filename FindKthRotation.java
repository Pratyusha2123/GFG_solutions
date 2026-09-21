class FindKthRotation {
    public int findKRotation(int arr[]) {
        int low = 0;
        int high = arr.length - 1;
        if (arr[low] <= arr[high]) {
            return 0;
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid < high && arr[mid] > arr[mid + 1]) {
                return mid + 1;
            }
            if (mid > low && arr[mid] < arr[mid - 1]) {
                return mid;
            }
            if (arr[mid] >= arr[low]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        FindKthRotation obj = new FindKthRotation();

        int[] arr1 = {5, 1, 2, 3, 4};
        System.out.println("Output: " + obj.findKRotation(arr1)); 
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println("Output: " + obj.findKRotation(arr2)); 
    }
}