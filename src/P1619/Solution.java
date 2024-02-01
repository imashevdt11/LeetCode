package P1619;

import java.util.Arrays;

class Solution {
    public double trimMean(int[] arr) {
        double trimMean = 0;

        int start = (arr.length * 5 ) / 100;
        int finish = arr.length - start;

        Arrays.sort(arr);
        for (int i = start; i < finish; i++) {
            trimMean += arr[i];
        }
        return trimMean / (finish - start);
    }
}
