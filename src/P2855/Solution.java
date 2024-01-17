package P2855;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        if (nums.size() == 1) return 0;
        boolean isRightOrder = true;

        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i-1) > nums.get(i)) {
                isRightOrder = false;
                break;
            }
        }

        if (isRightOrder) return 0;
        List<Integer> nums1 = new ArrayList<>();
        int start;
        int counter = 0;

        for (int i = 1; i <= nums.size(); i++) {
            start = nums.size()-i;
            while (nums1.size() != nums.size()) {
                if (start == nums.size()) start = 0;
                nums1.add(nums.get(start));
                start++;
            }
            System.out.println(nums1);

            for (int j = 1; j < nums1.size(); j++) {
                if (nums1.get(j-1) <= nums1.get(j)) isRightOrder = true;
                else {
                    isRightOrder = false;
                    break;
                }
            }
            counter++;
            if (isRightOrder) return counter;
            nums1.clear();
        }
        return -1;
    }
}
