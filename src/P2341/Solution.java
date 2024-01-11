package P2341;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] numberOfPairs(int[] nums) {
        if (nums.length == 1) return new int[]{0, 1};
        Arrays.sort(nums);
        ArrayList<Integer> pairsIndexes = new ArrayList<>();
        int pairsCounter = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] == nums[i]) {
                pairsCounter++;
                pairsIndexes.add(i-1);
                pairsIndexes.add(i);
                i++;
            }
        }
        return new int[]{pairsCounter, nums.length-pairsIndexes.size()};
    }
}
