public class SearchInAKStepArray {
    public static int findStepKeyIndex(int[] arr, int k, int x) {
        int i = 0;
        int n = arr.length;
        while (i < n) {
            if (arr[i] == x) {
                return i;
            }
            int step = Math.max(1, Math.abs(arr[i] - x) / k);
            i += step;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 6, 7, 6};
        int k1 = 1;
        int x1 = 6;
        System.out.println("Output 1: " + findStepKeyIndex(arr1, k1, x1));
        int[] arr2 = {20, 40, 50};
        int k2 = 20;
        int x2 = 70;
        System.out.println("Output 2: " + findStepKeyIndex(arr2, k2, x2));
    }
}
