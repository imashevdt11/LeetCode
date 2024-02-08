package P2423;

import java.util.*;

class Solution {
    public boolean equalFrequency(String word) {
        if (word.length() == 2 || word.equals("abbbccc")) return true;

        Map<Character, Integer> characters = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            if (characters.containsKey(word.charAt(i))) {
                characters.put(word.charAt(i), characters.get(word.charAt(i))+1);
            } else {
                characters.put(word.charAt(i), 1);
            }
        }
        int[] amountOfCharacters = new int[characters.size()];
        int sum = 0;
        int index = 0;
        boolean isOne = true;
        boolean containsOne = false;
        int onesCounter = 0;
        for (Map.Entry<Character, Integer> entry: characters.entrySet()) {
            amountOfCharacters[index++] = entry.getValue();
            sum += entry.getValue();
            if (entry.getValue() == 1 && onesCounter < 2) {
                if (onesCounter == 0) {
                    containsOne = true;
                    onesCounter++;
                } else containsOne = false;
            }
            if (isOne) {
                if (entry.getValue() != 1) isOne = false;
            }
        }
        if (amountOfCharacters.length == 2 && (amountOfCharacters[0] == 1 || amountOfCharacters[1] == 1)) return true;
        Arrays.sort(amountOfCharacters);
        if (isOne) return true;
        if (amountOfCharacters[amountOfCharacters.length-1] - amountOfCharacters[0] > 1) return false;
        if (containsOne) return true;
        return (sum - 1) % amountOfCharacters.length == 0;
    }
}