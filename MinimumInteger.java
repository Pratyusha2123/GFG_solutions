public class MinimumInteger {
    public int minimumInteger(int[] arr) {
        int n = arr.length;
        long sum = 0;
        for (int num : arr) {
            sum += num;
        }
        int ans = Integer.MAX_VALUE;
        for (int num : arr) {
            if (sum <= (long) n * num) {
                ans = Math.min(ans, num);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        MinimumInteger obj = new MinimumInteger();
        
        int[] arr1 = {1, 3, 2};
        System.out.println("Output for {1, 3, 2}: " + obj.minimumInteger(arr1)); 

        int[] arr2 = {3};
        System.out.println("Output for {3}: " + obj.minimumInteger(arr2)); 
    }
}
