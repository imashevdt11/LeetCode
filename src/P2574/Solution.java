package P2574;

class Solution {
    public int[] leftRightDifference(int[] nums) {
        if (nums.length == 1) return new int[1];

        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];

        for (int i = 1; i < leftSum.length; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i - 1];
        }

        for (int i = rightSum.length-2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + nums [i + 1];
        }

        int[] leftRightDifference = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int answer = leftSum[i] - rightSum[i];
            if (answer < 0) answer *= -1;
            leftRightDifference[i] = answer;
        }
        return leftRightDifference;
    }
}
