package P2535;

class Solution {
    public int differenceOfSum(int[] nums) {
        if (nums.length == 1) return nums[0];
        int elementsSum = 0;
        int digitsSum = 0;

        for (int num : nums) {
            if (num < 10) digitsSum += num;
            else {
                String stringNum = String.valueOf(num);
                for (int i = 0; i < stringNum.length(); i++) {
                    digitsSum += Integer.parseInt(stringNum.substring(i, i+1));
                }
            }
            elementsSum += num;
        }
        return Math.abs(elementsSum - digitsSum);
    }
}