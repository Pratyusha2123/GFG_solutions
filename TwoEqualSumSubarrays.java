public class TwoEqualSumSubarrays {
    public static boolean canSplit(int[] arr) {
        long totalsum = 0;
        for (int num : arr) {
            totalsum += num;
        }
        if (totalsum % 2 != 0) {
            return false;
        }
        long leftsum = 0;
        long targetSum = totalsum / 2;
        for (int num : arr) {
            leftsum += num;
            if (leftsum == targetSum) {
                return true;
            }
            if (leftsum > targetSum) {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 5};
        System.out.println("Output 1: " + canSplit(arr1));
        int[] arr2 = {4, 3, 2, 1};
        System.out.println("Output 2: " + canSplit(arr2));
    }
}
