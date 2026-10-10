import java.util.Arrays;

public class LargestByConcatenatingArray {
    public String findLargest(int[] arr) {
        String[] strArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            strArr[i] = String.valueOf(arr[i]);
        }
        
        Arrays.sort(strArr, (a, b) -> (b + a).compareTo(a + b));
        
        if (strArr[0].equals("0")) {
            return "0";
        }
        
        StringBuilder result = new StringBuilder();
        for (String s : strArr) {
            result.append(s);
        }
        
        return result.toString();
    }
    public static void main(String[] args) {
        LargestByConcatenatingArray solver = new LargestByConcatenatingArray();
        int[] arr1 = {3, 30, 34, 5, 9};
        System.out.println("Example 1 Output: " + solver.findLargest(arr1)); 
        int[] arr2 = {54, 546, 548, 60};
        System.out.println("Example 2 Output: " + solver.findLargest(arr2)); 
        int[] arr3 = {3, 4, 6, 5, 9};
        System.out.println("Example 3 Output: " + solver.findLargest(arr3)); 
    }
}
