import java.util.ArrayList;
import java.util.Arrays;

public class ClosestPairSum {
    public static ArrayList<Integer> sumClosest(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        if (n < 2) {
            return result;
        }
        Arrays.sort(arr);

        int left = 0;
        int right = n - 1;
        int minDiff = Integer.MAX_VALUE;
        int first = -1, second = -1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            int currDiff = Math.abs(target - sum);

            if (currDiff <= minDiff) {
                if (currDiff < minDiff || (arr[right] - arr[left]) > (second - first)) {
                    minDiff = currDiff;
                    first = arr[left];
                    second = arr[right];
                }
            }

            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        if (first != -1 && second != -1) {
            result.add(first);
            result.add(second);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 30, 20, 5};
        int target1 = 25;
        System.out.println("Output 1: " + sumClosest(arr1, target1));
        int[] arr2 = {5, 2, 7, 1, 4};
        int target2 = 10;
        System.out.println("Output 2: " + sumClosest(arr2, target2));
    }
}
