import java.util.ArrayList;
import java.util.Arrays;

public class AlternateSort {
    public static ArrayList<Integer> alternateSort(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> result = new ArrayList<>();
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            if (left != right) {
                result.add(arr[right]);
                result.add(arr[left]);
            } else {
                result.add(arr[left]);
            }
            right--;
            left++;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {7, 1, 2, 3, 4, 5, 6}; 
        
        ArrayList<Integer> output = alternateSort(arr);
        
        System.out.println("Output: " + output);
    }
}