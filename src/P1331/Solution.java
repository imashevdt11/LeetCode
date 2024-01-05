package P1331;

import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] arrayRankTransform(int[] arr) {

        if (arr.length == 0) return arr;

        int[] sortedArray = new int[arr.length];
        System.arraycopy(arr, 0, sortedArray, 0, arr.length);
        Arrays.sort(sortedArray);

        HashMap<Integer, Integer> numsAndRanks = new HashMap<>();
        int rank = 2;
        int previous = sortedArray[0];
        numsAndRanks.put(sortedArray[0], 1);

        for (int i = 1; i < sortedArray.length; i++) {
            if (sortedArray[i] != previous) {
                numsAndRanks.put(sortedArray[i], rank);
                rank++;
            }
            previous = sortedArray[i];
        }
        int[] ranks = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ranks[i] = numsAndRanks.get(arr[i]);
        }
        return ranks;
    }
}
