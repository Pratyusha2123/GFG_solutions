public class SplitArrayElements {
    public static int totalCount(int k, int[] arr) {
        int totalParts = 0;
        for (int num : arr) {
            totalParts += (num + k - 1) / k;
        }
        return totalParts;
    }

    public static void main(String[] args) {
        int k1 = 3;
        int[] arr1 = {5, 8, 10, 13};
        System.out.println("Output 1: " + totalCount(k1, arr1)); 

        int k2 = 4;
        int[] arr2 = {10, 2, 3, 4, 7};
        System.out.println("Output 2: " + totalCount(k2, arr2)); 
    }
}
