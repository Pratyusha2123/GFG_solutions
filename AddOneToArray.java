import java.util.Vector;
public class AddOneToArray {
    public static Vector<Integer> addOne(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                Vector<Integer> result = new Vector<>();
                for (int num : arr) {
                    result.add(num);
                }
                return result;
            }
            arr[i] = 0;
        }
        Vector<Integer> result = new Vector<>();
        result.add(1);
        for (int num : arr) {
            result.add(num);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {5, 6, 7, 8};
        System.out.println("Output 1: " + addOne(arr1));
        int[] arr2 = {9, 9, 9};
        System.out.println("Output 2: " + addOne(arr2)); 
    }
}
