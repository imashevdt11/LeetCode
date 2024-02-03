package P1897;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean makeEqual(String[] words) {
        if (words.length == 1) return true;
        HashMap<Character, Integer> amountOfCharacters = new HashMap<>();

        for (String word: words) {
            for (int i = 0; i < word.length(); i++) {
                if (amountOfCharacters.containsKey(word.charAt(i))) {
                    amountOfCharacters.put(word.charAt(i), amountOfCharacters.get(word.charAt(i))+1);
                } else {
                    amountOfCharacters.put(word.charAt(i), 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> entry: amountOfCharacters.entrySet()) {
            if (entry.getValue() % words.length != 0) return false;
        }

        return true;
    }
}
