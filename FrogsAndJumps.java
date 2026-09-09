public class FrogsAndJumps {
    public static int unvisitedLeaves(int[] arr, int k) {
        boolean[] visited = new boolean[k + 1];

        for (int strength : arr) {
            if (strength > k) {
                continue;
            }
            if (visited[strength]) {
                continue;
            }
            for (int j = strength; j <= k; j += strength) {
                visited[j] = true;
            }
        }
        int unvisitedCount = 0;
        for (int i = 1; i <= k; i++) {
            if (!visited[i]) {
                unvisitedCount++;
            }
        }

        return unvisitedCount;
    }
    public static void main(String[] args) {
        int[] arr1 = {3, 2, 4};
        int k1 = 4;
        System.out.println("Output 1: " + unvisitedLeaves(arr1, k1)); 
        int[] arr2 = {1, 3, 5};
        int k2 = 6;
        System.out.println("Output 2: " + unvisitedLeaves(arr2, k2)); 
    }
}
