import java.util.ArrayList;

public class FirstAndLastUnsorted {
    public static ArrayList<Integer> findIndex(int[] arr, int key) {
        int first = -1;
        int last = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(first);
        result.add(last);

        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 5};
        System.out.println("Output 1: " + findIndex(arr1, 5));
        int[] arr2 = {6, 5, 4, 3, 1, 2};
        System.out.println("Output 2: " + findIndex(arr2, 4));
        int[] arr3 = {7, 8, 6};
        System.out.println("Output 3: " + findIndex(arr3, 2));
    }
}
