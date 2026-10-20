import java.math.BigInteger;
import java.util.Arrays;

class MinSumPair {
    public static String minSum(int[] arr) {
        Arrays.sort(arr);
        
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sb1.append(arr[i]);
            } else {
                sb2.append(arr[i]);
            }
        }
        BigInteger num1 = new BigInteger(sb1.length() > 0 ? sb1.toString() : "0");
        BigInteger num2 = new BigInteger(sb2.length() > 0 ? sb2.toString() : "0");
        
        return num1.add(num2).toString();
    }

    public static void main(String[] args) {
        int[] arr1 = {6, 8, 4, 5, 2, 3};
        System.out.println("Test 1 Output: " + minSum(arr1)); 
        int[] arr2 = {5, 3, 0, 7, 4};
        System.out.println("Test 2 Output: " + minSum(arr2)); 
        int[] arr3 = {9, 4};
        System.out.println("Test 3 Output: " + minSum(arr3)); 
    }
}
