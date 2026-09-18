public class NthNumberWithoutDigitNine {
    public String findNth(String nStr) {
        long n = Long.parseLong(nStr);
        long result = 0;
        long p = 1;
        
        while (n > 0) {
            result += (n % 9) * p;
            n /= 9;
            p *= 10;
        }
        return Long.toString(result);
    }
    public static void main(String[] args) {
        NthNumberWithoutDigitNine obj = new NthNumberWithoutDigitNine();
        System.out.println("Input: \"8\" -> Output: \"" + obj.findNth("8") + "\"");
        System.out.println("Input: \"9\" -> Output: \"" + obj.findNth("9") + "\"");
    }
}
