import java.util.ArrayList;

class IndexesOfSubarraySum {

    public static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        long currentSum = 0;
        int start = 0;

        for (int end = 0; end < n; end++) {
            currentSum += arr[end];

            while (currentSum > target && start <= end) {
                currentSum -= arr[start];
                start++;
            }

            if (currentSum == target) {
                result.add(start + 1);
                result.add(end + 1);
                return result;
            }
        }

        result.add(-1);
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 7, 5};
        System.out.println(subarraySum(arr1, 12)); 

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(subarraySum(arr2, 15)); 

        int[] arr3 = {5, 3, 4};
        System.out.println(subarraySum(arr3, 2)); 
    }
}
