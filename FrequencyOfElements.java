import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

class FrequencyOfElements {

    public static ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        TreeMap<Integer, Integer> freqMap = new TreeMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            result.add(new ArrayList<>(Arrays.asList(entry.getKey(), entry.getValue())));
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 3, 5};
        System.out.println(countFreq(arr1)); 

        int[] arr2 = {1, 5, 6, 7, 7};
        System.out.println(countFreq(arr2));
    }
}
