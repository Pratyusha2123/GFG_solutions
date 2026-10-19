import java.util.Arrays;

class MergeWithoutExtraSpace {
    
    public static void mergeArrays(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        
        int i = n - 1;
        int j = 0;
        while (i >= 0 && j < m) {
            if (a[i] > b[j]) {
                int temp = a[i];
                a[i] = b[j];
                b[j] = temp;
                i--;
                j++;
            } else {
                break;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
    public static void main(String[] args) {
        int[] a1 = {2, 4, 7, 10};
        int[] b1 = {2, 3};
        mergeArrays(a1, b1);
        System.out.println("Test 1 Output: a[] = " + Arrays.toString(a1) + ", b[] = " + Arrays.toString(b1)); 
        int[] a2 = {1, 5, 9, 10, 15, 20};
        int[] b2 = {2, 3, 8, 13};
        mergeArrays(a2, b2);
        System.out.println("Test 2 Output: a[] = " + Arrays.toString(a2) + ", b[] = " + Arrays.toString(b2)); 
    }
}
