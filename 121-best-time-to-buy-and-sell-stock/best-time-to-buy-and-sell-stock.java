class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int maxProfit = 0;
        int minLeft = prices[0];

        // for(int i=0;i<len-1;i++){
        //     for(int j=i+1;j<len;j++){
        //         maxProfit = (prices[j] - prices[i]) > maxProfit ? (prices[j] - prices[i]) : maxProfit;
        //     }
        // }

        for(int i=1;i<len;i++){
            minLeft = Math.min(minLeft, prices[i-1]);
            maxProfit = Math.max((prices[i] - minLeft) , maxProfit);
        }

        return maxProfit;
    }
}