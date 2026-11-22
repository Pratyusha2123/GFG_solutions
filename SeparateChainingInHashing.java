import java.util.ArrayList;

class SeparateChainingInHashing {

    public static ArrayList<ArrayList<Integer>> separateChaining(int[] arr, int m) {
        ArrayList<ArrayList<Integer>> hashTable = new ArrayList<>(m);

        for (int i = 0; i < m; i++) {
            hashTable.add(new ArrayList<>());
        }

        for (int num : arr) {
            int slot = ((num % m) + m) % m;
            hashTable.get(slot).add(num);
        }

        return hashTable;
    }

    public static void main(String[] args) {
        int[] arr = {6, 4, 10, 13, 5};
        int m = 4;
        System.out.println(separateChaining(arr, m)); // Output: [[4], [13, 5], [6, 10], []]
    }
}
