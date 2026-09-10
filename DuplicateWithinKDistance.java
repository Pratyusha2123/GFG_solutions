import java.util.HashSet;

public class DuplicateWithinKDistance {
    public static boolean checkDuplicatesWithinK(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return true;
            }
            set.add(arr[i]);
            if (i >= k) {
                set.remove(arr[i - k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 4, 5, 1};
        int k1 = 3;
        System.out.println("Output 1: " + checkDuplicatesWithinK(arr1, k1)); 

        int[] arr2 = {10, 2, 3, 4, 10, 5};
        int k2 = 3;
        System.out.println("Output 2: " + checkDuplicatesWithinK(arr2, k2)); 

        int[] arr3 = {6, 8, 4, 1, 8, 5, 7};
        int k3 = 3;
        System.out.println("Output 3: " + checkDuplicatesWithinK(arr3, k3)); 
    }
}
