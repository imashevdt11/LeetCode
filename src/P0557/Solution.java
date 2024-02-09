package P0557;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String reverseWords(String s) {
        List<String> words = new ArrayList<>(List.of(s.split(" ")));
        StringBuilder reversedWordsString = new StringBuilder();
        for (String word: words) {
            for (int i = word.length()-1; i >= 0; i--) {
                reversedWordsString.append(word.charAt(i));
            }
            reversedWordsString.append(" ");
        }
        return String.valueOf(reversedWordsString.substring(0, reversedWordsString.length()-1));
    }
}
