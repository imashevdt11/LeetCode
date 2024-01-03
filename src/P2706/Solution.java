package P2706;

class Solution {
    public int buyChoco(int[] prices, int money) {

        int balance = -1;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (money - (prices[i] + prices[j]) > balance) {
                    balance = money - (prices[i] + prices[j]);
                }
            }
        }
        if (balance < 0) {
            return money;
        } else {
            return balance;
        }
    }
}
