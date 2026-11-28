import java.util.Arrays;

class MaximumGap {
    public static int maxDiff(int[] arr) {
        if (arr == null || arr.length < 2) {
            return 0;
        }

        Arrays.sort(arr);
        int maxGap = 0;

        for (int i = 1; i < arr.length; i++) {
            maxGap = Math.max(maxGap, arr[i] - arr[i - 1]);
        }

        return maxGap;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 10, 5};
        System.out.println(maxDiff(arr1)); 

        int[] arr2 = {2, 4, 8, 11};
        System.out.println(maxDiff(arr2)); 

        int[] arr3 = {7};
        System.out.println(maxDiff(arr3));
    }
}
