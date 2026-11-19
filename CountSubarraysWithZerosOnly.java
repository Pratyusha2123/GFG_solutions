class CountSubarraysWithZerosOnly {

    public static long countSubarray(int[] arr) {
        long totalCount = 0;
        long zeroStreak = 0;

        for (int num : arr) {
            if (num == 0) {
                zeroStreak++;
                totalCount += zeroStreak;
            } else {
                zeroStreak = 0;
            }
        }

        return totalCount;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 0};
        System.out.println(countSubarray(arr)); // Output: 4
    }
}
