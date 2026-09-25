public class TrappingRainWater {
    public static int maxWater(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int totalWater = 0;
        
        while (left < right) {
            if (arr[left] <= arr[right]) {
                if (arr[left] >= leftMax) {
                    leftMax = arr[left];
                } else {
                    totalWater += leftMax - arr[left];
                }
                left++;
            } else {
                if (arr[right] >= rightMax) {
                    rightMax = arr[right];
                } else {
                    totalWater += rightMax - arr[right];
                }
                right--;
            }
        }
        return totalWater;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 0, 2, 0, 4};
        int[] arr2 = {2, 1, 5, 3, 1, 0, 4};

        System.out.println("Water trapped for arr1: " + maxWater(arr1)); 
        System.out.println("Water trapped for arr2: " + maxWater(arr2)); 
    }
}
