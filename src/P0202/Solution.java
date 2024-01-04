package P0202;

import java.util.ArrayList;

class Solution {
    public boolean isHappy(int n) {

        int sum = n;
        boolean isHappy = true;
        ArrayList<Integer> sums = new ArrayList<>();
        while (sum != 1) {
            if (sums.contains(sum)) {
                isHappy = false;
                break;
            }
            sums.add(sum);
            String numberStr = Integer.toString(sum);
            int length = numberStr.length();
            ArrayList<Integer> digits = new ArrayList<>();
            for (int i = 0; i < length; i++) {
                int digit = sum % 10;
                digits.add(digit);
                sum /= 10;
            }
            sum = 0;
            for (Integer digit : digits) {
                sum += digit*digit;
            }
        }
        return isHappy;
    }
}
