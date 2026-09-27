import java.util.Arrays;

public class ReplaceElementsRank {
    
    public static void replaceWithRank(int[] arr) {
        int n = arr.length;
        int[][] temp = new int[n][2];
        for (int i = 0; i < n; i++) {
            temp[i][0] = arr[i];
            temp[i][1] = i;
        }
        
        Arrays.sort(temp, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(a[1], b[1]);
        });
        
        for (int rank = 0; rank < n; rank++) {
            int originalIndex = temp[rank][1];
            arr[originalIndex] = rank;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 40, 20};
        int[] arr2 = {0, 2, 1};
        int[] arr3 = {1, 5, 3, 4, 3};

        replaceWithRank(arr1);
        replaceWithRank(arr2);
        replaceWithRank(arr3);

        System.out.println("Result for arr1: " + Arrays.toString(arr1)); 
        System.out.println("Result for arr2: " + Arrays.toString(arr2)); 
        System.out.println("Result for arr3: " + Arrays.toString(arr3)); 
    }
}

