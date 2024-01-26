package P2828;

import java.util.List;

class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if (words.size() == s.length()) {
            boolean isAcronym = true;
            for (int i = 0; i < words.size(); i++) {
                if (words.get(i).charAt(0) != s.charAt(i)) return false;
            }
            return isAcronym;
        }
        return false;
    }
}
