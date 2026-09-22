import java.util.ArrayList;

public class ValueChecker {
    public static void main(String[] args) {
        int[] arr1 = {15, 2, 45, 4, 7};
        System.out.println("Output for Example 1: " + valEqualtoPos(arr1));
        int[] arr2 = {1};
        System.out.println("Output for Example 2: " + valEqualtoPos(arr2));
    }

    public static ArrayList<Integer> valEqualtoPos(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i + 1) {
                result.add(arr[i]);
            }
        }
        return result;
    }
}
