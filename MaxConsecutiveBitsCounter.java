public class MaxConsecutiveBitsCounter {
    public static int maxConsecutiveBits(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int maxLen = 1;
        int currentLen = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currentLen++;
            } else {
                currentLen = 1;
            }
            maxLen = Math.max(maxLen, currentLen);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 1};
        int result = maxConsecutiveBits(arr);
        System.out.println("Maximum consecutive bits: " + result);
    }
}
