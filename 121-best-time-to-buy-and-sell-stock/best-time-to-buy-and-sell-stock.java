class Solution {
    public int maxProfit(int[] prices) {
        int mini = prices[0];
        int maxprofiit = 0;
        for (int i = 1; i < prices.length; i++) {
            int currprofit = prices[i] - mini;
            maxprofiit = Math.max(maxprofiit, currprofit);
            mini = Math.min(mini, prices[i]);
        }
        return maxprofiit;
    }

}