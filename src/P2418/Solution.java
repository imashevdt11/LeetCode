package P2418;

import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        if (names.length == 1) return names;
        HashMap<Integer, String> peopleHeights = new HashMap<>();

        for (int i = 0; i < names.length; i++) {
            peopleHeights.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        String[] sortedArray = new String[names.length];

        int counter = 0;

        for (int i = heights.length-1; i >= 0; i--) {
            sortedArray[counter] = peopleHeights.get(heights[i]);
            counter++;
        }

        return sortedArray;
    }
}
