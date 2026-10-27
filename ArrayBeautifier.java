import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ArrayBeautifier {
    public static List<Integer> makeBeautiful(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        
        for (int num : arr) {
            if (stack.isEmpty()) {
                stack.push(num);
            } else {
                int top = stack.peek();
                if ((top >= 0 && num < 0) || (top < 0 && num >= 0)) {
                    stack.pop();
                } else {
                    stack.push(num);
                }
            }
        }
        List<Integer> result = new ArrayList<>(stack);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, -2, 1};
        List<Integer> beautifulArray = makeBeautiful(arr);
        System.out.println("Output: " + beautifulArray);
    }
}
