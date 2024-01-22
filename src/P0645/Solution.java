package P0645;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] findErrorNums(int[] nums) {
        if (nums.length == 2) {
            if (nums[1] == 2) return new int[]{nums[1], 1};
            return new int[]{nums[1], nums[1]+1};
        }

        ArrayList<Integer> allNumbers = new ArrayList<>();
        for (int num: nums) {
            allNumbers.add(num);
        }

        Arrays.sort(nums);
        int missingNumber = 0;
        int duplicateNumber = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                duplicateNumber = nums[i];
            }
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!allNumbers.contains(i)) missingNumber = i;
        }
        return new int[]{duplicateNumber, missingNumber};
    }
}
