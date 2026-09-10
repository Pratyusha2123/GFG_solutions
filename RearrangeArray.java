public class RearrangeArray {
    public static void modifyArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            while (arr[i] != -1 && arr[i] != i) {
                int temp = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        modifyArray(arr);
        
        System.out.print("Modified Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
