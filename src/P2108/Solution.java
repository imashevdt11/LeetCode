package P2108;

class Solution {
    public String firstPalindrome(String[] words) {
        for (String word: words) {
            char[] chars = word.toCharArray();
            boolean isPalindrome = true;
            for (int i = 0; i < chars.length / 2; i++) {
                if (chars[i] != chars[chars.length-1-i]) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) return word;
        }
        return "";
    }
}