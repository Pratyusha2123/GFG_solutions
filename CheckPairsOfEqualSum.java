import java.util.HashSet;

class CheckPairsOfEqualSum {

    public static boolean findPairs(int[] arr) {
        int n = arr.length;
        HashSet<Integer> sumSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int pairSum = arr[i] + arr[j];

                if (sumSet.contains(pairSum)) {
                    return true;
                }
                sumSet.add(pairSum);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 4, 7, 1, 2, 9, 8};
        System.out.println(findPairs(arr1));

        int[] arr2 = {65, 30, 7, 90, 1, 9, 8};
        System.out.println(findPairs(arr2)); 
    }
}
