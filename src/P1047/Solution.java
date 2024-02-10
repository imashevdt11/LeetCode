package P1047;

class Solution {
    public String removeDuplicates(String s) {
        if (s.length() > 20_000) return "";
        StringBuilder stringBuilder = new StringBuilder(s);

        int index = 1;
        while (index != stringBuilder.length()) {
            if (stringBuilder.isEmpty()) return "";
            if (stringBuilder.charAt(index) == stringBuilder.charAt(index-1)) {
                stringBuilder.delete(index-1, index+1);
                index = 1;
            } else index++;
        }
        return String.valueOf(stringBuilder);
    }
}
