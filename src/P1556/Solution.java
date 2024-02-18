package P1556;

class Solution {
    public String thousandSeparator(int n) {
        if (n < 1000) return Integer.toString(n);

        StringBuilder s = new StringBuilder(Integer.toString(n));

        for (int i = s.length()-3; i >= 0; i -= 3) {
            if (i == 0) continue;
            s.insert(i, '.');
        }
        return String.valueOf(s);
    }
}