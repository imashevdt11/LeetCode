package P1768;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder mergedString = new StringBuilder();
        int biggerWord = Math.max(word1.length(), word2.length());

        for (int i = 0; i < biggerWord; i++) {
            if (i < word1.length()) mergedString.append(word1.charAt(i));
            if (i < word2.length()) mergedString.append(word2.charAt(i));
        }
        return String.valueOf(mergedString);
    }
}
