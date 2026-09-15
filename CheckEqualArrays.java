import java.util.HashMap;

public class CheckEqualArrays {
    public static boolean checkEqual(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : b) {
            if (!map.containsKey(num)) {
                return false;
            }
            int count = map.get(num);
            if (count == 1) {
                map.remove(num);
            } else {
                map.put(num, count - 1);
            }
        }
        return map.isEmpty();
    }

    public static void main(String[] args) {
        int[] a1 = {1, 2, 5, 4, 0};
        int[] b1 = {2, 4, 5, 0, 1};
        System.out.println("Output: " + checkEqual(a1, b1)); 
    }
}
