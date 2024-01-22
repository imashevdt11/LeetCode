package P2600;

class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum = 0;
        if (numOnes > 0) {
            sum += numOnes;
            k -= numOnes;
        }
        if (k < 0) sum -= k * (-1);
        if (k > 0 && numZeros > 0) k -= numZeros;
        if (k > 0 && numNegOnes > 0) sum -= k;
        return sum;
    }
}
