import java.util.ArrayList;

class UnionOfTwoSortedArrays {
 
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        int n = a.length;
        int m = b.length;
        
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                result.add(a[i]);
                i++;
            } else if (b[j] < a[i]) {
                result.add(b[j]);
                j++;
            } else {
                result.add(a[i]);
                i++;
                j++;
            }
        }
        while (i < n) {
            result.add(a[i]);
            i++;
        }
        while (j < m) {
            result.add(b[j]);
            j++;
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 6, 7};
        System.out.println(findUnion(a, b)); 
    }
}
