package P0905;

import java.util.ArrayList;

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if (nums.length == 1) return nums;
        ArrayList<Integer> integers = new ArrayList<>();

        for (int num: nums) {
            if (num % 2 == 0) integers.add(0, num);
            else integers.add(num);
        }

        int[] sortedArray = new int[integers.size()];

        for (int i = 0; i < integers.size(); i++) {
            sortedArray[i] = integers.get(i);
        }

        return sortedArray;
    }
}
