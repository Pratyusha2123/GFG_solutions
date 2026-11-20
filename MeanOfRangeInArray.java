import java.util.ArrayList;

class MeanOfRangeInArray {

    public static ArrayList<Integer> findMean(int[] arr, int[][] queries) {
        int n = arr.length;
        long[] prefixSum = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + arr[i];
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int[] query : queries) {
            int l = query[0];
            int r = query[1];
            long sum = prefixSum[r + 1] - prefixSum[l];
            int count = r - l + 1;
            result.add((int) (sum / count));
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[][] queries = {{0, 2}, {1, 3}, {0, 4}};
        System.out.println(findMean(arr, queries)); 
    }
}