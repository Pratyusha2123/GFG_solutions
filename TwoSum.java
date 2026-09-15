import java.util.HashSet;

public class TwoSum {
    public boolean twoSum(int[] arr, int target) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        TwoSum solver = new TwoSum();
        int[] arr1 = {0, -1, 2, -3, 1};
        int target1 = -2;
        System.out.println("Output: " + solver.twoSum(arr1, target1)); 
    }
}
