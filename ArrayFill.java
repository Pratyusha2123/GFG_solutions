import java.util.Arrays;

class ArrayFill {
    public static void fillArray(int[] arr, int k) {
        Arrays.fill(arr, k);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k = 0;
        fillArray(arr, k);
        System.out.println(Arrays.toString(arr)); 
    }
}
