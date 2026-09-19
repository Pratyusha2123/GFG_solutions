import java.util.HashMap;

class AtLeastKOccurrences {
    public int firstElementKTime(int[] arr, int k) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            int currentCount = countMap.getOrDefault(num, 0) + 1;
            countMap.put(num, currentCount);
            if (currentCount == k) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        AtLeastKOccurrences obj = new AtLeastKOccurrences();
        int[] arr1 = {1, 7, 4, 3, 4, 8, 7};
        int k1 = 2;
        System.out.println("Output: " + obj.firstElementKTime(arr1, k1)); 
    }
}
