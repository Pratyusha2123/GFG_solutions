import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestFinder {
    public int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : arr) {
            maxHeap.add(num);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        return maxHeap.peek();
    }
    public static void main(String[] args) {
        KthSmallestFinder finder = new KthSmallestFinder();
        int[] arr1 = {10, 5, 4, 3, 48, 6, 2, 33, 53, 10};
        int k1 = 4;
        System.out.println("Example 1 Output: " + finder.kthSmallest(arr1, k1)); 
        int[] arr2 = {7, 10, 4, 3, 20, 15};
        int k2 = 3;
        System.out.println("Example 2 Output: " + finder.kthSmallest(arr2, k2)); 
    }
}