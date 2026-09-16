public class KnapsackRunner {
    public int knapsack(int W, int val[], int wt[]) {
        int n = val.length;
        int[] dp = new int[W + 1];
        for (int i = 0; i < n; i++) {
            for (int w = W; w >= wt[i]; w--) {
                dp[w] = Math.max(dp[w], val[i] + dp[w - wt[i]]);
            }
        }
        return dp[W];
    }
    public static void main(String[] args) {
        KnapsackRunner solver = new KnapsackRunner();
        int W = 4;
        int[] val = {1, 2, 3};
        int[] wt = {4, 5, 1};

        int maxVal = solver.knapsack(W, val, wt);
        System.out.println("Maximum value in Knapsack = " + maxVal); 
    }
}