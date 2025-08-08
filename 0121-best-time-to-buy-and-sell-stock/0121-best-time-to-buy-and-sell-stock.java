class Solution {
    public int maxProfit(int[] prices) {
        int day_buy = Integer.MAX_VALUE;
        int day_sell = 0;
        for(int i=0 ; i <prices.length ;i++){
            if(day_buy > prices[i]) day_buy = prices[i];
            else
            day_sell = Math.max(day_sell ,  prices[i]-day_buy );
        }
        return day_sell;
    }
}