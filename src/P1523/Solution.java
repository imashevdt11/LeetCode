package P1523;

class Solution {
    public int countOdds(int low, int high) {
        if (high - low == 1) return 1;
        int result = (high - low) / 2;
        if ((high - low) % 2 != 0) result++;
        if (low % 2 != 0 && high % 2 != 0) return result + 1;
        return result;
    }
}
