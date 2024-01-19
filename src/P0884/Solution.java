package P0884;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> wordsAmount = new HashMap<>();
        String[] s1Words = s1.split(" ");
        String[] s2Words = s2.split(" ");
        int biggerArray = Math.max(s1Words.length, s2Words.length);

        for (int i = 0; i < biggerArray; i++) {
            if (i < s1Words.length) {
                if (wordsAmount.containsKey(s1Words[i])) wordsAmount.put(s1Words[i], wordsAmount.get(s1Words[i])+1);
                else wordsAmount.put(s1Words[i], 1);
            }
            if (i < s2Words.length) {
                if (wordsAmount.containsKey(s2Words[i])) wordsAmount.put(s2Words[i], wordsAmount.get(s2Words[i])+1);
                else wordsAmount.put(s2Words[i], 1);
            }
        }

        ArrayList<String> strings = new ArrayList<>();

        for (Map.Entry<String, Integer> entry: wordsAmount.entrySet()) {
            if (entry.getValue() == 1) strings.add(entry.getKey());
        }

        String[] uniqueWords = new String[strings.size()];

        for (int i = 0; i < uniqueWords.length; i++) {
            uniqueWords[i] = strings.get(i);
        }
        return uniqueWords;
    }
}
