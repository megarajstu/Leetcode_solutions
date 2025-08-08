class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int day_buy = INT_MAX;
        int day_sell = 0;
        for(int i=0 ; i <prices.size() ;i++){
            if(day_buy > prices[i]) day_buy = prices[i];
            else
            day_sell = max(day_sell ,  prices[i]-day_buy );
        }
        return day_sell;
    }
};