import java.util.HashSet;
import java.util.Set;

class SmallestWindow {
    public static int findSubString(String s) {
        int n = s.length();
        if (n == 0) return 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(s.charAt(i));
        }
        int totalUnique = set.size();
        int[] freq = new int[256];
        int start = 0;
        int countUniqueInWindow = 0;
        int minLen = Integer.MAX_VALUE;
        
        for (int end = 0; end < n; end++) {
            char rightChar = s.charAt(end);
            
            if (freq[rightChar] == 0) {
                countUniqueInWindow++;
            }
            freq[rightChar]++;
            while (countUniqueInWindow == totalUnique) {
                minLen = Math.min(minLen, end - start + 1);
                char leftChar = s.charAt(start);
                freq[leftChar]--;
                if (freq[leftChar] == 0) {
                    countUniqueInWindow--;
                }
                start++;
            }
        }
        return minLen;
    }
    public static void main(String[] args) {
        String s = "aabcbcdbca";
        System.out.println(findSubString(s)); 
    }
}
