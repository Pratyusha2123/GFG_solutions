import java.util.HashSet;

class CheckContiguousIntegers {

    public static boolean areElementsContiguous(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return true;
        }

        HashSet<Integer> uniqueElements = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            uniqueElements.add(num);
            if (num < min) min = num;
            if (num > max) max = num;
        }

        return uniqueElements.size() == ((long) max - min + 1);
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 2, 3, 6, 4, 4, 6, 6};
        System.out.println(areElementsContiguous(arr1) ? "Yes" : "No"); 

        int[] arr2 = {10, 14, 10, 12, 12, 13, 15};
        System.out.println(areElementsContiguous(arr2) ? "Yes" : "No"); 
    }
}