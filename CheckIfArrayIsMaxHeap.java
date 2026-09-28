public class CheckIfArrayIsMaxHeap {
    public static boolean isMaxHeap(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= (n - 1) / 2; i++) {
            int leftChild = 2 * i + 1;
            int rightChild = 2 * i + 2;
            if (leftChild < n && arr[i] < arr[leftChild]) {
                return false;
            }
            if (rightChild < n && arr[i] < arr[rightChild]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr1 = {90, 15, 10, 7, 12, 2};
        int[] arr2 = {9, 15, 10, 7, 12, 11};

        System.out.println("Is arr1 a max heap? " + isMaxHeap(arr1)); 
        System.out.println("Is arr2 a max heap? " + isMaxHeap(arr2)); 
    }
}

