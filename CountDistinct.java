import java.util.HashSet;

public class CountDistinct {
    public static int countDistinct(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 2, 3, 2};
        System.out.println("Output: " + countDistinct(arr1)); 
        int[] arr2 = {12, 1, 14, 3, 16};
        System.out.println("Output: " + countDistinct(arr2)); 
        int[] arr3 = {1, 1, 1, 1};
        System.out.println("Output: " + countDistinct(arr3)); 
    }
}
