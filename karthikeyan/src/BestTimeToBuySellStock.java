
    public class BestTimeToBuySellStock {

        // LeetCode 121 - Best Time to Buy and Sell Stock (one transaction)
        public static int maxProfit(int[] prices) {
            if (prices == null || prices.length < 2) return 0;
            int minPrice = Integer.MAX_VALUE;
            int maxProfit = 0;
            for (int p : prices) {
                if (p < minPrice) minPrice = p;
                else if (p - minPrice > maxProfit) maxProfit = p - minPrice;
            }
            return maxProfit;
        }

        // Simple test
        public static void main(String[] args) {
            int[] prices = {7,1,5,3,6,4};
            System.out.println(maxProfit(prices)); // expected 5
        }
    }

