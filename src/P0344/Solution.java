package P0344;

class Solution {
    public static void reverseString(char[] s) {

        for (int i = 0; i < s.length / 2; i++) {
            char first = s[i];
            char second = s[s.length-(i+1)];
            s[i] = second;
            s[s.length-(i+1)] = first;
        }
    }
}
