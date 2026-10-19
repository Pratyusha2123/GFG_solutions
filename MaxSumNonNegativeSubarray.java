import java.util.ArrayList;

class MaxSumNonNegativeSubarray {
    public static ArrayList<Integer> findSubarray(int[] arr) {
        long maxSum = -1;
        long currentSum = 0;
        int start = 0, end = -1;
        int tempStart = 0;
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                currentSum += arr[i];
                int currentLength = i - tempStart + 1;

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    maxLength = currentLength;
                    start = tempStart;
                    end = i;
                } else if (currentSum == maxSum) {
                    if (currentLength > maxLength) {
                        maxLength = currentLength;
                        start = tempStart;
                        end = i;
                    }
                }
            } else {
                currentSum = 0;
                tempStart = i + 1;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        if (maxSum < 0) {
            result.add(-1);
            return result;
        }

        for (int i = start; i <= end; i++) {
            result.add(arr[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, -1, 6};
        System.out.println("Test 1 Output: " + findSubarray(arr1)); 
        int[] arr2 = {-1, 2};
        System.out.println("Test 2 Output: " + findSubarray(arr2)); 
        int[] arr3 = {1, 2, 5, -7, 2, 6};
        System.out.println("Test 3 Output: " + findSubarray(arr3)); 
    }
}
