import java.util.Arrays;

class TripletSumZero {
    
    public static boolean findTriplets(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == 0) {
                    return true;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, -1, 2, -3, 1};
        System.out.println("Test 1 Output: " + findTriplets(arr1)); 
        int[] arr2 = {1, 2, 3};
        System.out.println("Test 2 Output: " + findTriplets(arr2)); 
        int[] arr3 = {-5, 3, 2, -1, 0, 1};
        System.out.println("Test 3 Output: " + findTriplets(arr3));
    }
}
