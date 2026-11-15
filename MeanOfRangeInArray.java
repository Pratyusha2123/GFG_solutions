import java.util.ArrayList;

class MeanOfRangeInArray {
    
    public static ArrayList<Integer> findMean(int[] arr, int[][] queries) {
        int n = arr.length;
        long[] prefSum = new long[n];
        prefSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefSum[i] = prefSum[i - 1] + arr[i];
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int[] query : queries) {
            int l = query[0];
            int r = query[1];
            
            long sum = (l == 0) ? prefSum[r] : prefSum[r] - prefSum[l - 1];
            int count = (r - l + 1);
            int mean = (int) (sum / count);
            result.add(mean);
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[][] queries = {{0, 2}, {1, 3}, {0, 4}};
        System.out.println(findMean(arr, queries)); 
    }
}