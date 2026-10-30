
class FascinatingNumber {
    
    public static boolean isFascinating(long n) {
        if (n < 100) return false;
        
        String s = "" + n + (n * 2) + (n * 3);
        if (s.length() != 9) return false;
        
        int[] freq = new int[10];
        for (char c : s.toCharArray()) {
            int digit = c - '0';
            if (digit == 0 || freq[digit] > 0) {
                return false;
            }
            freq[digit]++;
        }
        return true;
    }
    public static void main(String[] args) {
        long n = 192;
        System.out.println(isFascinating(n)); 
    }
}
