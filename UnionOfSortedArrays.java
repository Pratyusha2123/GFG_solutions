import java.util.ArrayList;

public class UnionOfSortedArrays {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        int n = a.length;
        int m = b.length;
        int i = 0, j = 0;
        ArrayList<Integer> result = new ArrayList<>();
        
        while (i < n && j < m) {
            while (i > 0 && i < n && a[i] == a[i - 1]) {
                i++;
            }
            while (j > 0 && j < m && b[j] == b[j - 1]) {
                j++;
            }
            
            if (i >= n || j >= m) {
                break;
            }
            
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
            if (i == 0 || a[i] != a[i - 1]) {
                result.add(a[i]);
            }
            i++;
        }
        
        while (j < m) {
            if (j == 0 || b[j] != b[j - 1]) {
                result.add(b[j]);
            }
            j++;
        }
        
        return result;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 6, 7};
        
        ArrayList<Integer> union = findUnion(a, b);
        System.out.println("Output: " + union);
    }
}

