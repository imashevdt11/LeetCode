package P1805;

import java.util.HashSet;

class Solution {
    public int numDifferentIntegers(String word) {
        HashSet<String> differentIntegers = new HashSet<>();
        String digits = "0123456789";

        for (int i = 0; i < word.length(); i++) {
            if (digits.contains(word.substring(i, i+1))) {
                StringBuilder number = new StringBuilder();
                number.append(word.charAt(i));
                for (int j = i+1; j < word.length(); j++) {
                    if (digits.contains(word.substring(j, j+1))) {
                        number.append(word.charAt(j));
                        i++;
                    } else break;
                }

                while (number.charAt(0) == '0') {
                    if (number.length() == 1) break;
                    number.delete(0, 1);
                }
                differentIntegers.add(String.valueOf(number));
            }
        }
        return differentIntegers.size();
    }
}
