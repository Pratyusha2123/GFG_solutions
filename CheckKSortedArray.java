import java.util.Arrays;

public class CheckKSortedArray {
    public static boolean isKSortedArray(int[] arr, int k) {
        int n = arr.length;
        Element[] aux = new Element[n];
        for (int i = 0; i < n; i++) {
            aux[i] = new Element(arr[i], i);
        }
        Arrays.sort(aux, (a, b) -> Integer.compare(a.val, b.val));
        for (int i = 0; i < n; i++) {
            if (Math.abs(aux[i].originalIndex - i) > k) {
                return false;
            }
        }
        return true;
    }

    private static class Element {
        int val;
        int originalIndex;

        Element(int val, int originalIndex) {
            this.val = val;
            this.originalIndex = originalIndex;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;
        boolean result = isKSortedArray(arr, k);
        System.out.println("Output: " + result);
    }
}
