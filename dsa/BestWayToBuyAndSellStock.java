public class BestWayToBuyAndSellStock {
    public int maxProfit(int[] prices) {
       int n = prices.length;
       int maxProfit = 0;

       
       int miniBuy = prices[0];
       
       for(int i=0; i<n; i++){
        int cost = prices[i] - miniBuy;
        maxProfit = Math.max(maxProfit, cost);
        miniBuy = Math.min(miniBuy, prices[i]);

       }
       return maxProfit;
        
    }
}
