import java.util.HashMap;
import java.util.Map;

class CountNkTimesOccurring {

    public static int countOccurence(int[] arr, int k) {
        int n = arr.length;
        int targetFreq = n / k;
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int specialCount = 0;
        for (int count : freqMap.values()) {
            if (count == targetFreq) {
                specialCount++;
            }
        }

        return specialCount;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 2, 4};
        int k = 2;
        System.out.println(countOccurence(arr, k)); // Output: 2
    }
}
