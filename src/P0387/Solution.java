package P0387;

class Solution {
    public int firstUniqChar(String s) {
        if (s.length() > 1) {
            boolean isUnique = false;

            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < s.length(); j++) {
                    if (j == i) continue;
                    if (s.charAt(i) == s.charAt(j)) {
                        isUnique = false;
                        break;
                    } else isUnique = true;
                }
                if (isUnique) return i;
            }
            return -1;
        }
        return 0;
    }
}
