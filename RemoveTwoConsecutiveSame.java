import java.util.Stack;

class RemoveTwoConsecutiveSame {
    
    public static int removeConsecutiveSame(String[] arr) {
        Stack<String> stack = new Stack<>();
        
        for (String word : arr) {
            if (!stack.isEmpty() && stack.peek().equals(word)) {
                stack.pop(); 
            } else {
                stack.push(word);
            }
        }
        
        return stack.size();
    }

    public static void main(String[] args) {
        String[] arr = {"ab", "aa", "aa", "bcd", "ab"};
        System.out.println(removeConsecutiveSame(arr)); 
    }
}
