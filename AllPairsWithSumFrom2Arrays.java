import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class pair {
    long first, second;
    pair(long first, long second) {
        this.first = first;
        this.second = second;
    }
}

class AllPairsWithSumFrom2Arrays {
    public pair[] allPairs(int target, int arr1[], int arr2[]) {
        Arrays.sort(arr1);
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int num : arr2) {
            map2.put(num, map2.getOrDefault(num, 0) + 1);
        }
        List<pair> result = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            int complement = target - arr1[i];
            if (map2.containsKey(complement)) {
                int count = map2.get(complement);
                for (int c = 0; c < count; c++) {
                    result.add(new pair(arr1[i], complement));
                }
            }
        }
        return result.toArray(new pair[0]);
    }

    public static void main(String[] args) {
        AllPairsWithSumFrom2Arrays obj = new AllPairsWithSumFrom2Arrays();
        int target1 = 9;
        int[] arr1 = {1, 2, 4, 5, 7};
        int[] arr2 = {5, 6, 3, 4, 8};
        pair[] res1 = obj.allPairs(target1, arr1, arr2);
        System.out.println("Output Pairs:");
        for (pair p : res1) {
            System.out.println(p.first + " " + p.second); 
        }
    }
}
