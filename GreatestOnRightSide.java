import java.util.ArrayList;

public class GreatestOnRightSide {
    public static ArrayList<Integer> nextGreatest(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            result.add(0);
        }
        int maxFromRight = -1;
        for (int i = n - 1; i >= 0; i--) {
            int current = arr[i];
            result.set(i, maxFromRight);
            if (current > maxFromRight) {
                maxFromRight = current;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> result = nextGreatest(arr);
        System.out.println("Next greatest elements: " + result);
    }
}
