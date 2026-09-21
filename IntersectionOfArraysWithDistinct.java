import java.util.HashSet;

class IntersectionOfArraysWithDistinct {
    public static int intersectSize(int a[], int b[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : a) {
            set.add(num);
        }
        int count = 0;
        for (int num : b) {
            if (set.contains(num)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a1 = {89, 24, 75, 11, 23};
        int[] b1 = {89, 2, 4};
        System.out.println("Output: " + IntersectionOfArraysWithDistinct.intersectSize(a1, b1)); 
        int[] a2 = {1, 2, 4, 3, 5, 6};
        int[] b2 = {3, 4, 5, 6, 7};
        System.out.println("Output: " + IntersectionOfArraysWithDistinct.intersectSize(a2, b2)); 
        int[] a3 = {20, 10, 30, 50, 40};
        int[] b3 = {15, 25, 30, 20, 35};
        System.out.println("Output: " + IntersectionOfArraysWithDistinct.intersectSize(a3, b3)); 
    }
}
