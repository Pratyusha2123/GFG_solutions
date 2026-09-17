import java.util.ArrayList;
import java.util.HashSet;

public class ArrayUnionRunner {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : a) {
            set.add(num);
        }
        for (int num : b) {
            set.add(num);
        }
        return new ArrayList<>(set);
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 1};
        int[] b = {3, 2, 2, 3, 3, 2};

        ArrayList<Integer> result = findUnion(a, b);
        System.out.println("Output Union: " + result); 
    }
}
