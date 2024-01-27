package P1480;

class Solution {
    public int[] runningSum(int[] nums) {
        int[] numsRunningSum = new int[nums.length];
        int sumToAdd = 0;
        for (int i = 0; i < nums.length; i++) {
            numsRunningSum[i] = nums[i] + sumToAdd;
            sumToAdd += nums[i];
        }
        return numsRunningSum;
    }
}
