class CakeDistributionMaxSweetness {

    public static int maxSweetness(int[] sweetness, int k) {
        int piecesNeeded = k + 1;
        long low = 1;
        long high = 0;

        for (int s : sweetness) {
            high += s;
        }

        long ans = 0;
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

    private static boolean canSplit(int[] sweetness, int piecesNeeded, long minTarget) {
        int pieces = 0;
        long currentSum = 0;

        for (int s : sweetness) {
            currentSum += s;
            if (currentSum >= minTarget) {
                pieces++;
                currentSum = 0;
            }
        }

        return pieces >= piecesNeeded;
    }

    public static void main(String[] args) {
        int[] sweetness1 = {6, 3, 2, 8, 7, 5};
        System.out.println(maxSweetness(sweetness1, 2)); 

        int[] sweetness2 = {1, 2, 4, 7, 3, 6, 9};
        System.out.println(maxSweetness(sweetness2, 3)); 
    }
}
