import java.util.ArrayList;
import java.util.Arrays;

class TotalCuts {
    
    public static int totalCuts(ArrayList<Integer> a, int k) {
        int n = a.size();
        if (n <= 1) return 0;
        
        int[] minRight = new int[n];
        minRight[n - 1] = a.get(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            minRight[i] = Math.min(minRight[i + 1], a.get(i));
        }
        
        int maxLeft = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            maxLeft = Math.max(maxLeft, a.get(i));
            int minRightVal = minRight[i + 1];
            
            if (maxLeft + minRightVal >= k) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
        int k = 3;
        System.out.println(totalCuts(a, k)); 
    }
}
