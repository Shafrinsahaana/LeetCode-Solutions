class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            // Found a better buying price
            if (prices[i] < min) {
                min = prices[i];
            }
            // Calculate profit if sold today
            else {
                int profit = prices[i] - min;

                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
}

     
