package P0728;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfDividingNumbers = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            int num = i;
            if (i > 999) {
                if (i % (i / 1000) != 0) continue;
                num = i % 1000;
                if (num < 100) continue;
            }
            if (i > 99) {
                if (i % (num / 100) != 0) continue;
                num = i % 100;
                if (num < 10) continue;
            }
            if (i > 9) {
                if (i % (num / 10) != 0) continue;
                num = i % 10;
            }
            if (num != 0 && i % num == 0) selfDividingNumbers.add(i);
        }
        return selfDividingNumbers;
    }
}