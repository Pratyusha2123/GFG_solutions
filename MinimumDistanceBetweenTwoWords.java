public class MinimumDistanceBetweenTwoWords {
    public static int shortestDistance(String[] s, String word1, String word2) {
        int idx1 = -1;
        int idx2 = -1;
        int minDist = Integer.MAX_VALUE;
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals(word1)) {
                idx1 = i;
            } else if (s[i].equals(word2)) {
                idx2 = i;
            }
            if (idx1 != -1 && idx2 != -1) {
                minDist = Math.min(minDist, Math.abs(idx1 - idx2));
            }
        }
        if (idx1 == -1 || idx2 == -1) {
            return -1;
        }
        return minDist;
    }
    public static void main(String[] args) {
        String[] s1 = {"the", "quick", "brown", "fox", "quick"};
        String word1_1 = "the";
        String word2_1 = "fox";
        System.out.println("Output 1: " + shortestDistance(s1, word1_1, word2_1));
        String[] s2 = {"geeks", "for", "geeks", "contribute", "practice"};
        String word1_2 = "geeks";
        String word2_2 = "practice";
        System.out.println("Output 2: " + shortestDistance(s2, word1_2, word2_2));
    }
}
