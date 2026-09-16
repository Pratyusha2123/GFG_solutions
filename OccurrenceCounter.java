public class OccurrenceCounter {
    public int countFreq(int[] arr, int target) {
        int first = firstOccurrence(arr, target);
        if (first == -1) {
            return 0; 
        }
        int last = lastOccurrence(arr, target);
        return last - first + 1;
    }
    
    private int firstOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1, res = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                res = mid;
                high = mid - 1; 
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }
    
    private int lastOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1, res = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                res = mid;
                low = mid + 1; 
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        OccurrenceCounter solver = new OccurrenceCounter();

        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        int target = 2;

        int result = solver.countFreq(arr, target);
        System.out.println("Output: " + result); 
    }
}
