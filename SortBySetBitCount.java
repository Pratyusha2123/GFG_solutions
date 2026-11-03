import java.util.ArrayList;
import java.util.Arrays;

class SortBySetBitCount {
    
    public static ArrayList<Integer> sortBySetBitCount(int[] arr) {
        int n = arr.length;
        Integer[] temp = new Integer[n];
        
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }
        Arrays.sort(temp, (a, b) -> {
            int countA = Integer.bitCount(a);
            int countB = Integer.bitCount(b);
            return Integer.compare(countB, countA);
        });
        
        return new ArrayList<>(Arrays.asList(temp));
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 9, 4, 6, 7, 15, 32};
        System.out.println(sortBySetBitCount(arr)); 
    }
}