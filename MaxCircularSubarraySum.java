class MaxCircularSubarraySum {
    public static int maxCircularSum(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int totalSum = arr[0];
        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];
        int minEndingHere = arr[0];
        int minSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int val = arr[i];
            totalSum += val;

            maxEndingHere = Math.max(val, maxEndingHere + val);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);

            minEndingHere = Math.min(val, minEndingHere + val);
            minSoFar = Math.min(minSoFar, minEndingHere);
        }
        if (maxSoFar < 0) {
            return maxSoFar;
        }

        return Math.max(maxSoFar, totalSum - minSoFar);
    }

    public static void main(String[] args) {
        int[] arr1 = {8, -8, 9, -9, 10, -11, 12};
        System.out.println(maxCircularSum(arr1));

        int[] arr2 = {10, -3, -4, 7, 6, 5, -4, -1};
        System.out.println(maxCircularSum(arr2)); 

        int[] arr3 = {5, -2, 3, 4};
        System.out.println(maxCircularSum(arr3)); 
    }
}