import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

class MinimumMultiplications {
    
    public static int minSteps(int[] arr, int start, int end) {
        if (start == end) return 0;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {start, 0});
        int[] dist = new int[100000];
        Arrays.fill(dist, (int) (1e9));
        dist[start] = 0;
        
        int mod = 1000;
        
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int node = curr[0];
            int steps = curr[1];
            
            for (int x : arr) {
                int nextNode = (node * x) % mod;
                
                if (steps + 1 < dist[nextNode]) {
                    dist[nextNode] = steps + 1;
                    
                    if (nextNode == end) {
                        return steps + 1;
                    }
                    
                    q.add(new int[] {nextNode, steps + 1});
                }
            }
        }
        
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 7};
        int start = 3, end = 30;
        System.out.println(minSteps(arr, start, end)); 
    }
}