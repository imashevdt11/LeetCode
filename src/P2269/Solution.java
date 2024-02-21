package P2269;

class Solution {
    public int divisorSubstrings(int num, int k) {
        int numLength = String.valueOf(num).length();
        int numClone = num;
        int[] digits = new int[numLength];
        int counter = 0;

        for (int i = 0; i < numLength; i++) {
            digits[i] = (int) (numClone / Math.pow(10, (numLength - 1 - i)));
            numClone %= (int) Math.pow(10, (numLength - 1 - i));
        }
        for (int i = digits.length-1; i >= k-1; i--) {
            int number = 0;
            int t = 1;
            for (int j = i; j >= i-k+1; j--) {
                number += digits[j] * t;
                t *= 10;
            }
            if (number > 0 && num % number == 0) {
                counter++;
            }
        }
        return counter;
    }
}