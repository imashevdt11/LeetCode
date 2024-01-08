package P2404;

import java.util.Arrays;

class Solution {
    public int mostFrequentEven(int[] nums) {
        if (nums.length == 1) {
            if (nums[0] % 2 == 0) return nums[0];
            else return -1;
        }

        int mostFrequentEven = 0;
        int counterMFE = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int counter = 1;

                for (int j = i+1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) counter++;
                }
                if (counter > counterMFE) {
                    counterMFE = counter;
                    mostFrequentEven = nums[i];
                }
            }
        }
        if (counterMFE == 0) return -1;
        return mostFrequentEven;
    }
}
