public class UniqueElementFinder {
    public static int uniqueElement(int[] arr, int k) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int bitCount = 0;
            int bitMask = 1 << i;
            for (int num : arr) {
                if ((num & bitMask) != 0) {
                    bitCount++;
                }
            }
            if (bitCount % k != 0) {
                result |= bitMask;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {6, 2, 5, 2, 2, 6, 6};
        int k1 = 3;
        System.out.println("Output for Example 1: " + uniqueElement(arr1, k1)); 
        int[] arr2 = {2, 2, 2, 10, 2};
        int k2 = 4;
        System.out.println("Output for Example 2: " + uniqueElement(arr2, k2)); 
    }
}
