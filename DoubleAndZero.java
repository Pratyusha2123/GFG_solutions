import java.util.ArrayList;

class DoubleAndZero {
    
    public static ArrayList<Integer> modifyArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != 0 && arr[i] == arr[i + 1]) {
                arr[i] = 2 * arr[i];
                arr[i + 1] = 0;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (num != 0) {
                result.add(num);
            }
        }
        while (result.size() < n) {
            result.add(0);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 2, 0, 4, 0, 8};
        System.out.println("Test 1 Output: " + modifyArray(arr1)); 
        int[] arr2 = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8};
        System.out.println("Test 2 Output: " + modifyArray(arr2)); 
    }
}
