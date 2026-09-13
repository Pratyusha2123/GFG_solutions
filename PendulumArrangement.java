import java.util.Arrays;

public class PendulumArrangement {
    public int[] pendulumArrangement(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        
        int[] res = new int[n];
        int mid = (n - 1) / 2;
        res[mid] = arr[0];
        
        int left = mid - 1;
        int right = mid + 1;
        
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                res[right++] = arr[i];
            } else {
                res[left--] = arr[i];
            }
        }
        
        return res;
    }

    public static void main(String[] args) {
        PendulumArrangement solver = new PendulumArrangement();
        int[] arr1 = {1, 3, 2, 5, 4};
        int[] ans1 = solver.pendulumArrangement(arr1);
        System.out.print("Output: [");
        for (int i = 0; i < ans1.length; i++) {
            System.out.print(ans1[i] + (i == ans1.length - 1 ? "" : ", "));
        }
        System.out.println("]");
        int[] arr2 = {11, 12, 31, 14, 5};
        int[] ans2 = solver.pendulumArrangement(arr2);
        System.out.print("Output: [");
        for (int i = 0; i < ans2.length; i++) {
            System.out.print(ans2[i] + (i == ans2.length - 1 ? "" : ", "));
        }
        System.out.println("]"); 
    }
}
