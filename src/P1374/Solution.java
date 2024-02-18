package P1374;

class Solution {
    public String generateTheString(int n) {
        if (n == 1) return "a";

        StringBuilder string = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i == n-1) {
                string.append('c');
                break;
            } else if (n % 2 != 0 && i == n-2) {
                string.append('b');
                continue;
            }
            string.append('a');
        }
        return String.valueOf(string);
    }
}