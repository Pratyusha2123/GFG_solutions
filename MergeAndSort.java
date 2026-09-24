import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

class MergeAndSort {
    public ArrayList<Integer> mergeSort(int[] arr1, int[] arr2) {
        Set<Integer> set = new TreeSet<>();
        
        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            set.add(num);
        }  
        return new ArrayList<>(set);
    }
    public static void main(String[] args) {
        MergeAndSort obj = new MergeAndSort();
        int[] arr1 = {11, 1, 8};
        int[] arr2 = {10, 11};
        
        ArrayList<Integer> result = obj.mergeSort(arr1, arr2);
        
        System.out.println("Output: " + result); 
    }
}
