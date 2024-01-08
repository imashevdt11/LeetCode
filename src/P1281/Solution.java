package P1281;

class Solution {
    public int subtractProductAndSum(int n) {
        if (n > 0 && n < 10) return 0;

        int product = 1, sum = 0;
        String numberStr = Integer.toString(n);

        for (int i = 0; i < numberStr.length(); i++) {
            product *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        return product-sum;
    }
}
