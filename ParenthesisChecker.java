import java.util.Stack;

public class ParenthesisChecker {
    public static boolean isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                char top = st.pop();
                if ((ch == ')' && top != '(') || 
                    (ch == '}' && top != '{') || 
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return st.isEmpty();
        }

    public static void main(String[] args) {
        String s1 = "{([])}";
        String s2 = "()[][]{}";
        String s3 = "([)]";
        
        System.out.println("Input: \"" + s1 + "\" -> Output: " + isBalanced(s1));
        System.out.println("Input: \"" + s2 + "\" -> Output: " + isBalanced(s2));
        System.out.println("Input: \"" + s3 + "\" -> Output: " + isBalanced(s3));
    }
}
