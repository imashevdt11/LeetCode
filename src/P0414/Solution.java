package P0414;

import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {
        if (nums.length == 1) return nums[0];
        Arrays.sort(nums);
        if (nums.length == 2) return nums[1];
        int counter = 1;

        for (int i = nums.length-2; i >= 0; i--) {
            if (nums[i] != nums[i+1]) counter++;
            if (counter == 3) return nums[i];
        }
        return nums[nums.length-1];
    }
}