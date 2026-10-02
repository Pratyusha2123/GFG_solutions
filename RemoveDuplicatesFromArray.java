import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesFromArray {
    public static ArrayList<Integer> remDuplicate(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (!seen.contains(num)) {
                seen.add(num);
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 2, 3, 3, 7, 5};
        System.out.println("Output 1: " + remDuplicate(arr1));
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println("Output 2: " + remDuplicate(arr2));
    }
}