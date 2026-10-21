import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;

class MaximumSumCombination {
    
    public static ArrayList<Integer> topKSumPairs(int[] a, int[] b, int k) {
        int n = a.length;
        Arrays.sort(a);
        Arrays.sort(b);
        
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((x, y) -> Integer.compare(y[0], x[0]));
        HashSet<String> visited = new HashSet<>();
        
        int i = n - 1;
        int j = n - 1;
        
        maxHeap.add(new int[] {a[i] + b[j], i, j});
        visited.add(i + "," + j);
        
        ArrayList<Integer> result = new ArrayList<>();
        
        while (k > 0 && !maxHeap.isEmpty()) {
            int[] current = maxHeap.poll();
            int sum = current[0];
            int currI = current[1];
            int currJ = current[2];
            
            result.add(sum);
            k--;
            
            if (currI - 1 >= 0) {
                String nextPair1 = (currI - 1) + "," + currJ;
                if (!visited.contains(nextPair1)) {
                    maxHeap.add(new int[] {a[currI - 1] + b[currJ], currI - 1, currJ});
                    visited.add(nextPair1);
                }
            }
            
            if (currJ - 1 >= 0) {
                String nextPair2 = currI + "," + (currJ - 1);
                if (!visited.contains(nextPair2)) {
                    maxHeap.add(new int[] {a[currI] + b[currJ - 1], currI, currJ - 1});
                    visited.add(nextPair2);
                }
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] a1 = {3, 2};
        int[] b1 = {1, 4};
        int k1 = 2;
        System.out.println("Test 1 Output: " + topKSumPairs(a1, b1, k1));
        int[] a2 = {1, 4, 2, 3};
        int[] b2 = {2, 5, 1, 6};
        int k2 = 3;
        System.out.println("Test 2 Output: " + topKSumPairs(a2, b2, k2)); 
    }
}
