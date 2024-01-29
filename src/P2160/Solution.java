package P2160;

import java.util.Arrays;

class Solution {
    public int minimumSum(int num) {
        int[] numbers = new int[4];
        String numString = String.valueOf(num);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numString.substring(i, i+1));
        }
        Arrays.sort(numbers);
        return numbers[0] * 10 + numbers[1] + numbers[2] * 10 + numbers[3];
    }
}
