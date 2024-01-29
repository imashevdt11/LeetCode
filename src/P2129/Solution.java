package P2129;

class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder capitalizedTitle = new StringBuilder();

        for (int i = 0; i < title.length(); i++) {
            StringBuilder word = new StringBuilder();
            word.append(Character.toLowerCase(title.charAt(i)));
            for (int j = i+1; j < title.length(); j++) {
                if (title.charAt(j) == ' ') {
                    i = j;
                    break;
                } else word.append(Character.toLowerCase(title.charAt(j)));
                if (j == title.length()-1) i = j;
            }
            if (word.length() > 2) {
                word.replace(0, 1, String.valueOf(Character.toUpperCase(word.charAt(0))));
            }
            capitalizedTitle.append(word);
            word.delete(0, word.length());
            if (i != title.length()-1) capitalizedTitle.append(" ");
        }
        return String.valueOf(capitalizedTitle);
    }
}
