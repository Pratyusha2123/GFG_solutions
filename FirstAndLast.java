import java.util.ArrayList;

public class FirstAndLast {
    private static int findFirst(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ans = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] == x) {
                ans = mid;
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
    
    private static int findLast(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ans = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(findFirst(arr, x));
        result.add(findLast(arr, x));
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 5, 5, 67, 123, 125};
        int x1 = 5;
        System.out.println("Output 1: " + find(arr1, x1)); 
        int[] arr2 = {1, 3, 5, 5, 5, 7, 123, 125};
        int x2 = 7;
        System.out.println("Output 2: " + find(arr2, x2)); 
        int[] arr3 = {1, 2, 3};
        int x3 = 4;
        System.out.println("Output 3: " + find(arr3, x3)); 
    }
}
