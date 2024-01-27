package P1365;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] smallerThanNum = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;
                if (nums[i] > nums[j]) sum++;
            }
            smallerThanNum[i] = sum;
        }
        return smallerThanNum;
    }
}
