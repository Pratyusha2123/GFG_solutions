import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeKSortedArrays {
    public static class Element {
        int val;
        int row;
        int col;

        Element(int val, int row, int col) {
            this.val = val;
            this.row = row;
            this.col = col;
        }
    }
    public ArrayList<Integer> mergeArrays(int[][] mat) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = mat.length;
        if (n == 0) return result;
        int m = mat[0].length;
        
        PriorityQueue<Element> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));
        
        for (int i = 0; i < n; i++) {
            if (m > 0) {
                minHeap.add(new Element(mat[i][0], i, 0));
            }
        }
        
        while (!minHeap.isEmpty()) {
            Element curr = minHeap.poll();
            result.add(curr.val);
            
            if (curr.col + 1 < m) {
                minHeap.add(new Element(mat[curr.row][curr.col + 1], curr.row, curr.col + 1));
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        MergeKSortedArrays solver = new MergeKSortedArrays();
        int[][] mat1 = {
            {1, 3, 5, 7},
            {2, 4, 6, 8},
            {0, 9, 10, 11}
        };
        System.out.println("Example 1 Output: " + solver.mergeArrays(mat1));
    }
}
