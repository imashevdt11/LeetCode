package P0268;

import java.util.ArrayList;

class Solution {
    public int missingNumber(int[] nums) {

        int missingNumber = 0;
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i: nums) {
            integers.add(i);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!integers.contains(i)) {
                missingNumber = i;
            }
        }
        return missingNumber;
    }
}
