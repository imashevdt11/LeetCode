package P0500;

import java.util.ArrayList;

class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> theseWords = new ArrayList<>();
        String highest = "qQwWeErRtTyYuUiIoOpP";
        String middle = "aAsSdDfFgGhHjJkKlL";
        String lowest = "zZxXcCvVbBnNmM";

        for (String word : words) {
            boolean containsHighest = false;
            boolean containsMiddle = false;
            boolean containsLowest = false;
            for (int j = 0; j <= word.length(); j++) {
                if (highest.contains(String.valueOf(word.charAt(j)))) containsHighest = true;
                else if (middle.contains(String.valueOf(word.charAt(j)))) containsMiddle = true;
                else if (lowest.contains(String.valueOf(word.charAt(j)))) containsLowest = true;
            }
            if ((containsLowest && containsMiddle) || (containsMiddle && containsHighest) || (containsHighest && containsLowest)) continue;
            else theseWords.add(word);
        }
        String[] words_ = new String[theseWords.size()];

        for (int i = 0; i < words_.length; i++) {
            words_[i] = theseWords.get(i);
        }
        return words_;
    }
}
