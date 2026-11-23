class CakeDistributionProblem {

    private static boolean canSplit(int[] sweetness, int piecesNeeded, long minTarget) {
        long currentSum = 0;
        int pieces = 0;

        for (int chunk : sweetness) {
            currentSum += chunk;
            if (currentSum >= minTarget) {
                pieces++;
                currentSum = 0;
            }
        }

        return pieces >= piecesNeeded;
    }

    public static int maxSweetness(int[] sweetness, int k) {
        int piecesNeeded = k + 1;
        long low = Integer.MAX_VALUE;
        long high = 0;

        for (int chunk : sweetness) {
            if (chunk < low) {
                low = chunk;
            }
            high += chunk;
        }

        long ans = low;
        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (canSplit(sweetness, piecesNeeded, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return (int) ans;
    }

    public static void main(String[] args) {
        int[] sweetness1 = {6, 3, 2, 8, 7, 5};
        System.out.println(maxSweetness(sweetness1, 2)); 

        int[] sweetness2 = {1, 2, 4, 7, 3, 6, 9};
        System.out.println(maxSweetness(sweetness2, 3)); 
    }
}
