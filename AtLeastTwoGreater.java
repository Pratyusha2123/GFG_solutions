import java.util.Arrays;

class AtLeastTwoGreater {
    public long[] findElements(long arr[]) {
        Arrays.sort(arr);
        int n = arr.length;
        long[] result = new long[n - 2];
        for (int i = 0; i < n - 2; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        AtLeastTwoGreater obj = new AtLeastTwoGreater();
        long[] arr1 = {2, 8, 7, 1, 5};
        long[] res1 = obj.findElements(arr1);
        System.out.println("Output: " + Arrays.toString(res1)); 

        long[] arr2 = {7, -2, 3, 4, 9, -1};
        long[] res2 = obj.findElements(arr2);
        System.out.println("Output: " + Arrays.toString(res2)); 
    }
}
