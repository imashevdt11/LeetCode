package P1816;

class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder string = new StringBuilder();

        int spaceCounter = 0;
        for (char c: s.toCharArray()) {
            if (c == ' ') {
                spaceCounter++;
                if (k == spaceCounter) {
                    break;
                }
            }
            string.append(c);
        }
        return String.valueOf(string);
    }
}
