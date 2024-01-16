package P2744;

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        if (words.length == 1) return 0;
        int pairsCounter = 0;

        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                StringBuilder reversedString = new StringBuilder();
                for (int k = words[j].length()-1; k >= 0; k--) {
                    reversedString.append(words[j].charAt(k));
                }
                if (words[i].contentEquals(reversedString)) pairsCounter++;
            }
        }
        return pairsCounter;
    }
}
