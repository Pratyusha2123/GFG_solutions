import java.util.Arrays;

class PairCounter {
    
    public static int countPairs(int[] arr, int target) {
        Arrays.sort(arr);
        
        int left = 0;
        int right = arr.length - 1;
        int count = 0;
        
        while (left < right) {
            if (arr[left] + arr[right] < target) {
                count += (right - left);
                left++;
            } else {
                right--;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {7, 2, 5, 3};
        int target1 = 8;
        System.out.println("Test 1 Output: " + countPairs(arr1, target1)); 
        int[] arr2 = {5, 2, 3, 2, 4, 1};
        int target2 = 5;
        System.out.println("Test 2 Output: " + countPairs(arr2, target2)); 
    }
}
