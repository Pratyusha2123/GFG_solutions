import java.util.HashMap;

public class MaxDistanceBetweenSameElements {
    public static int maxDistance(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxDist = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], i);
            } else {
                int dist = i - map.get(arr[i]);
                maxDist = Math.max(maxDist, dist);
            }
        }
        return maxDist;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 2, 2, 1};
        System.out.println("Output 1: " + maxDistance(arr1));
        int[] arr2 = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
        System.out.println("Output 2: " + maxDistance(arr2));
        int[] arr3 = {1, 2, 3, 6, 5, 4};
        System.out.println("Output 3: " + maxDistance(arr3));
    }
}
