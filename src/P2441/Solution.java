package P2441;

import java.util.Arrays;

class Solution {
    public int findMaxK(int[] nums) {
        if (nums.length == 1) return -1;
        Arrays.sort(nums);
        for (int i = nums.length-1; i >= 1; i--) {
            for (int num : nums) {
                if (num > 0) break;
                if (-nums[i] == num) return nums[i];
            }
        }
        return -1;
    }
}
