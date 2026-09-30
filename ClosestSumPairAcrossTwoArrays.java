import java.util.ArrayList;

public class ClosestSumPairAcrossTwoArrays {
    public static ArrayList<Integer> findClosestPair(int[] arr1, int[] arr2, int x) {
        int n = arr1.length;
        int m = arr2.length;
        int left = 0;
        int right = m - 1;
        
        int minDiff = Integer.MAX_VALUE;
        int res1 = -1;
        int res2 = -1;
        
        while (left < n && right >= 0) {
            int currentSum = arr1[left] + arr2[right];
            int currentDiff = Math.abs(currentSum - x);
            
            if (currentDiff < minDiff) {
                minDiff = currentDiff;
                res1 = arr1[left];
                res2 = arr2[right];
            }
            
            if (currentSum > x) {
                right--;
            } else {
                left++;
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        result.add(res1);
        result.add(res2);
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 7};
        int[] arr2 = {10, 20, 30, 40};
        int x = 32;
        
        ArrayList<Integer> result = findClosestPair(arr1, arr2, x);
        System.out.println("Output: " + result);
    }
}
