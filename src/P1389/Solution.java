package P1389;

import java.util.ArrayList;

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        if (nums.length == 1) return new int[] {nums[0]};
        ArrayList<Integer> arrayList = new ArrayList<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            arrayList.add(index[i], nums[i]);
        }
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            target[i] = arrayList.get(i);
        }
        return target;
    }
}