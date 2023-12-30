package P0001;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] answerIndexes = new int[2];
        int jCounter = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = jCounter; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    answerIndexes[0] = i;
                    answerIndexes[1] = j;
                    break;
                }
            }
            if (answerIndexes[1] > 0)
                break;
            jCounter++;
        }
        return answerIndexes;
    }
}
