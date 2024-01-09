package P0896;

class Solution {
    public boolean isMonotonic(int[] nums) {
        if (nums.length <= 2) {
            return true;
        }

        int tendency = 0;
        for (int i = 1; i < nums.length-1; i++) {
            boolean same = (nums[i] == nums[i-1]) && (nums[i+1] == nums[i]);
            boolean decline = (nums[i] <= nums[i-1]) && (nums[i+1] <= nums[i]);
            boolean growth = (nums[i] >= nums[i-1]) && (nums[i+1] >= nums[i]);

            if ((tendency == 1 && !growth) || (tendency == -1 && !decline)) {
                return false;
            }
            if (tendency == 0) {
                if (growth || decline) {
                    if (same) continue;
                    if (growth) tendency = 1;
                    else tendency = -1;
                } else return false;
            }
        }
        return true;
    }
}
