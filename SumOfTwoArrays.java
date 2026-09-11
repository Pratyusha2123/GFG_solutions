import java.util.ArrayList;
import java.util.Collections;

public class SumOfTwoArrays {
    public static ArrayList<Integer> addArrays(int[] arr1, int[] arr2) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += arr1[i];
                i--;
            }
            if (j >= 0) {
                sum += arr2[j];
                j--;
            }
            result.add(sum % 10);
            carry = sum / 10;
        }
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 6, 3};
        int[] arr2 = {8, 4, 2};
        ArrayList<Integer> result = addArrays(arr1, arr2);
        System.out.println("Sum of arrays: " + result);
    }
}
