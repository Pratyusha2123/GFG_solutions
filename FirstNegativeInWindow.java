import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class FirstNegativeInWindow {
    
    public static List<Integer> firstNegativeInt(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> negQueue = new LinkedList<>();
        int n = arr.length;
        for (int i = 0; i < k; i++) {
            if (arr[i] < 0) {
                negQueue.add(i);
            }
        }
        if (!negQueue.isEmpty()) {
            result.add(arr[negQueue.peek()]);
        } else {
            result.add(0);
        }
        for (int i = k; i < n; i++) {
            while (!negQueue.isEmpty() && negQueue.peek() <= i - k) {
                negQueue.poll();
            }
            if (arr[i] < 0) {
                negQueue.add(i);
            }
            if (!negQueue.isEmpty()) {
                result.add(arr[negQueue.peek()]);
            } else {
                result.add(0);
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {-8, 2, 3, -6, 10};
        int k = 2;
        System.out.println(firstNegativeInt(arr, k)); 
    }
}
