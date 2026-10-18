import java.util.Arrays;

class LastRemainingElement {
    
    public static int leftElement(int[] arr) {
        Arrays.sort(arr);
        return arr[(arr.length - 1) / 2];
    }

    public static void main(String[] args) {
        int[] arr1 = {7, 8, 3, 4, 2, 9, 5};
        System.out.println("Test 1 Output: " + leftElement(arr1)); 
        int[] arr2 = {8, 1, 2, 9, 4, 3, 7, 5};
        System.out.println("Test 2 Output: " + leftElement(arr2)); 
    }
}
