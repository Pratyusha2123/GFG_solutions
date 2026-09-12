import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortedInTwoSwaps {
    public static boolean checkSorted(List<Integer> arr) {
        int count = 0;
        int n = arr.size();
        int i = 0;
        while (i < n) {
            int correctIdx = arr.get(i) - 1;
            if (arr.get(i) != arr.get(correctIdx)) {
                int temp = arr.get(i);
                arr.set(i, arr.get(correctIdx));
                arr.set(correctIdx, temp);
                count++;
            } else {
                i++;
            }
        }
        return count == 0 || count == 2;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(4, 3, 2, 1));
        boolean result = checkSorted(arr);
        System.out.println("Output: " + result);
    }
}