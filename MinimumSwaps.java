import java.util.Arrays;

class MinimumSwaps {
    
    public static int minSwaps(int[] arr) {
        int n = arr.length;
        int[][] pair = new int[n][2];
        for (int i = 0; i < n; i++) {
            pair[i][0] = arr[i];
            pair[i][1] = i;
        }
        Arrays.sort(pair, (a, b) -> Integer.compare(a[0], b[0]));

        boolean[] visited = new boolean[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i] || pair[i][1] == i) {
                continue;
            }
            int cycleSize = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;
                j = pair[j][1];
                cycleSize++;
            }
            if (cycleSize > 0) {
                ans += (cycleSize - 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 8, 5, 4};
        System.out.println("Test 1 Output: " + minSwaps(arr1)); 
        int[] arr2 = {10, 19, 6, 3, 5};
        System.out.println("Test 2 Output: " + minSwaps(arr2)); 
        int[] arr3 = {1, 3, 4, 5, 6};
        System.out.println("Test 3 Output: " + minSwaps(arr3)); 
    }
}
