public class ClosestInSortedArray {
    private static int getClosest(int val1, int val2, int k) {
        int diff1 = Math.abs(k - val1);
        int diff2 = Math.abs(k - val2);

        if (diff1 < diff2) {
            return val1;
        } else if (diff2 < diff1) {
            return val2;
        } else {
            return Math.max(val1, val2);
        }
    }
    public static int findClosest(int[] arr, int k) {
        int n = arr.length;
        if (k <= arr[0]) {
            return arr[0];
        }
        if (k >= arr[n - 1]) {
            return arr[n - 1];
        }

        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == k) {
                return arr[mid];
            }

            if (k < arr[mid]) {
                if (mid > 0 && k > arr[mid - 1]) {
                    return getClosest(arr[mid - 1], arr[mid], k);
                }
                high = mid - 1;
            } else {
                if (mid < n - 1 && k < arr[mid + 1]) {
                    return getClosest(arr[mid], arr[mid + 1], k);
                }
                low = mid + 1;
            }
        }

        return arr[low];
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 6, 7};
        System.out.println("Output 1: " + findClosest(arr1, 4)); 
        int[] arr2 = {1, 2, 3, 5, 6, 8, 9};
        System.out.println("Output 2: " + findClosest(arr2, 4)); 
        int[] arr3 = {6, 8, 8, 8, 9, 11, 13, 13, 15, 18, 19};
        System.out.println("Output 3: " + findClosest(arr3, 10)); 
    }
}
