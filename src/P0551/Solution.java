package P0551;

class Solution {
    public boolean checkRecord(String s) {
        if (s.length() == 1) return true;
        int counterLSequence = 0;
        boolean isPreviousL = false;
        int counterA = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                isPreviousL = true;
                counterLSequence++;
            }
            else if (s.charAt(i) == 'L' && isPreviousL) counterLSequence++;
            else {
                isPreviousL = false;
                counterLSequence = 0;
            }
            if (s.charAt(i) == 'A') counterA++;
            if (counterA == 2 || counterLSequence == 3) return false;
        }
        return true;
    }
}
