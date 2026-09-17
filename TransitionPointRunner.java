public class TransitionPointRunner {
    public int transitionPoint(int arr[]) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == 1) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        TransitionPointRunner solver = new TransitionPointRunner();
        int[] arr = {0, 0, 0, 1, 1};

        int result = solver.transitionPoint(arr);
        System.out.println("Output: " + result); 
    }
}
