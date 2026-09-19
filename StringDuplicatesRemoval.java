import java.util.HashSet;

class StringDuplicatesRemoval {
    public String removeDuplicates(String s) {
        HashSet<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        StringDuplicatesRemoval obj = new StringDuplicatesRemoval();
        String s1 = "geeksforGeeks";
        System.out.println("Output: " + obj.removeDuplicates(s1)); 

    }
}
