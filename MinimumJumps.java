class MinimumJumps {

    public static int minJumps(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return 0;
        }
        if (arr[0] == 0) {
            return -1;
        }

        int jumps = 0;
        int currentEnd = 0;
        int maxReach = 0;

        for (int i = 0; i < n - 1; i++) {
            if (i + arr[i] > maxReach) {
                maxReach = i + arr[i];
            }
            if (maxReach <= i) {
                return -1;
            }

            if (i == currentEnd) {
                jumps++;
                currentEnd = maxReach;

                if (currentEnd >= n - 1) {
                    return jumps;
                }
            }
        }

        return (currentEnd >= n - 1) ? jumps : -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minJumps(arr1)); 

        int[] arr2 = {1, 4, 3, 2, 6, 7};
        System.out.println(minJumps(arr2)); 
    }
}
