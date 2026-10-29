public class MinimizeMaxDistance {
    public static double minMaxDist(int[] stations, int k) {
        int n = stations.length;
        double low = 0.0;
        double high = 0.0;

        for (int i = 0; i < n - 1; i++) {
            high = Math.max(high, stations[i + 1] - stations[i]);
        }
        double diff = 1e-6;
        while (high - low > diff) {
            double mid = low + (high - low) / 2.0;

            if (isPossible(stations, k, mid)) {
                high = mid;
            } else {
                low = mid;
            }
        }
        return high;
    }
    private static boolean isPossible(int[] stations, int k, double maxDist) {
        int requiredStations = 0;

        for (int i = 0; i < stations.length - 1; i++) {
            double gap = stations[i + 1] - stations[i];
            requiredStations += (int) (gap / maxDist);
        }
        return requiredStations <= k;
    }
    public static void main(String[] args) {
        int[] stations = {1, 2, 3, 4, 5};
        int k = 2;
        double result = minMaxDist(stations, k);
        System.out.printf("Output: %.2f\n", result);
    }
}