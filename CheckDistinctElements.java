import java.util.HashSet;
import java.util.Set;

public class CheckDistinctElements {
    public static boolean isDistinct(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num)) {
                return false;
            }
            seen.add(num);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 7};
        boolean result = isDistinct(arr);
        System.out.println(result);
    }
}
