package P1422;

class Solution {
    public int maxScore(String s) {

        int maxScore = 0;
        for (int i = 1; i <= s.length(); i++) {
            if (s.substring(0, i).length() == s.length()) {
                break;
            }
            int countZeros = 0;
            int countOnes = 0;
            for (int j = 0; j < s.substring(0, i).length(); j++) {
                if (s.charAt(j) == '0') {
                    countZeros++;
                }
            }
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(j) == '1') {
                    countOnes++;
                }
            }
            if (countOnes + countZeros > maxScore) {
                maxScore = countOnes + countZeros;
            }
        }
        return maxScore;
    }
}
