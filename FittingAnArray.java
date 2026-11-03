import java.util.Arrays;

class FittingAnArray {
    
    public static boolean isFit(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[i]) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        int[] a = {7, 5, 3, 2};
        int[] b = {5, 4, 8, 7};
        System.out.println(isFit(a, b)); 
    }
}
