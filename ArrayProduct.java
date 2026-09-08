public class ArrayProduct {
    public static long product(long[] arr) {
        long mod = 1000000007L;
        long ans = 1;

        for (long num : arr) {
            ans = (ans * (num % mod)) % mod;
        }

        return ans;
    }
    public static void main(String[] args) {
        long[] arr1 = {1, 2, 3, 4};
        System.out.println("Output 1: " + product(arr1));
        long[] arr2 = {100000, 100000, 100000};
        System.out.println("Output 2: " + product(arr2)); 
    }
}