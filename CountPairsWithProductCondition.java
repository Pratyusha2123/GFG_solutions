import java.util.Arrays;
import java.util.List;

class CountPairsWithProductCondition {

    static class FenwickTree {
        private final int[] tree;

        FenwickTree(int size) {
            this.tree = new int[size + 1];
        }

        void add(int idx, int delta) {
            for (; idx < tree.length; idx += idx & -idx) {
                tree[idx] += delta;
            }
        }

        int query(int idx) {
            int sum = 0;
            for (; idx > 0; idx -= idx & -idx) {
                sum += tree[idx];
            }
            return sum;
        }

        int queryRange(int left, int right) {
            if (left > right) return 0;
            return query(right) - query(left - 1);
        }
    }

    public static int countPairs(List<Integer> arr) {
        int n = arr.size();
        if (n <= 1) return 0;

        long[] vals = new long[n];
        for (int i = 0; i < n; i++) {
            vals[i] = (long) i * arr.get(i);
        }
        long[] sorted = vals.clone();
        Arrays.sort(sorted);

        int uniqueCount = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0 || sorted[i] != sorted[i - 1]) {
                sorted[uniqueCount++] = sorted[i];
            }
        }

        FenwickTree bit = new FenwickTree(uniqueCount);
        long totalPairs = 0;

        for (int j = 0; j < n; j++) {
            int pos = Arrays.binarySearch(sorted, 0, uniqueCount, vals[j]);
            int rank = pos + 1; 

            int greaterCount = bit.queryRange(rank + 1, uniqueCount);
            totalPairs += greaterCount;

            bit.add(rank, 1);
        }

        return (int) totalPairs;
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(8, 4, 2, 1);
        System.out.println(countPairs(list1)); 

        List<Integer> list2 = Arrays.asList(5, 0, 10, 2, 4, 1, 6);
        System.out.println(countPairs(list2)); 
    }
}
