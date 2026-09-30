import java.util.ArrayList;
import java.util.HashSet;

public class MissingInSecondArray {
    public static ArrayList<Integer> findMissing(int[] a, int[] b) {
        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> setB = new HashSet<>();
        
        for (int num : b) {
            setB.add(num);
        }
        
        for (int num : a) {
            if (!setB.contains(num)) {
                result.add(num);
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 10};
        int[] b = {2, 3, 1, 0, 5};
        
        ArrayList<Integer> result = findMissing(a, b);
        System.out.println("Output: " + result);
    }
}
