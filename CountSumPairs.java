public class CountSumPairs {
    public static int countPairs(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int count = 0;
        
        while (left < right) {
            int sum = arr[left] + arr[right];
            
            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                if (arr[left] == arr[right]) {
                    int n = right - left + 1;
                    count += (n * (n - 1)) / 2;
                    break;
                } else {
                    int leftVal = arr[left];
                    int leftCount = 0;
                    while (left < right && arr[left] == leftVal) {
                        leftCount++;
                        left++;
                    }
                    int rightVal = arr[right];
                    int rightCount = 0;
                    while (right >= left && arr[right] == rightVal) {
                        rightCount++;
                        right--;
                    }
                    count += leftCount * rightCount;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr1 = {-1, 1, 5, 5, 7};
        int target1 = 6;

        int[] arr2 = {1, 1, 1, 1};
        int target2 = 2;

        int[] arr3 = {-1, 10, 10, 12, 15};
        int target3 = 125;

        System.out.println("Pairs for arr1: " + countPairs(arr1, target1)); 
        System.out.println("Pairs for arr2: " + countPairs(arr2, target2)); 
        System.out.println("Pairs for arr3: " + countPairs(arr3, target3)); 
    }
}

