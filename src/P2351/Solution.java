package P2351;

import java.util.ArrayList;

class Solution {
    public char repeatedCharacter(String s) {
        if (s.length() == 2) return s.charAt(0);
        ArrayList<Character> characters = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (characters.contains(s.charAt(i))) return s.charAt(i);
            else characters.add(s.charAt(i));
        }
        return ' ';
    }
}
