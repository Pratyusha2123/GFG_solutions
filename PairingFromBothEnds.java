import java.util.ArrayList;
import java.util.Arrays;

public class PairingFromBothEnds {
    public static ArrayList<ArrayList<Integer>> arrayOfPairs(int[] arr) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            ArrayList<Integer> pair = new ArrayList<>(Arrays.asList(arr[left], arr[right]));
            result.add(pair);
            left++;
            right--;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; 
        ArrayList<ArrayList<Integer>> result = arrayOfPairs(arr);
        System.out.println("Output: " + result);
    }
}
