import java.util.PriorityQueue;

class MinimizeTheSum {

    public static int minSum(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : arr) {
            pq.add(num);
        }

        int totalSum = 0;
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();

            int currentSum = first + second;
            totalSum += currentSum;
            pq.add(currentSum);
        }

        return totalSum;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 7, 10};
        System.out.println(minSum(arr1)); 

        int[] arr2 = {1, 3, 7, 5, 6};
        System.out.println(minSum(arr2)); 
    }
}