package P0058;

class Solution {
    public int lengthOfLastWord(String s) {

        if (s.length() == 1 && s.charAt(0) != ' ') {
            return s.length();
        } else {
            int endIndex = 0;
            int startIndex = 0;
            boolean isBeenStringOnTheWay = false;
            for (int i = s.length() - 1; i >= 0; i--) {
                if ((s.charAt(i) != ' ') && !isBeenStringOnTheWay) {
                    endIndex = i + 1;
                    isBeenStringOnTheWay = true;
                } else if ((s.charAt(i) == ' ') && isBeenStringOnTheWay) {
                    startIndex = i + 1;
                    break;
                }
            }
            return s.substring(startIndex, endIndex).length();
        }
    }
}
