class MedianOfTwoSortedArrays {

    public static double medianOf2(int[] a, int[] b) {
        if (a.length > b.length) {
            return medianOf2(b, a);
        }

        int n = a.length;
        int m = b.length;
        int totalLeft = (n + m + 1) / 2;

        int low = 0;
        int high = n;

        while (low <= high) {
            int cutA = low + (high - low) / 2;
            int cutB = totalLeft - cutA;

            int leftA = (cutA == 0) ? Integer.MIN_VALUE : a[cutA - 1];
            int rightA = (cutA == n) ? Integer.MAX_VALUE : a[cutA];

            int leftB = (cutB == 0) ? Integer.MIN_VALUE : b[cutB - 1];
            int rightB = (cutB == m) ? Integer.MAX_VALUE : b[cutB];

            if (leftA <= rightB && leftB <= rightA) {
                if ((n + m) % 2 == 1) {
                    return Math.max(leftA, leftB);
                } else {
                    return (Math.max(leftA, leftB) + Math.min(rightA, rightB)) / 2.0;
                }
            } else if (leftA > rightB) {
                high = cutA - 1;
            } else {
                low = cutA + 1;
            }
        }

        return 0.0;
    }

    public static void main(String[] args) {
        int[] a1 = {3, 5, 6, 12, 15};
        int[] b1 = {3, 4, 6, 10, 10, 12};
        System.out.println(medianOf2(a1, b1)); 

        int[] a2 = {2, 3, 5, 8};
        int[] b2 = {10, 12, 14, 16, 18, 20};
        System.out.println(medianOf2(a2, b2)); 

        int[] a3 = {};
        int[] b3 = {2, 4, 5, 6};
        System.out.println(medianOf2(a3, b3)); 
    }
}