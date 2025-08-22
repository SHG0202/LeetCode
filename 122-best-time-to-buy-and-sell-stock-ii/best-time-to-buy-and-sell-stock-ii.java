class Solution {
    public int maxProfit(int[] prices) {
        boolean buy = false;
        int current = 0;
        int profit = 0;

        for(int i=0;i<prices.length-1;i++){

            if(prices[i+1] > prices[i]){
                if(buy == false){
                    buy = true;
                    current = prices[i];
                }
            }else if(prices[i+1] < prices[i]){
                if(buy == true){
                    buy = false;
                    profit += prices[i] - current;
                }
            }
        }

        if(buy == true){
            buy = false;
            profit += prices[prices.length-1] - current;
        }

        return profit;
    }
}