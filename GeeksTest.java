import java.util.ArrayList;
import java.util.Arrays;
class GeeksTest {
    public static void main(String[] args) {
        GeeksTest sol = new GeeksTest();
        
        int[] arr = {7, 98, 56, 43, 45, 23, 12, 8};
        int k = 54;
        
        int[] result = sol.getDigitDiff1AndLessK(arr, k);
        System.out.println("Output: " + Arrays.toString(result));
    }

    public int[] getDigitDiff1AndLessK(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int num : arr) {
            if (num < k && hasAdjacentDiffOne(num)) {
                list.add(num);
            }
        }
        
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
    
    private boolean hasAdjacentDiffOne(int num) {
        if (num < 10) {
            return false;
        }
        
        while (num > 9) {
            int lastDigit = num % 10;
            int secondLastDigit = (num / 10) % 10;
            
            if (Math.abs(lastDigit - secondLastDigit) != 1) {
                return false;
            }
            
            num /= 10;
        }
        
        return true;
    }
}

