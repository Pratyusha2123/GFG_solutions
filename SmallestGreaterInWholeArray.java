import java.util.ArrayList;
import java.util.TreeSet;

class SmallestGreaterInWholeArray {
    
    public static ArrayList<Integer> greaterElement(int[] arr) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : arr) {
            set.add(num);
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : arr) {
            Integer higher = set.higher(num);
            if (higher == null) {
                result.add(-10000000); 
            } else {
                result.add(higher);
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {13, 6, 7, 12};
        System.out.println(greaterElement(arr)); 
    }
}