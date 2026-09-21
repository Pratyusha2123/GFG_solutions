import java.util.Arrays;

class ThreeWayPartitioning {
    public void threeWayPartition(int arr[], int a, int b) {
        int low = 0;
        int high = arr.length - 1;
        int i = 0;
        while (i <= high) {
            if (arr[i] < a) {
                int temp = arr[i];
                arr[i] = arr[low];
                arr[low] = temp;
                low++;
                i++;
            } else if (arr[i] > b) {
                int temp = arr[i];
                arr[i] = arr[high];
                arr[high] = temp;
                high--;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        ThreeWayPartitioning obj = new ThreeWayPartitioning();
        int[] arr1 = {1, 2, 3, 3, 4};
        int a1 = 1, b1 = 2;
        obj.threeWayPartition(arr1, a1, b1);
        System.out.println("Output: " + Arrays.toString(arr1)); 
    }
}
