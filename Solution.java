public class Solution {
    public int minOperations(int n) {
        int k = n / 2;
        return k * (n - k);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n1 = 3;
        System.out.println("Input: n = " + n1);
        System.out.println("Output: " + sol.minOperations(n1));
        int n2 = 2;
        System.out.println("Input: n = " + n2);
        System.out.println("Output: " + sol.minOperations(n2));
    }
}
