package P1464;

class Solution {
    public int maxProduct(int[] nums) {

        int[] combination = new int[2];
        combination[0] = nums[0];
        combination[1] = nums[1];

        if (nums.length > 2) {
            for (int i = 0; i < nums.length-1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (((combination[0] - 1) * (combination[1] - 1)) < ((nums[i] - 1) * (nums[j] - 1))) {
                        combination[0] = nums[i];
                        combination[1] = nums[j];
                    }
                }
            }
        }
        return (combination[0] - 1) * (combination[1] - 1);
    }
}
