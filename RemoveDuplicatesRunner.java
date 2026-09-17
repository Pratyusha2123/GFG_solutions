import java.util.ArrayList;

public class RemoveDuplicatesRunner {
    public ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        if (arr == null || arr.length == 0) {
            return result;
        }
        result.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                result.add(arr[i]);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        RemoveDuplicatesRunner solver = new RemoveDuplicatesRunner();
        int[] arr = {2, 2, 2, 2, 2};

        ArrayList<Integer> result = solver.removeDuplicates(arr);
        System.out.println("Output: " + result); 
    }
}
