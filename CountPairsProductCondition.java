import java.util.Arrays;
import java.util.List;

class CountPairsProductCondition {

    public static int countPairs(List<Integer> arr) {
        int n = arr.size();
        if (n <= 1) {
            return 0;
        }

        long[] vals = new long[n];
        for (int i = 0; i < n; i++) {
            vals[i] = (long) i * arr.get(i);
        }

        long[] temp = new long[n];
        return (int) mergeSortAndCount(vals, temp, 0, n - 1);
    }

    private static long mergeSortAndCount(long[] vals, long[] temp, int left, int right) {
        if (left >= right) {
            return 0L;
        }

        int mid = left + (right - left) / 2;
        long count = 0L;

        count += mergeSortAndCount(vals, temp, left, mid);
        count += mergeSortAndCount(vals, temp, mid + 1, right);
        count += merge(vals, temp, left, mid, right);

        return count;
    }

    private static long merge(long[] vals, long[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;
        long inversions = 0L;

        while (i <= mid && j <= right) {
            if (vals[i] <= vals[j]) {
                temp[k++] = vals[i++];
            } else {
                temp[k++] = vals[j++];
                inversions += (mid - i + 1);
            }
        }

        while (i <= mid) {
            temp[k++] = vals[i++];
        }

        while (j <= right) {
            temp[k++] = vals[j++];
        }

        System.arraycopy(temp, left, vals, left, right - left + 1);
        return inversions;
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(8, 4, 2, 1);
        System.out.println(countPairs(list1));

        List<Integer> list2 = Arrays.asList(5, 0, 10, 2, 4, 1, 6);
        System.out.println(countPairs(list2)); 
    }
}
