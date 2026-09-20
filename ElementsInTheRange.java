import java.util.HashSet;
import java.util.Set;

class ElementsInTheRange {
    public boolean checkElements(int start, int end, int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        for (int i = start; i <= end; i++) {
            if (!set.contains(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ElementsInTheRange obj = new ElementsInTheRange();
        int start1 = 2, end1 = 5;
        int[] arr1 = {1, 4, 5, 2, 7, 8, 3};
        System.out.println("Output: " + obj.checkElements(start1, end1, arr1)); 
        int start2 = 2, end2 = 6;
        int[] arr2 = {1, 4, 5, 2, 7, 8, 3};
        System.out.println("Output: " + obj.checkElements(start2, end2, arr2)); 
    }
}
