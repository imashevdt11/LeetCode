package P2325;

import java.util.HashMap;

class Solution {
    public String decodeMessage(String key, String message) {
        StringBuilder decodedMessage = new StringBuilder();
        HashMap<Character, Character> keys = new HashMap<>();

        int index = 0;
        int charPlace = 97;
        for (int i = 0; i < key.length(); i++) {
            if (index == 26) break;
            if (key.charAt(i) != ' ') {
                keys.put(key.charAt(i), (char) charPlace);
                index++;
                charPlace++;
            }
        }

        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' ') decodedMessage.append(' ');
            else {
                char originalChar = message.charAt(i);
                char decodedChar = keys.get(originalChar);
                decodedMessage.append(decodedChar);
            }
        }
        return String.valueOf(decodedMessage);
    }
}
