package P1832;

class Solution {
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) return false;

        for (int i = 97; i <= 122; i++) {
            char character = (char) i;
            if (!sentence.contains(String.valueOf(character))) return false;
        }
        return true;
    }
}
