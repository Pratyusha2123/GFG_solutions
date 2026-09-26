public class RemoveSandwichedVowels {
    
    public static String sandwichedVowel(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                if (i > 0 && i < n - 1 && !isVowel(s.charAt(i - 1)) && !isVowel(s.charAt(i + 1))) {
                    continue;
                }
            }
            sb.append(ch);
        }
        return sb.toString();
    }
    
    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        String s1 = "bab";
        String s2 = "ceghij";

        System.out.println("Result for \"bab\": " + sandwichedVowel(s1));     
        System.out.println("Result for \"ceghij\": " + sandwichedVowel(s2)); 
    }
}

