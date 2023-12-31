package P1160;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int countCharacters(String[] words, String chars) {

        int counter = 0;
        String[] charsArray = chars.split("");
        boolean isValid = false;
        for (String s : words) {
            if (s.isEmpty() || s.length() > 1000) {
                break;
            }
            String[] word = s.split("");
            ArrayList<String> charsArrayDuplicate = new ArrayList<>();
            Collections.addAll(charsArrayDuplicate, charsArray);
            for (String character : word) {
                for (String char_ : charsArrayDuplicate) {
                    if (character.equals(char_)) {
                        charsArrayDuplicate.remove(char_);
                        isValid = true;
                        break;
                    } else {
                        isValid = false;
                    }
                }
                if (!isValid) {
                    break;
                }
            }
            if (isValid) {
                counter += word.length;
            }
        }
        return counter;
    }
}
