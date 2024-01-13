package P1984;

import java.util.Arrays;

class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);

        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i <= nums.length - k; i++) {
            int currentDifference = nums[i + k - 1] - nums[i];
            minDifference = Math.min(minDifference, currentDifference);
        }

        return minDifference;
    }
}