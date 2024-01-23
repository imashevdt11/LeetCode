package P2299;

class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if (password.length() < 8) return false;

        boolean isLowerCase = false;
        boolean isUpperCase = false;
        boolean isDigit = false;
        boolean isSpecialSymbol = false;
        String numbers = "0123456789";
        String specialSymbols = "!@#$%^&*()-+";

        for (int i = 0; i < password.length(); i++) {
            if (i > 0) {
                if (password.charAt(i) == password.charAt(i - 1)) return false;
            }
            if (password.charAt(i) >= 97 && password.charAt(i) <= 122) isLowerCase = true;
            if (password.charAt(i) >= 65 && password.charAt(i) <= 90) isUpperCase = true;
            if (numbers.contains(password.substring(i, i + 1))) isDigit = true;
            if (specialSymbols.contains(password.substring(i, i + 1))) isSpecialSymbol = true;
        }

        return isLowerCase && isUpperCase && isDigit && isSpecialSymbol;
    }
}
