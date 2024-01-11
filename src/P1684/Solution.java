package P1684;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int consistentStringsCounter = 0;
        ArrayList<String> allowedCharacters = new ArrayList<>(List.of(allowed.split("")));

        for (String word : words) {
            boolean isConsistent = true;
            String[] wordChars = word.split("");
            for (String wordChar : wordChars) {
                if (!allowedCharacters.contains(wordChar)) {
                    isConsistent = false;
                    break;
                }
            }
            if (isConsistent) consistentStringsCounter++;
        }

        return consistentStringsCounter;
    }
}
