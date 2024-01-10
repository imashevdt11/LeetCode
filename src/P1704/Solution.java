package P1704;

class Solution {
    public boolean halvesAreAlike(String s) {
        char[] characters = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int countFirstHalf = 0;
        int countSecondHalf = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() / 2) {
                for (char character : characters) {
                    if (character == s.charAt(i)) countFirstHalf++;
                }
            } else {
                for (char character : characters) {
                    if (character == s.charAt(i)) countSecondHalf++;
                }
            }
        }

        return countSecondHalf == countFirstHalf;
    }
}
