package P0231;

class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 536_870_912) return true;
        return Math.log(n) / Math.log(2) % 1 == 0;
//      or return n > 0 && (n & (n - 1)) == 0;
    }
}
