import java.util.Arrays;

public class CheckForFourSum {
    public static boolean fourSum(int[] arr, int x) {
        int n = arr.length;
        if (n < 4) return false;
        Arrays.sort(arr);
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                int left = j + 1;
                int right = n - 1;
                while (left < right) {
                    long sum = (long) arr[i] + arr[j] + arr[left] + arr[right];
                    if (sum == x) {
                        return true;
                    } else if (sum < x) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 1, 0, 6, 0};
        int x1 = 7;
        System.out.println("Output 1: " + fourSum(arr1, x1));
        int[] arr2 = {1, 2, 3, 4, 5};
        int x2 = 50;
        System.out.println("Output 2: " + fourSum(arr2, x2));
    }
}
