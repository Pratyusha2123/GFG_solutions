import java.util.ArrayList;

public class AddingOnes {
    public static ArrayList<Integer> update(int n, int[] updates) {
        int[] arr = new int[n];
        for (int updateVal : updates) {
            arr[updateVal - 1]++;
        }
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];
        }
        ArrayList<Integer> result = new ArrayList<>(n);
        for (int val : arr) {
            result.add(val);
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 3;
        int[] updates = {1, 1, 2, 3};
        ArrayList<Integer> result = update(n, updates);
        System.out.println("Updated array: " + result);
    }
}
