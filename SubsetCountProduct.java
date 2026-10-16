import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class SubsetCountProduct {
    
    public static int numOfSubsets(int[] arr, int k) {
        int n = arr.length;
        List<Long> v1 = new ArrayList<>();
        List<Long> v2 = new ArrayList<>();
        
        generateSubsets(0, n / 2, arr, 1, k, v1);
        generateSubsets(n / 2, n, arr, 1, k, v2);
        Collections.sort(v2);
        
        int count = 0;
        for (long val1 : v1) {
            long maxVal2 = k / val1;
            count += upperBound(v2, maxVal2);
        }
        return count - 1; 
    }
    
    private static void generateSubsets(int index, int end, int[] arr, long currentProd, int k, List<Long> list) {
        if (currentProd > k) {
            return;
        }
        if (index == end) {
            list.add(currentProd);
            return;
        }
        generateSubsets(index + 1, end, arr, currentProd * arr[index], k, list);
        generateSubsets(index + 1, end, arr, currentProd, k, list);
    }
    
    private static int upperBound(List<Long> list, long target) {
        int low = 0, high = list.size();
        while (low < high) {
            int mid = (low + high) / 2;
            if (list.get(mid) <= target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5};
        int k = 10;
        System.out.println("Test Output: " + numOfSubsets(arr, k)); 
    }
}
