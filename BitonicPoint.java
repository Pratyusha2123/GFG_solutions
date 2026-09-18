public class BitonicPoint {
    public int findMaximum(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            boolean leftsmaller = (mid == 0) || (arr[mid] > arr[mid - 1]);
            boolean rightsmaller = (mid == arr.length - 1) || (arr[mid] > arr[mid + 1]);
            if (leftsmaller && rightsmaller) {
                return arr[mid];
            }
            else if (mid < arr.length - 1 && arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BitonicPoint bp = new BitonicPoint();
        int[] arr1 = {1, 2, 4, 5, 7, 8, 3};
        int[] arr2 = {10, 20, 30, 40, 50};
        System.out.println("Output 1: " + bp.findMaximum(arr1));
        System.out.println("Output 2: " + bp.findMaximum(arr2));
    }
}
