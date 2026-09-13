import java.util.ArrayList;
import java.util.List;

public class CompeteSkills {
    public List<Long> scores(long[] a, long[] b) {
        long scoreA = 0;
        long scoreB = 0;

        for (int i = 0; i < 3; i++) {
            if (a[i] > b[i]) {
                scoreA++;
            } else if (b[i] > a[i]) {
                scoreB++;
            }
        }

        List<Long> result = new ArrayList<>();
        result.add(scoreA);
        result.add(scoreB);
        return result;
    }

    public static void main(String[] args) {
        CompeteSkills solver = new CompeteSkills();
        long[] a1 = {4, 2, 7};
        long[] b1 = {5, 6, 3};
        System.out.println("Output: " + solver.scores(a1, b1)); 
        long[] a2 = {4, 2, 7};
        long[] b2 = {5, 2, 8};
        System.out.println("Output: " + solver.scores(a2, b2)); 
    }
}