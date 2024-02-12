package P0824;

class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder sentence2 = new StringBuilder();

        char[] sChars = sentence.toCharArray();
        char[] vowels = {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'};
        boolean isVowel = false;
        char startChar = 0;
        int startIndex = 0;
        int aCounter = 2;

        for (int i = 0; i < sChars.length; i++) {
            if (i == 0 || sChars[i-1] == ' ') {
                startChar = sChars[i];
                startIndex = i;
                isVowel = false;
                for (char c: vowels) {
                    if (sChars[i] == c) {
                        isVowel = true;
                        break;
                    }
                }
            }
            if (sChars[i] == ' ') {
                if (!isVowel) sentence2.append(startChar);
                sentence2.append('m');
                for (int j = 0; j < aCounter; j++) {
                    sentence2.append('a');
                }
                sentence2.append(' ');
                aCounter++;
                continue;
            }
            if (!isVowel && startIndex == i && startIndex != sChars.length-1) continue;
            else {
                sentence2.append(sChars[i]);
            }
            if (i == sChars.length-1) {
                if (!isVowel && startIndex != sChars.length-1) sentence2.append(startChar);
                sentence2.append('m');
                for (int j = 0; j < aCounter; j++) {
                    sentence2.append('a');
                }
            }
        }
        return String.valueOf(sentence2);
    }
}