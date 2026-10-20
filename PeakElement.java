class PeakElement {
    
    public static int peakElement(int[] arr) {
        int n = arr.length;
        int low = 0, high = n - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            boolean leftCheck = (mid == 0) || (arr[mid] > arr[mid - 1]);
            boolean rightCheck = (mid == n - 1) || (arr[mid] > arr[mid + 1]);
            
            if (leftCheck && rightCheck) {
                return mid;
            } else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 7, 8, 3};
        System.out.println("Test 1 Peak Index: " + peakElement(arr1));
        int[] arr2 = {10, 20, 15, 2, 23, 90, 80};
        System.out.println("Test 2 Peak Index: " + peakElement(arr2)); 
    }
}
