package P1790;

class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        char[] s1Chars = s1.toCharArray();
        char forSwap1 = 0, forSwap2 = 0;
        int counter = 0;
        int i = 0;

        for (char char2: s2.toCharArray()) {
            if (counter > 2) return false;
            if (s1Chars[i] != char2) {
                if (counter > 0) {
                    if (s1Chars[i] != forSwap2 || char2 != forSwap1) return false;
                } else {
                    forSwap1 = s1Chars[i];
                    forSwap2 = char2;
                }
                counter++;
            }
            i++;
        }
        return counter != 1;
    }
}
