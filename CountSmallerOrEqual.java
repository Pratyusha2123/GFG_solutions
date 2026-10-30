import java.util.ArrayList;
import java.util.Arrays;

class CountSmallerOrEqual {
    
    public static ArrayList<Integer> countElements(int[] a, int[] b, int[] query) {
        int[] sortedB = b.clone();
        Arrays.sort(sortedB);
        
        ArrayList<Integer> result = new ArrayList<>();
        for (int qIndex : query) {
            int x = a[qIndex];
            int count = upperBound(sortedB, x);
            result.add(count);
        }
        
        return result;
    }
    private static int upperBound(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = 0;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= target) {
                ans = mid + 1; 
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {4, 1, 2};
        int[] b = {1, 7, 3};
        int[] query = {0, 1};
        
        System.out.println(countElements(a, b, query));
    }
}