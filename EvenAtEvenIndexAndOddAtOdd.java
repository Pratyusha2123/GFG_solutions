import java.util.Arrays;

public class EvenAtEvenIndexAndOddAtOdd {
    public static int[] reArrange(int[] arr) {
        int n = arr.length;
        int evenIndex = 0;
        int oddIndex = 1;
        while (evenIndex < n && oddIndex < n) {
            while (evenIndex < n && arr[evenIndex] % 2 == 0) {
                evenIndex += 2;
            }
            while (oddIndex < n && arr[oddIndex] % 2 != 0) {
                oddIndex += 2;
            }
            if (evenIndex < n && oddIndex < n) {
                int temp = arr[evenIndex];
                arr[evenIndex] = arr[oddIndex];
                arr[oddIndex] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 12, 1, 5, 8};
        int[] result = reArrange(arr);
        System.out.println(Arrays.toString(result));
    }
}
