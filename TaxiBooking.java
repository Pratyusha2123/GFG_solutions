class TaxiBooking {

    public static int minTime(int cur, int[] pos, int[] time) {
        long minTime = Long.MAX_VALUE;

        for (int i = 0; i < pos.length; i++) {
            long travelTime = (long) Math.abs(pos[i] - cur) * time[i];
            if (travelTime < minTime) {
                minTime = travelTime;
            }
        }

        return (int) minTime;
    }

    public static void main(String[] args) {
        int cur = 4;
        int[] pos = {1, 5, 6};
        int[] time = {2, 3, 1};
        System.out.println(minTime(cur, pos, time)); // Output: 2
    }
}
