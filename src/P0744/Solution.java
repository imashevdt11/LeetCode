package P0744;

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char currentAnswer = 0;

        for (char letter : letters) {
            if (letter > target && letter < currentAnswer) {
                currentAnswer = letter;
                continue;
            }
            if (letter > target && currentAnswer == 0) currentAnswer = letter;
        }
        if (currentAnswer == 0) return letters[0];
        return currentAnswer;
    }
}
