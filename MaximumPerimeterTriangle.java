import java.util.Arrays;

public class MaximumPerimeterTriangle {
    
    public static int maxPerimeter(int[] arr) {
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 2; i--) {
            if (arr[i - 2] + arr[i - 1] > arr[i]) {
                return arr[i] + arr[i - 1] + arr[i - 2];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {6, 1, 6, 5, 8, 4};
        int[] arr2 = {7, 55, 20, 1, 4, 33, 12};

        System.out.println("Max Perimeter for arr1: " + maxPerimeter(arr1)); 
        System.out.println("Max Perimeter for arr2: " + maxPerimeter(arr2)); 
    }
}

