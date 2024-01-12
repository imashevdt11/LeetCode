package P2000;

class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder string = new StringBuilder(word);
        int indexOfCh = string.indexOf(String.valueOf(ch));
        if (indexOfCh == -1) return word;

        StringBuilder newSubString = new StringBuilder();

        for (int i = indexOfCh; i >= 0; i--) {
            newSubString.append(string.charAt(i));
        }
        string.replace(0, indexOfCh, String.valueOf(newSubString));

        return String.valueOf(string);
    }
}
