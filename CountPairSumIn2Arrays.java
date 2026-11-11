class CountPairSumIn2Arrays {
    public static int countPairs(int[] a, int[] b, int x) {
        int i = 0;
        int j = b.length - 1;
        int count = 0;
        
        while (i < a.length && j >= 0) {
            int sum = a[i] + b[j];
            if (sum == x) {
                count++;
                i++;
                j--;
            } else if (sum < x) {
                i++;
            } else {
                j--;
            }
        }       
        return count;
    }

    public static void main(String[] args) {
        int x = 10;
        int[] a = {1, 3, 5, 7};
        int[] b = {2, 3, 5, 8};
        System.out.println(countPairs(a, b, x)); 
    }
}
