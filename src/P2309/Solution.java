package P2309;

class Solution {
    public String greatestLetter(String s) {
        char[] chars = s.toCharArray();
        char greatestLetter = 0;

        for (int i = 0; i < chars.length; i++) {
            if (greatestLetter == chars[i] || Math.abs(greatestLetter - chars[i]) == 32) continue;
            for (int j = i+1; j < chars.length; j++) {
                if (chars[j] - chars[i] == 32 && greatestLetter < chars[i]) {
                    greatestLetter = chars[i];
                    break;
                } else if (chars[j] - chars[i] == -32 && greatestLetter < chars[j]) {
                    greatestLetter = chars[j];
                    break;
                }
            }
        }
        if (greatestLetter == 0) return "";
        return String.valueOf(greatestLetter);
    }
}
