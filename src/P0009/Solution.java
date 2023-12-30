package P0009;

class Solution {
    public boolean isPalindrome(int x) {

        boolean isPalindrome = false;
        if (x >= 0 && x <= 9) isPalindrome = true;
        else {
            String x_string = Integer.toString(x);
            String[] chars = x_string.split("");
            for (int i = 0; i < chars.length / 2; i++) {
                if (chars[i].equals(chars[chars.length - (i+1)])) {
                    isPalindrome = true;
                } else {
                    isPalindrome = false;
                    break;
                }
            }
        }
        return isPalindrome;
    }
}
