import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PairsWithPositiveNegativeValues {

    public static List<Integer> posNegPair(int[] arr) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            int counterpart = -num;
            if (map.getOrDefault(counterpart, 0) > 0) {
                result.add(num);
                result.add(counterpart);
                map.put(counterpart, map.get(counterpart) - 1);
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, -3, 2, 3, 6, -1, -3, 3};
        System.out.println("Output 1: " + posNegPair(arr1));
        int[] arr2 = {4, 8, 9, -4, 1, -1, -8, -9};
        System.out.println("Output 2: " + posNegPair(arr2));
    }
}
