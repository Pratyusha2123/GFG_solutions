public class StockProfitCalculator {
    public static void main(String[] args) {
        int[] prices1 = {7, 10, 1, 3, 6, 9, 2};
        System.out.println("Output for Example 1: " + maxProfit(prices1));
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Output for Example 2: " + maxProfit(prices2));
    }

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        
        int minPrice = prices[0];
        int maxProfit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }
        
        return maxProfit;
    }
}
