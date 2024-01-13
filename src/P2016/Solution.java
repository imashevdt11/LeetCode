package P2016;

class Solution {
    public int maximumDifference(int[] nums) {

        int maximumDifference = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (maximumDifference < nums[j] - nums[i]) {
                    maximumDifference = nums[j] - nums[i];
                }
            }
        }
        if (maximumDifference == 0) return -1;

        return maximumDifference;
    }
}
