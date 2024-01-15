package P1967;

class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int counter = 0;

        for (String pattern : patterns) {
            if (word.contains(pattern)) {
                counter++;
            }
        }

        return counter;
    }
}