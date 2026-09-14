import java.util.ArrayList;
import java.util.Arrays;

public class MaximumNumberOfZeroes {
    public static String maxZero(ArrayList<String> arr) {
        String result = "-1";
        int maxZeroes = 0;
        for (String numStr : arr) {
            int currentZeroes = 0;
            for (int i = 0; i < numStr.length(); i++) {
                if (numStr.charAt(i) == '0') {
                    currentZeroes++;
                }
            }
            if (currentZeroes > 0) {
                if (currentZeroes > maxZeroes) {
                    maxZeroes = currentZeroes;
                    result = numStr;
                } else if (currentZeroes == maxZeroes) {
                    if (compareNumbers(numStr, result) > 0) {
                        result = numStr;
                    }
                }
            }
        }
        return result;
    }
    
    private static int compareNumbers(String a, String b) {
        if (a.length() != b.length()) {
            return a.length() - b.length();
        }
        return a.compareTo(b);
    }

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("10", "20", "3000", "9999", "200"));
        String result = maxZero(arr);
        System.out.println(result);
    }
}
