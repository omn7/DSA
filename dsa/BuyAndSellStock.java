public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] price = {6, 4, 5, 4, 7, 6};
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < price.length; i++) {
            // If current price is smaller than previous buyPrice → update buyPrice
            if (price[i] < buyPrice) {
                buyPrice = price[i];
            }
            // Else calculate profit if selling today
            else {
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        System.out.println("Maximum Profit: " + maxProfit);
    }
}
