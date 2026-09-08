public class LowerBoundFinder {
    public static int lowerBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 10, 11, 11, 25};
        System.out.println("Output 1: " + lowerBound(arr, 9));
        System.out.println("Output 2: " + lowerBound(arr, 11));
        System.out.println("Output 3: " + lowerBound(arr, 100)); 
    }
}
