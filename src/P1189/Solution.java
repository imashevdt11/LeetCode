package P1189;

import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int maxNumberOfBalloons(String text) {
        ArrayList<Character> balloonCharacters = new ArrayList<>();
        balloonCharacters.add('b');
        balloonCharacters.add('a');
        balloonCharacters.add('l');
        balloonCharacters.add('o');
        balloonCharacters.add('n');
        HashMap<Character, Integer> charAmount = new HashMap<>();
        for (Character character: balloonCharacters) {
            charAmount.put(character, 0);
        }

        for (int i = 0; i < text.length(); i++) {
            if (balloonCharacters.contains(text.charAt(i))) {
                int value = charAmount.get(text.charAt(i)) + 1;
                charAmount.put(text.charAt(i), value);
            }
        }
        int numberOfBalloons = 0;

        while (true) {
            if (charAmount.get('b') >= 1 && charAmount.get('a') >= 1 && charAmount.get('l') >= 2 &&
                                            charAmount.get('o') >= 2 && charAmount.get('n') >= 1)
            {
                charAmount.put('b', charAmount.get('b')-1);
                charAmount.put('a', charAmount.get('a')-1);
                charAmount.put('l', charAmount.get('l')-2);
                charAmount.put('o', charAmount.get('o')-2);
                charAmount.put('n', charAmount.get('n')-1);
                numberOfBalloons++;
            }
            else {
                break;
            }
        }
        return numberOfBalloons;
    }
}
