class MinimumPossibleMaximum {
    
    public static int minimumNumber(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ans = gcd(ans, arr[i]);
        }
        return ans;
    }
    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4};
        System.out.println(minimumNumber(arr)); 
    }
}
