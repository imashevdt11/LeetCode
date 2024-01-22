package P2144;

import java.util.Arrays;

class Solution {
    public int minimumCost(int[] cost) {
        if (cost.length == 1) return cost[0];
        if (cost.length == 2) return cost[0] + cost[1];
        Arrays.sort(cost);
        int sum = 0;

        for (int i = cost.length-1; i >= 0; i--) {
            if (i == 0) sum += cost[i];
            else sum += cost[i] + cost[i-1];
            i -= 2;
        }
        return sum;
    }
}
