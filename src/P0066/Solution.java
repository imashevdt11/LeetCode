package P0066;

import java.util.ArrayList;

class Solution {
    public int[] plusOne(int[] digits) {

        boolean hasChanged = false;
        int[] arrayForDigit = new int[2];
        if (digits.length == 1) {
            if (digits[0] == 9) {
                arrayForDigit[0] = 1;
            } else {
                arrayForDigit = new int[1];
                arrayForDigit[0] = digits[0] + 1;
            }
            return arrayForDigit;
        } else {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int digit : digits) {
                arrayList.add(digit);
            }
            for (int i = arrayList.size() - 1; i >= 0; i--) {
                if (i == arrayList.size() - 1) {
                    if (arrayList.get(i) != 9) {
                        arrayList.set(i, arrayList.get(i) + 1);
                        break;
                    } else {
                        arrayList.set(i, 0);
                        hasChanged = true;
                    }
                } else if (i != 0) {
                    if (arrayList.get(i) == 0) {
                        hasChanged = false;
                    }
                    if (!hasChanged) {
                        continue;
                    }
                    if (arrayList.get(i) == 9 && arrayList.get(i + 1) == 0) {
                        arrayList.set(i, 0);
                    } else if (arrayList.get(i) != 9 && arrayList.get(i + 1) == 0) {
                        arrayList.set(i, arrayList.get(i) + 1);
                    }
                } else {
                    if (arrayList.get(i) == 9 && arrayList.get(i + 1) == 0 && hasChanged) {
                        arrayList.remove(i);
                        arrayList.add(0, 1);
                        arrayList.add(i + 1, 0);
                    } else if (arrayList.get(i) != 9 && arrayList.get(i + 1) == 0 && hasChanged) {
                        arrayList.set(i, arrayList.get(i) + 1);
                    }
                }
            }
            int[] newInt = new int[arrayList.size()];
            for (int i = 0; i < newInt.length; i++) {
                newInt[i] = arrayList.get(i);
            }
            return newInt;
        }
    }
}
