import java.util.HashSet;
import java.util.Set;

class TotalTraversalTime {
    
    public static int totalTime(int[] arr, int[] penalty) {
        int totalTime = 0;
        Set<Integer> visited = new HashSet<>();
        
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            if (!visited.contains(val)) {
                totalTime += 1;
                visited.add(val);
            } else {
                totalTime += penalty[val];
            }
        }
        
        return totalTime;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3};
        int[] penalty = {1, 2, 3, 4};
        System.out.println(totalTime(arr, penalty)); 
    }
}