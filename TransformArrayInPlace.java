import java.util.Arrays;

class TransformArrayInPlace {
    public static void arrange(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int oldTargetVal = arr[arr[i]] % n;
            arr[i] += oldTargetVal * n;
        }

        for (int i = 0; i < n; i++) {
            arr[i] /= n;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 0};
        arrange(arr1);
        System.out.println(Arrays.toString(arr1)); 

        int[] arr2 = {4, 0, 2, 1, 3};
        arrange(arr2);
        System.out.println(Arrays.toString(arr2)); 
    }
}
