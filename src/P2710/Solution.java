package P2710;

class Solution {
    public String removeTrailingZeros(String num) {
        char[] digits = num.toCharArray();

        int index = 0;
        for (int i = digits.length-1; i >= 0; i--) {
            if (digits[i] != '0') {
                index = i+1;
                break;
            }
        }
        return num.substring(0, index);
    }
}