public class ArrayPermutationDivisibleBy3 {
    public static boolean isPossible(int[] arr) {
        int sumRemainder = 0;

        for (int num : arr) {
            sumRemainder = (sumRemainder + num) % 3;
        }

        return sumRemainder == 0;
    }
    public static void main(String[] args) {
        int[] arr1 = {40, 50, 90};
        System.out.println("Output 1: " + isPossible(arr1)); 
        int[] arr2 = {1, 4};
        System.out.println("Output 2: " + isPossible(arr2));
    }
}

