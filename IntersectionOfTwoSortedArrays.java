import java.util.ArrayList;

class IntersectionOfTwoSortedArrays {
    
    public static ArrayList<Integer> intersection(int[] a, int[] b) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        int n = a.length, m = b.length;
        
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                if (result.isEmpty() || result.get(result.size() - 1) != a[i]) {
                    result.add(a[i]);
                }
                i++;
                j++;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 4};
        int[] b = {2, 2, 4, 4};
        System.out.println(intersection(a, b)); 
    }
}
