import java.util.ArrayList;
public class IntersectionOfSortedArrays {
    
    public static ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        int n = arr1.length;
        int m = arr2.length;
        
        while (i < n && j < m) {
            if (i > 0 && arr1[i] == arr1[i - 1]) {
                i++;
                continue;
            }
            if (j > 0 && arr2[j] == arr2[j - 1]) {
                j++;
                continue;
            }
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else {
                result.add(arr1[i]);
                i++;
                j++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {2, 4, 6, 7, 8};

        int[] arr3 = {1, 2, 2, 3, 4};
        int[] arr4 = {2, 2, 4, 6, 7, 8};

        int[] arr5 = {1, 2};
        int[] arr6 = {3, 4};

        System.out.println("Intersection 1: " + intersection(arr1, arr2)); 
        System.out.println("Intersection 2: " + intersection(arr3, arr4)); 
        System.out.println("Intersection 3: " + intersection(arr5, arr6)); 
    }
}

