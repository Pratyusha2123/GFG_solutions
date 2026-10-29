public class MedianOfSortedArrays {
    public static double medianOf2(int[] a, int[] b) {
        int n = a.length;
        int low = 0, high = n;

        while (low <= high) {
            int cut1 = low + (high - low) / 2;
            int cut2 = n - cut1;
            int left1 = (cut1 == 0) ? Integer.MIN_VALUE : a[cut1 - 1];
            int left2 = (cut2 == 0) ? Integer.MIN_VALUE : b[cut2 - 1];
            int right1 = (cut1 == n) ? Integer.MAX_VALUE : a[cut1];
            int right2 = (cut2 == n) ? Integer.MAX_VALUE : b[cut2];
            
            if (left1 <= right2 && left2 <= right1) {
                return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
            } else if (left1 > right2) {
                high = cut1 - 1;
            } else {
                low = cut1 + 1;
            }
        }
        return 0.0;
    }
    public static void main(String[] args) {
        int[] a = {-5, 3, 6, 12, 15};
        int[] b = {-12, -10, -6, -3, 4};
        
        double median = medianOf2(a, b);
        System.out.println("Output: " + median);
    }
}

