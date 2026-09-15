public class FirstOccurrence {
    public static int firstSearch(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == k) {
                result = mid;
                high = mid - 1; 
            } else if (arr[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int k1 = 4;
        System.out.println("Output: " + firstSearch(arr1, k1)); 
    }
}
