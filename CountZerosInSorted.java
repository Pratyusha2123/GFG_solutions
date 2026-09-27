public class CountZerosInSorted {
    
    public static int countZeroes(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int firstZeroIndex = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == 0) {
                firstZeroIndex = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (firstZeroIndex == -1) {
            return 0;
        }
        return arr.length - firstZeroIndex;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1, 1, 1, 1, 1, 0, 0, 0};
        int[] arr2 = {0, 0, 0, 0, 0};

        System.out.println("Zeros in arr1: " + countZeroes(arr1)); 
        System.out.println("Zeros in arr2: " + countZeroes(arr2)); 
    }
}
