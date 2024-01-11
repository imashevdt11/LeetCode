package P1051;

import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {
        if (heights.length == 1) return 0;
        int counter = 0;
        int[] heightsDuplicate = new int[heights.length];
        System.arraycopy(heights, 0, heightsDuplicate, 0, heights.length);
        Arrays.sort(heightsDuplicate);

        for (int i = 0; i < heights.length; i++) {
            if (heightsDuplicate[i] != heights[i]) {
                counter++;
            }
        }
        return counter;
    }
}
