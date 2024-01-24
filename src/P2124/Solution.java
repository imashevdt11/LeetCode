package P2124;

class Solution {
    public boolean checkString(String s) {
        if (s.length() == 1 || (s.contains("a") && !s.contains("b")) || (s.contains("b") && !s.contains("a"))) return true;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == 'a' && s.charAt(i-1) == 'b') return false;
        }
        return true;
    }
}