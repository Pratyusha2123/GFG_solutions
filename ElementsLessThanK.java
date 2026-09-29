import java.util.ArrayList;

public class ElementsLessThanK {
    public static ArrayList<Integer> elementsLessThanK(int[] arr, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (num < k) {
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 1, 3}; 
        int k = 4; 
        
        ArrayList<Integer> result = elementsLessThanK(arr, k);
        System.out.println("Output: " + result);
    }
}