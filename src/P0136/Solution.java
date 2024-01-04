package P0136;

import java.util.Arrays;

class Solution {
    public int singleNumber(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        } else {
            Arrays.sort(nums);
            int singleNumber = 0;
            for (int i = 1; i < nums.length; i++) {
                if (i == 1 && (nums[i] != nums[i - 1])) {
                    singleNumber = nums[i - 1];
                    break;
                } else if (i == nums.length - 1) {
                    singleNumber = nums[i];
                    break;
                } else if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                    singleNumber = nums[i];
                    break;
                }
            }
            return singleNumber;
        }
    }
}
