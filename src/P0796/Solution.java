package P0796;

class Solution {
    public boolean rotateString(String s, String goal) {

        StringBuilder goalStringBuilder = new StringBuilder(goal);
        for (int i = 0; i < s.length(); i++) {
            StringBuilder sStringBuilder = new StringBuilder();
            if (i == 0) {
                sStringBuilder.append(s);
            } else {
                sStringBuilder.append(s.substring(i));
                sStringBuilder.append(s, 0, i);
            }
            if (sStringBuilder.compareTo(goalStringBuilder) == 0) {
                return true;
            }
        }
        return false;
    }
}
