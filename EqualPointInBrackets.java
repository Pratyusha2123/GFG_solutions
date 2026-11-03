class EqualPointInBrackets {
    public static int findIndex(String s) {
        int countClose = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                countClose++;
            }
        }
        int countOpen = 0;
        for (int i = 0; i < s.length(); i++) {
            if (countOpen == countClose) {
                return i;
            }
            if (s.charAt(i) == '(') {
                countOpen++;
            } else {
                countClose--;
            }
        }
        if (countOpen == countClose) {
            return s.length();
        }
        
        return -1;
    }

    public static void main(String[] args) {
        String s = "(())))(";
        System.out.println(findIndex(s)); 
    }
}
