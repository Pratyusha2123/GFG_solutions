class ExtraInOneOfTheTwoArrays {
    public int findExtra(int a[], int b[]) {
        int low = 0;
        int high = b.length - 1;
        int ans = a.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] == b[mid]) {
                low = mid + 1;
            } else {
                ans = mid;
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ExtraInOneOfTheTwoArrays obj = new ExtraInOneOfTheTwoArrays();
        int[] a1 = {2, 4, 6, 8, 9, 10, 12};
        int[] b1 = {2, 4, 6, 8, 10, 12};
        System.out.println("Output: " + obj.findExtra(a1, b1)); 
        int[] a2 = {3, 5, 7, 8, 11, 13};
        int[] b2 = {3, 5, 7, 11, 13};
        System.out.println("Output: " + obj.findExtra(a2, b2)); 
        int[] a3 = {3, 5};
        int[] b3 = {3};
        System.out.println("Output: " + obj.findExtra(a3, b3)); 
    }
}
