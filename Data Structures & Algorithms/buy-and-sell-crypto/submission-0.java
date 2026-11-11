class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i=1;i<prices.length;i++) {
            int price = prices[i];
            if (price < minPrice) {
                minPrice = price;
            } else if(price>minPrice){
                int profit = price - minPrice;
                maxProfit = Math.max(profit, maxProfit);
            }
        }

        return maxProfit;
    }
}
