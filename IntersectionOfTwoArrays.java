import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public ArrayList<Integer> intersect(int[] a, int[] b) {
        HashSet<Integer> setA = new HashSet<>();
        for (int num : a) {
            setA.add(num);
        }
        
        HashSet<Integer> resultSet = new HashSet<>();
        for (int num : b) {
            if (setA.contains(num)) {
                resultSet.add(num);
            }
        }
        
        return new ArrayList<>(resultSet);
    }
    public static void main(String[] args) {
        IntersectionOfTwoArrays solver = new IntersectionOfTwoArrays();

        int[] a1 = {1, 2, 1, 3, 1};
        int[] b1 = {3, 1, 3, 4, 1};
        System.out.println("Example 1 Output: " + solver.intersect(a1, b1)); 
        int[] a2 = {1, 1, 1};
        int[] b2 = {1, 1, 1, 1, 1};
        System.out.println("Example 2 Output: " + solver.intersect(a2, b2)); 
    }
}
