import java.util.PriorityQueue;
public class MinOperations {
    public static int minOperations(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : arr) {
            pq.add(num);
        }
        int count = 0;
        while (!pq.isEmpty() && pq.peek() < k) {
            if (pq.size() < 2) {
                return -1;
            }
            int first = pq.poll();
            int second = pq.poll();
            pq.add(first + second);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 10, 12, 9, 2, 3};
        int k1 = 6;
        System.out.println("Output 1: " + minOperations(arr1, k1)); 
        
        int[] arr2 = {5, 4, 6, 4};
        int k2 = 4;
        System.out.println("Output 2: " + minOperations(arr2, k2)); 
    }
}