package Day4;


public class StockBuySell {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        StockBuySell stock = new StockBuySell();

        // Example test case
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = stock.maxProfit(prices);

        System.out.println("Maximum Profit: " + result);
    }
}
