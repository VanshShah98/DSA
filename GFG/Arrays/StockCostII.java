package GFG.Arrays;

public class StockCostII {
    public static void main(String[] args) {
        int [] nums = {7, 6, 4, 3, 1};
        System.out.println(maximumProfit(nums));
    }
    public static int maximumProfit(int prices[]) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        
        int mini = Integer.MAX_VALUE; // Minimum price encountered so far
        int maxProfit = 0; // Maximum profit calculated so far
        
        for (int i = 0; i < prices.length; i++) {
            mini = Math.min(mini, prices[i]);
            int profit = prices[i] - mini;
            maxProfit = Math.max(maxProfit, profit);
        }
        
        return maxProfit;
    }
    
}
