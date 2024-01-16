package P1844;

class Solution {
    public String replaceDigits(String s) {
        String digits = "0123456789";
        StringBuilder modifiedString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (digits.contains(Character.toString(s.charAt(i)))) {
                char nextChar = (char) (s.charAt(i-1) + Integer.parseInt(String.valueOf(s.charAt(i))));
                modifiedString.append(nextChar);
            }
            else modifiedString.append(s.charAt(i));
        }
        return modifiedString.toString();
    }
}