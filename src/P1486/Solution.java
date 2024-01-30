package P1486;

class Solution {
    public int xorOperation(int n, int start) {
        if (n == 1) return start;
        int result = start;
        for (int i = 2; i <= n; i++) {
            start += 2;
            result ^= start;
        }
        return result;
    }
}
