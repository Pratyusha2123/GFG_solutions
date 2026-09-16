import java.util.HashSet;

public class FirstRepeatingRunner {
    public int firstRepeated(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int minindex = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (set.contains(arr[i])) {
                minindex = i + 1; 
            } else {
                set.add(arr[i]);
            }
        }
        return minindex;
    }
    public static void main(String[] args) {
        FirstRepeatingRunner solver = new FirstRepeatingRunner();
        int[] arr = {1, 5, 3, 4, 3, 5, 6};

        int result = solver.firstRepeated(arr);
        System.out.println("Output: " + result);
    }
}
