import java.util.ArrayList;
import java.util.TreeSet;

class DistinctSorted {
    public static ArrayList<Integer> uniqueSorted(int[] arr) {
        TreeSet<Integer> set = new TreeSet<>();
        
        for (int num : arr) {
            set.add(num);
        }
        return new ArrayList<>(set);
    }
    public static void main(String[] args) {
        int[] arr = {3, 3, 2, 2, 1, 4};
        System.out.println(uniqueSorted(arr)); 
    }
}