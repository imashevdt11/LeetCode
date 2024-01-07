package P1929;

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];

        for (int i = 0; i <= nums.length; i++) {
            if (i == nums.length) {
                for (int num : nums) {
                    ans[i] = num;
                    i++;
                }
                break;
            }
            ans[i] = nums[i];
        }
        return ans;
    }
}
