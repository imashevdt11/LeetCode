package P2006;

class Solution {
    public int countKDifference(int[] nums, int k) {
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] - nums[j] == k || nums[i] - nums[j] == -k) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
