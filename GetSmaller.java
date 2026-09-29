import java.util.ArrayList;

public class GetSmaller {
    public static ArrayList<Integer> getSmaller(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int val : arr) {
            if (val < target) {
                result.add(val);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {54, 43, 2, 1, 5};
        int x = 7;
        
        ArrayList<Integer> result = getSmaller(arr, x);
        System.out.println("Output: " + result);
    }
}
