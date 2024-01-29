package P1431;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> kidsWithCandies = new ArrayList<>();
        int max = -1;
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }
        for (int candy : candies) {
            kidsWithCandies.add(max <= candy + extraCandies);
        }
        return kidsWithCandies;
    }
}
