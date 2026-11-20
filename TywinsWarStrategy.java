import java.util.Arrays;

class TywinsWarStrategy {

    public static int minSoldiers(int[] arr, int k) {
        int n = arr.length;
        int target = (n + 1) / 2; 
        int[] costs = new int[n];

        for (int i = 0; i < n; i++) {
            int rem = arr[i] % k;
            costs[i] = (rem == 0) ? 0 : (k - rem);
        }

        Arrays.sort(costs);

        int totalSoldiers = 0;
        for (int i = 0; i < target; i++) {
            totalSoldiers += costs[i];
        }

        return totalSoldiers;
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 6, 3, 2, 1};
        System.out.println(minSoldiers(arr1, 2)); 

        int[] arr2 = {3, 5, 6, 7, 9, 10};
        System.out.println(minSoldiers(arr2, 4)); 
    }
}
