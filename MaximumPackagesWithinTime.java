class MaximumPackagesWithinTime {
    public static int maxPackages(int[] arr, int totalTime) {
        if (arr == null || arr.length == 0 || totalTime <= 0) {
            return 0;
        }

        int windowSize = Math.min(arr.length, totalTime);
        long currentSum = 0;

        for (int i = 0; i < windowSize; i++) {
            currentSum += arr[i];
        }

        long maxSum = currentSum;

        for (int i = windowSize; i < arr.length; i++) {
            currentSum += arr[i] - arr[i - windowSize];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return (int) maxSum;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 3, 5, 0, 1, 4};
        System.out.println(maxPackages(arr1, 3)); 

        int[] arr2 = {1, 6, 2, 5, 3, 4};
        System.out.println(maxPackages(arr2, 2)); 
    }
}
