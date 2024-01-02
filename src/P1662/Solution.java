package P1662;

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        boolean isEqual = false;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < word1.length; i++)
            word1[i] = word1[i].toLowerCase();
        for (int i = 0; i < word2.length; i++)
            word2[i] = word2[i].toLowerCase();
        for (String s : word1) sb1.append(s);
        for (String s : word2) sb2.append(s);
        if (sb1.isEmpty() || sb2.isEmpty()) {
            return isEqual;
        } else {
            if (sb1.toString().contentEquals(sb2)) {
                isEqual = true;
            }
        }
        return isEqual;
    }
}
